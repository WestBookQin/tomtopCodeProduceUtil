package test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import entity.EntityTemplate;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class CommonCodeGenerator {
	
	private static String mainProjectRootDir;
	private static String daoProjectRootDir;
	private static boolean isOverride = false;

	public static void main(String[] args) {

		try {
			String[] simpleNames = { "MyWishList", "WishAcceptableAttributeValue" };
			List<EntityTemplate> entityTemplateList = initEntityTemplate(simpleNames);
			if (null == entityTemplateList) {
				return;
			}
			String templateFilePath = getTemplateFilePath();
			if (null == templateFilePath ) {
				log("error == 》templateFilePath is null !!!");
			}
			log("模版文件存放位置= = 》" + templateFilePath);
			for (EntityTemplate entityTemplate : entityTemplateList) {
				doIt(templateFilePath, entityTemplate, "daoTemplate.ftl", getAbsoluteDaoClassFileName(entityTemplate));
				doIt(templateFilePath, entityTemplate, "daoServiceTemplate.ftl", getAbsoluteServiceClassFileName(entityTemplate));
				doIt(templateFilePath, entityTemplate, "servicClientTemplate.ftl", getAbsoluteClientClassFileName(entityTemplate));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建一个Configuration实例 ,设置FreeMarker的模版文件夹位置
	 */
	public static Configuration getConfiguration(String templateFilePath) throws Exception {
		// 创建一个Configuration实例
		Configuration cfg = new Configuration();
		// 设置FreeMarker的模版文件夹位置
		cfg.setDirectoryForTemplateLoading(new File(templateFilePath));
		return cfg;
	}

	/**
	 * 根据配置创建一个模版对象
	 */
	public static Template getTemplate(Configuration cfg, String templateName) throws Exception {
		return cfg.getTemplate(templateName);
	}

	/**
	 * 将结果写入文件中
	 */
	public static File processResultToFile(Object result, Template template, String filePath) throws Exception {
		File file = new File(filePath);
		if (file.exists() && !isOverride) {
			log(filePath + " 已经存在了 = = ！放弃覆盖。");
			return null;
		} else {
			if (file.exists()) {
				log(filePath + " 覆盖文件");
			}else {
				log(filePath + " 创建文件");
			}
			file.createNewFile();
		}
		template.process(result, new OutputStreamWriter(new FileOutputStream(file)));
		log(filePath + " 写入完成");
		return file;

	}

	public static void processResultToConsole(Object result, Template template) throws Exception {
		template.process(result, new OutputStreamWriter(System.out));
	}

	public static String firstCharacterToLowerCase(String str) {

		if (str != null) {
			char[] charArray = str.toCharArray();
			if (charArray.length > 0) {
				charArray[0] = (charArray[0] + "").toLowerCase().toCharArray()[0];
				return String.valueOf(charArray);
			}
		}
		return "";
	}

	public static void doIt(String templateFilePath, Object result, String templateName, String outputFileName) {
		try {
			Configuration configuration = getConfiguration(templateFilePath);
			Template template = getTemplate(configuration, templateName);
			// processResultToConsole(result, template);
			processResultToFile(result, template, outputFileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static List<EntityTemplate> initEntityTemplate(String... simpleNames) throws Exception {
		if (simpleNames == null || simpleNames.length == 0) {
			log("initEntityTemplate ：需要传入实体名称！！！");
			return Collections.EMPTY_LIST;
		}
		log("start to laod configeration properties");
		String filePath = "config.properties";
		Properties props = new Properties();
		InputStream in = new BufferedInputStream(CommonCodeGenerator.class.getClassLoader().getResourceAsStream(filePath));
		props.load(in);
		mainProjectRootDir = props.getProperty("main.project.root.dir");
		log("主项目的根目录 = =》" + mainProjectRootDir);
		daoProjectRootDir = props.getProperty("dao.project.root.dir");
		log("Dao项目的根目录 = =》" + daoProjectRootDir);
		String tmep = props.getProperty("is.override");
		if (null != tmep) {
			isOverride = Boolean.valueOf(tmep).booleanValue();
		}
		log("若文件已存在是否覆盖 = =》" + isOverride);
		String entityPackageNameOfDaoProject = props.getProperty("entity.package.name.of.dao.project");
		String entityPackageNameOfMainProject = props.getProperty("entity.package.name.of.main.project");
		String modelName = props.getProperty("model.name");
		String daoServiceCode = props.getProperty("dao.service.code");
		String daoPackageName = props.getProperty("entity.dao.package.name");
		String daoServicePackageName = props.getProperty("entity.dao.service.package.name");
		String serviceClientPackageName = props.getProperty("entity.service.client.package.name");
		String versionSuffix = props.getProperty("version.suffix");
		log("Loading configuration complete >~<!");
		EntityTemplate entityTemplate = null;
		List<EntityTemplate> list = new ArrayList<EntityTemplate>(simpleNames.length);
		for (String simpleName : simpleNames) {

			entityTemplate = new EntityTemplate();
			entityTemplate.setVersionSuffix(versionSuffix);
			entityTemplate.setModelName(modelName);
			entityTemplate.setServiceToken(daoServiceCode);

			String entitySimpleNameFirstLowerCase = firstCharacterToLowerCase(simpleName);
			entityTemplate.setEntitySimpleName(simpleName);
			entityTemplate.setEntitySimpleNameFirstLowerCase(entitySimpleNameFirstLowerCase);
			entityTemplate.setEntityPackageDao(entityPackageNameOfDaoProject);
			entityTemplate.setEntityPackageMain(entityPackageNameOfMainProject);

			entityTemplate.setEntityDaoPackageName(daoPackageName);
			entityTemplate.setEntityDaoServicePackageName(daoServicePackageName);
			entityTemplate.setEntityServiceClientPackageName(serviceClientPackageName);

			list.add(entityTemplate);
		}
		log("initEntityTemplate is completed .");
		return list;
	}

	private static String getTemplateFilePath() {
		String filePath = "daoTemplate.ftl";
		String tempPath = CommonCodeGenerator.class.getClassLoader().getResource(filePath).getPath();
		return tempPath.substring(0, tempPath.lastIndexOf("/"));
	}

	public static final String SRC_MAIN_JAVA = File.separator+"src"+File.separator+"main"+File.separator+"java";

	/**
	 * eg:C:\Users\lenovo\Desktop\tomtoperpWish-dao\src\main\java\com\tomtop\application\dao\wish\MyWishListDao_V1.java
	 */
	private static String getAbsoluteDaoClassFileName(EntityTemplate entityTemplate) {

		return new StringBuilder(daoProjectRootDir)
							.append(SRC_MAIN_JAVA).append(File.separator)
							.append(entityTemplate.getEntityDaoPackageName().replace(".", File.separator))
							.append(File.separator).append(entityTemplate.getDaoClassFileName()).toString();
	}

	private static String getAbsoluteServiceClassFileName(EntityTemplate entityTemplate) {
		return new StringBuilder(daoProjectRootDir).append(SRC_MAIN_JAVA).append(File.separator).append(entityTemplate.getEntityDaoServicePackageName().replace(".", File.separator))
				.append(File.separator).append(entityTemplate.getServiceClassFileName()).toString();
	}

	private static String getAbsoluteClientClassFileName(EntityTemplate entityTemplate) {
		return new StringBuilder(mainProjectRootDir).append(SRC_MAIN_JAVA).append(File.separator).append(entityTemplate.getEntityServiceClientPackageName().replace(".", File.separator))
				.append(File.separator).append(entityTemplate.getServiceClientClassFileName()).toString();
	}

	public static void log(String msg) {
		System.out.println("==========================================================================");
		System.out.println("[common-code-generator] :: " + msg);
		System.out.println("==========================================================================");
	}

}