package ${entityDaoPackageName};

import org.springframework.stereotype.Repository;

import ${baseMongoDaoPackageName}.${baseMongoDaoSimpleName};
import ${entityPackageDao}.${entitySimpleName};

@Repository("${entitySimpleNameFirstLowerCase}Dao${versionSuffix}")
public class ${entitySimpleName}Dao${versionSuffix} extends ${baseMongoDaoSimpleName}<${entitySimpleName}, ${primaryKeyType}>{

}
<#-- eg:
package com.tomtop.application.dao.wish;

import org.springframework.stereotype.Repository;

import com.tomtop.application.base.dao.BaseMongoDao;
import com.tomtop.application.orm.MyWishList;

@Repository("myWishListDao_V1")
public class MyWishListDao_V1 extends BaseMongoDao<MyWishList, Integer>{

}
-->
