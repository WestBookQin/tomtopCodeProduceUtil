package ${entityDaoServicePackageName};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ${entityPackageDao}.${entitySimpleName};
import ${baseServicePackageName}.${baseServiceSimpleName};
import ${entityDaoPackageName}.${entitySimpleName}Dao${versionSuffix};

@Controller
@RequestMapping("${modelName}/${entitySimpleName}")
public class ${entitySimpleName}Service${versionSuffix} extends ${baseServiceSimpleName}<${entitySimpleName}, ${primaryKeyType}> {
	
	//注入dao时，指定类型和名称
	@Autowired
	@Qualifier("${entitySimpleNameFirstLowerCase}Dao${versionSuffix}")
	public void setCommonDaoInter(${entitySimpleName}Dao${versionSuffix} ${entitySimpleNameFirstLowerCase}Dao) {
		super.setCommonDaoInter(${entitySimpleNameFirstLowerCase}Dao);
	}
}
<#--
package com.tomtop.application.dao.service.wish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomtop.application.base.service.BaseService;
import com.tomtop.application.dao.wish.MyWishListDao_V1;
import com.tomtop.application.orm.MyWishList;

@Controller
@RequestMapping("sale/MyWishList")
public class MyWishListService_V1 extends BaseService<MyWishList, Integer>{

		//注入dao时，指定类型和名称
		@Autowired
		@Qualifier("myWishListDao_V1")
		public void setCommonDaoInter(MyWishListDao_V1 myWishListDao_V1) {
			super.setCommonDaoInter(myWishListDao_V1);
		}
		
}
-->
