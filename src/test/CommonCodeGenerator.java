package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import entity.EntityTemplate;
import freemarker.template.Configuration;
import freemarker.template.Template;


public class CommonCodeGenerator {
	
	
        /**
         * 创建一个Configuration实例 ,设置FreeMarker的模版文件夹位置 
         * @param templateFilePath
         * @return
         */
        public static Configuration getConfiguration(String templateFilePath) throws Exception {
        	 //创建一个Configuration实例 
        	Configuration cfg = new Configuration(); 
        	//设置FreeMarker的模版文件夹位置 
        	cfg.setDirectoryForTemplateLoading(new File(templateFilePath));
        	return cfg;
        }

        /**
         * 根据配置创建一个模版对象
         * @param cfg
         * @param templateName
         * @return
         * @throws Exception
         */
        public static Template getTemplate(Configuration cfg, String templateName) throws Exception{
        	return cfg.getTemplate(templateName); 
        }
        
        /**
         * 将结果写入文件中
         * @param result
         * @param template
         * @param filePath
         * @return
         * @throws Exception
         */
        public static File processResultToFile(Object result, Template template, String filePath) throws Exception{
        	File file = new File(filePath);
        	if (!file.exists()) {
        		file.createNewFile();
        	}
        	template.process(result, new OutputStreamWriter(new FileOutputStream(file)));
        	return file;
        	
        }
        
        public static void processResultToConsole(Object result, Template template) throws Exception{
        	template.process(result, new OutputStreamWriter(System.out)); 
        }
        
        public static String getEntitySimpleName (String entityFullName) {
        	
        	if (null != entityFullName && entityFullName.contains(".")) {
        		return entityFullName.substring(entityFullName.lastIndexOf(".")+1,entityFullName.length());
        	}
        	
        	return "";
        }
        
        
        public static String getEntityPackageName (String entityFullName) {
	        	
        	if (null != entityFullName &&entityFullName.contains(".")) {
        		return entityFullName.substring(0,entityFullName.lastIndexOf("."));
        	}
        	
        	return "";
        }
        
        public static String firstCharacterToLowerCase(String str) {
        	
        	if (str != null) {
        		char[] charArray = str.toCharArray();
        		if (charArray.length >0) {
        			charArray[0] = (charArray[0]+"").toLowerCase().toCharArray()[0];
        			return String.valueOf(charArray);
        		}
        	}
        	return "";
        }
        
        public static void  doIt(String templateFilePath,Object result ,String templateName,String outputFileName) {
        	try {
				Configuration configuration = getConfiguration(templateFilePath);
				Template template = getTemplate(configuration, templateName);
				processResultToConsole(result, template);
				
				processResultToFile(result, template, outputFileName);
        	} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        
        public static void generate(String entitySimpleName) {
        	EntityTemplate entityTemplate = new EntityTemplate();
        	// 实体的包名和类名
//        	 String entityFullName = "com.tomtop.application.orm.WishStockShippingCode";
        	 
        	 String entitySimpleNameFirstLowerCase = firstCharacterToLowerCase(entitySimpleName);
        	 
        	 entityTemplate.setEntityPackageDao("com.tomtop.application.orm");
        	 entityTemplate.setEntityPackageMain("com.tomtop.application.orm.sale");
        	 entityTemplate.setEntitySimpleName(entitySimpleName);
        	 entityTemplate.setEntitySimpleNameFirstLowerCase(entitySimpleNameFirstLowerCase);
        	 
        	 entityTemplate.setModelName("sale");
        	 entityTemplate.setServiceToken("WISH_DAO");
        	 String entityDaoPackageName = "com.tomtop.application.dao.wish";          
        	 String entityDaoServicePackageName = "com.tomtop.application.dao.service.wish";   
        	 String entityServiceClientPackageName= "com.tomtop.application.service.sale.wish";
        	 String editPackageName = "com.tomtop.application.action.mongo.sale.wish";
        	 String popupPackageName="com.tomtop.application.action.mongo.sale.wish";
        	 String mainPackageName ="com.tomtop.application.action.sale.wish";
        	 
        	 String projectDir = ""; // maven project
        	 
        	 
        	 entityTemplate.setEntityDaoPackageName(entityDaoPackageName);
        	 entityTemplate.setEntityDaoServicePackageName(entityDaoServicePackageName);
        	 entityTemplate.setEntityServiceClientPackageName(entityServiceClientPackageName);
        	 entityTemplate.setEditPackageName(editPackageName);
        	 entityTemplate.setPopupPackageName(popupPackageName);
        	 entityTemplate.setMainPackageName(mainPackageName);
        	 entityTemplate.setVersionSuffix("_V1");
        	 doIt("E:\\worksp\\common-code-generator\\template",entityTemplate,"daoServiceTemplate.ftl","D:\\"+entityTemplate.getServiceClassFileName());
        	 doIt("E:\\worksp\\common-code-generator\\template",entityTemplate,"daoTemplate.ftl","D:\\"+entityTemplate.getDaoClassFileName());
        	 doIt("E:\\worksp\\common-code-generator\\template",entityTemplate,"servicClientTemplate.ftl","D:\\"+entityTemplate.getServiceClientClassFileName());
//        	 doIt("E:\\worksp\\common-code-generator\\template",entityTemplate,"mainPage.ftl","D:\\Manage"+entitySimpleName+".java");
//        	 doIt("E:\\worksp\\common-code-generator\\template",entityTemplate,"editPage.ftl","D:\\Edit"+entitySimpleName+".java");
//        	 doIt("E:\\worksp\\common-code-generator\\template",entityTemplate,"popupPage.ftl","D:\\Popup"+entitySimpleName+".java");
//        	 doIt("E:\\worksp\\common-code-generator\\template",entityTemplate,"configTemplate.ftl","D:\\"+entitySimpleName+"-comomCfg.txt");

        }
    
        public static void main(String[] args) {
        	
//        	generate("com.tomtop.application.orm.WishShippingCodeRules");
//        	generate("com.tomtop.application.orm.WishShippingCodeGroups");
//        	generate("com.tomtop.application.orm.WishCountryToErpCountry");
        	generate("WishAccountServerConfig");
        	
        }

        
        
}