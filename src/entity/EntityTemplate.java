package entity;

/**
 * @author lenovo
 *
 */
public class EntityTemplate {

	private static final String SUFFIX_DOT_JAVA = ".java";
	// BaseMongoDao BaseService DaoServiceClient 的 包名和 简单类名
	private String baseMongoDaoPackageName = "com.tomtop.application.base.dao";
	private String baseMongoDaoSimpleName = "BaseMongoDao";
	private String baseServicePackageName = "com.tomtop.application.base.service";
	private String baseServiceSimpleName = "BaseService";
	private String baseDaoServiceClientPackageName = "com.tomtop.application.base.service.client";
	private String baseDaoServiceClientSimpleName = "DaoServiceClient";
	private String serviceCodeAnnotationFullName = "com.tomtop.application.base.service.client.ServiceCode";
	private String modelNameAnnotationFullName = "com.tomtop.application.base.service.client.ModelName";

	// 是否需要引入BaseMongoDao BaseService ServiceClient
	private boolean needImportBaseMongoDao;
	private boolean needImportBaseService;
	private boolean needImportServiceClient;

	// 实体的包名和类名
//	private String entityFullName;
	private String entitySimpleName; // 
	private String entityPackageMain;// main项目的实体包名
	private String entityPackageDao;// dao项目的实体包名
	private String primaryKeyType = "Integer";
	// 实体名称首字母小写
	private String entitySimpleNameFirstLowerCase;

	// 实体的Dao、 Service 和 ServiceClient的包名
	private String entityDaoPackageName;
	private String entityDaoServicePackageName;
	private String entityServiceClientPackageName;

	//edit 、popup 、main的 controller的包名
	private String editPackageName ;
	private String popupPackageName ;
	private String mainPackageName ;
	
	
	// 模块名称 和 环境变量的ServiceToken
	private String modelName;
	private String serviceToken;
	
	// 版本后缀
	private String versionSuffix = "";

	private String mainProjectRootDir;
	private String daoProjectRootDir;
	
	
	public void setServiceCodeAnnotationFullName(String serviceCodeAnnotationFullName) {
		this.serviceCodeAnnotationFullName = serviceCodeAnnotationFullName;
	}

	public void setModelNameAnnotationFullName(String modelNameAnnotationFullName) {
		this.modelNameAnnotationFullName = modelNameAnnotationFullName;
	}

	public String getMainProjectRootDir() {
		return mainProjectRootDir;
	}

	public void setMainProjectRootDir(String mainProjectRootDir) {
		this.mainProjectRootDir = mainProjectRootDir;
	}

	public String getDaoProjectRootDir() {
		return daoProjectRootDir;
	}

	public void setDaoProjectRootDir(String daoProjectRootDir) {
		this.daoProjectRootDir = daoProjectRootDir;
	}

	public String getVersionSuffix() {
		return versionSuffix;
	}

	public void setVersionSuffix(String versionSuffix) {
		this.versionSuffix = versionSuffix;
	}

	public String getEditPackageName() {
		return editPackageName;
	}

	public void setEditPackageName(String editPackageName) {
		this.editPackageName = editPackageName;
	}

	public String getPopupPackageName() {
		return popupPackageName;
	}

	public void setPopupPackageName(String popupPackageName) {
		this.popupPackageName = popupPackageName;
	}

	public String getMainPackageName() {
		return mainPackageName;
	}

	public void setMainPackageName(String mainPackageName) {
		this.mainPackageName = mainPackageName;
	}

	public String getBaseMongoDaoPackageName() {
		return baseMongoDaoPackageName;
	}

	public String getBaseMongoDaoSimpleName() {
		return baseMongoDaoSimpleName;
	}

	public String getBaseServicePackageName() {
		return baseServicePackageName;
	}

	public String getBaseServiceSimpleName() {
		return baseServiceSimpleName;
	}

	public String getServiceCodeAnnotationFullName() {
		return serviceCodeAnnotationFullName;
	}

	public String getModelNameAnnotationFullName() {
		return modelNameAnnotationFullName;
	}

	public boolean isNeedImportBaseMongoDao() {
		return needImportBaseMongoDao;
	}

	public void setNeedImportBaseMongoDao(boolean needImportBaseMongoDao) {
		this.needImportBaseMongoDao = needImportBaseMongoDao;
	}

	public boolean isNeedImportBaseService() {
		return needImportBaseService;
	}

