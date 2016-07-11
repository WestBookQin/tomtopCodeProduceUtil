package ${entityServiceClientPackageName};

import ${baseDaoServiceClientPackageName}.${baseDaoServiceClientSimpleName};
import ${entityPackageMain}.${entitySimpleName};
import ${serviceCodeAnnotationFullName};
import ${modelNameAnnotationFullName};

@ServiceCode("${serviceToken}")
@ModelName("${modelName}")
public class ${entitySimpleName}DaoClient extends ${baseDaoServiceClientSimpleName}<${entitySimpleName}, ${primaryKeyType}> {

	private static final long serialVersionUID = 1L;

}
<#--
package com.tomtop.application.service.sale.wish;

import com.tomtop.application.base.service.client.DaoServiceClient;
import com.tomtop.application.base.service.client.ModelName;
import com.tomtop.application.base.service.client.ServiceCode;
import com.tomtop.application.orm.sale.MyWishList;

@ServiceCode("WISH_DAO")
@ModelName("sale")
public class MyWishListDaoClient extends DaoServiceClient<MyWishList, Integer> {

}
-->
