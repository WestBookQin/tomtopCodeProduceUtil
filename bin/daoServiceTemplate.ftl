package ${entityDaoServicePackageName};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ${entityFullName};
import ${baseServicePackageName}.${baseServiceSimpleName};
import ${entityDaoPackageName}.${entitySimpleName}Dao;

@Controller
@RequestMapping("${modelName}/${entitySimpleName}")
public class ${entitySimpleName}Service extends BaseService<${entitySimpleName}, ${primaryKeyType}> {
	
	//注入dao时，指定类型和名称
	@Autowired
	@Qualifier("${entitySimpleNameFirstLowerCase}Dao")
	public void setCommonDaoInter(${entitySimpleName}Dao ${entitySimpleNameFirstLowerCase}Dao) {
		super.setCommonDaoInter(${entitySimpleNameFirstLowerCase}Dao);
	}
}