	public void setNeedImportBaseService(boolean needImportBaseService) {
		this.needImportBaseService = needImportBaseService;
	}

	public boolean isNeedImportServiceClient() {
		return needImportServiceClient;
	}

	public void setNeedImportServiceClient(boolean needImportServiceClient) {
		this.needImportServiceClient = needImportServiceClient;
	}

	public String getEntitySimpleName() {
		return entitySimpleName;
	}

	public void setEntitySimpleName(String entitySimpleName) {
		this.entitySimpleName = entitySimpleName;
	}

	public String getEntityPackageMain() {
		return entityPackageMain;
	}

	public void setEntityPackageMain(String entityPackageMain) {
		this.entityPackageMain = entityPackageMain;
	}

	public String getEntityPackageDao() {
		return entityPackageDao;
	}

	public void setEntityPackageDao(String entityPackageDao) {
		this.entityPackageDao = entityPackageDao;
	}

	public String getPrimaryKeyType() {
		return primaryKeyType;
	}

	public void setPrimaryKeyType(String primaryKeyType) {
		this.primaryKeyType = primaryKeyType;
	}

	public String getEntitySimpleNameFirstLowerCase() {
		return entitySimpleNameFirstLowerCase;
	}

	public void setEntitySimpleNameFirstLowerCase(String entitySimpleNameFirstLowerCase) {
		this.entitySimpleNameFirstLowerCase = entitySimpleNameFirstLowerCase;
	}

	public String getEntityDaoPackageName() {
		return entityDaoPackageName;
	}

	public void setEntityDaoPackageName(String entityDaoPackageName) {
		this.entityDaoPackageName = entityDaoPackageName;
	}

	public String getEntityDaoServicePackageName() {
		return entityDaoServicePackageName;
	}

	public void setEntityDaoServicePackageName(String entityDaoServicePackageName) {
		this.entityDaoServicePackageName = entityDaoServicePackageName;
	}

	public String getEntityServiceClientPackageName() {
		return entityServiceClientPackageName;
	}

	public void setEntityServiceClientPackageName(String entityServiceClientPackageName) {
		this.entityServiceClientPackageName = entityServiceClientPackageName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getServiceToken() {
		return serviceToken;
	}

	public void setServiceToken(String serviceToken) {
		this.serviceToken = serviceToken;
	}

	
	//==================================
	
	public String getBaseDaoServiceClientPackageName() {
		return baseDaoServiceClientPackageName;
	}

	public void setBaseDaoServiceClientPackageName(String baseDaoServiceClientPackageName) {
		this.baseDaoServiceClientPackageName = baseDaoServiceClientPackageName;
	}

	public String getBaseDaoServiceClientSimpleName() {
		return baseDaoServiceClientSimpleName;
	}

	public void setBaseDaoServiceClientSimpleName(String baseDaoServiceClientSimpleName) {
		this.baseDaoServiceClientSimpleName = baseDaoServiceClientSimpleName;
	}

	public void setBaseMongoDaoPackageName(String baseMongoDaoPackageName) {
		this.baseMongoDaoPackageName = baseMongoDaoPackageName;
	}

	public void setBaseMongoDaoSimpleName(String baseMongoDaoSimpleName) {
		this.baseMongoDaoSimpleName = baseMongoDaoSimpleName;
	}

	public void setBaseServicePackageName(String baseServicePackageName) {
		this.baseServicePackageName = baseServicePackageName;
	}

	public void setBaseServiceSimpleName(String baseServiceSimpleName) {
		this.baseServiceSimpleName = baseServiceSimpleName;
	}

	public String getDaoClassName() {
		return entitySimpleName+"Dao" +this.versionSuffix;
	}
	public String getServiceClassName() {
		
		return entitySimpleName+"Service" +this.versionSuffix;
	}
	public String getServiceClientClassName() {
		
//		return entitySimpleName+"DaoClient" +this.versionSuffix;
		return entitySimpleName+"DaoClient";
	}

	public String getDaoClassFileName() {
		return entitySimpleName+"Dao" +this.versionSuffix+SUFFIX_DOT_JAVA;
	}
	public String getServiceClassFileName() {
		
		return entitySimpleName+"Service" +this.versionSuffix+SUFFIX_DOT_JAVA;
	}
	public String getServiceClientClassFileName() {
		
//		return entitySimpleName+"DaoClient" +this.versionSuffix+SUFFIX_DOT_JAVA;
		return entitySimpleName+"DaoClient"+SUFFIX_DOT_JAVA;
	}

}
