package entity;

/**
 * @author lenovo
 *
 */
public class EntityTemplate {

	// BaseMongoDao BaseService ServiceClient 的 包名和 简单类名
	private String baseMongoDaoPackageName = "com.tomtop.application.wish.dao";
	private String baseMongoDaoSimpleName = "BaseMongoDao";
	private String baseServicePackageName = "com.tomtop.application.wish.service";
	private String baseServiceSimpleName = "BaseService";
	private String serviceClientPackageName = "com.tomtop.application.service.sale.wish";
	private String serviceClientSimpleName = "ServiceClient";
	private String serviceCodeAnnotationFullName = "com.tomtop.application.service.sale.wish.ServiceCode";
	private String modelNameAnnotationFullName = "com.tomtop.application.service.sale.wish.ModelName";

	// 是否需要引入BaseMongoDao BaseService ServiceClient
	private boolean needImportBaseMongoDao;
	private boolean needImportBaseService;
	private boolean needImportServiceClient;

	// 实体的包名和类名
	private String entityFullName;
	private String entitySimpleName;
	private String entityPackageMain;
	private String entityPackageDao;
	private String primaryKeyType = "Integer";
	// 实体名称首字母小写
	private String entitySimpleNameFirstLowerCase;

	// 实体的dao Service 和 ServiceClient的包名
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

	public String getServiceClientPackageName() {
		return serviceClientPackageName;
	}

	public String getServiceClientSimpleName() {
		return serviceClientSimpleName;
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

	public String getEntityFullName() {
		return entityFullName;
	}

	public void setEntityFullName(String entityFullName) {
		this.entityFullName = entityFullName;
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


}
