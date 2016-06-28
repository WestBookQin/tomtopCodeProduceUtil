package ${entityDaoPackageName};

import org.springframework.stereotype.Repository;

import ${baseMongoDaoPackageName}.${baseMongoDaoSimpleName};
import ${entityFullName};

@Repository("${entitySimpleNameFirstLowerCase}Dao")
public class ${entitySimpleName}Dao extends BaseMongoDao<${entitySimpleName}, ${primaryKeyType}> {

}