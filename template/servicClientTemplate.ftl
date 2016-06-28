package ${entityServiceClientPackageName};

import ${serviceClientPackageName}.${serviceClientSimpleName};
import ${entityPackageDao}.${entitySimpleName};
import ${serviceCodeAnnotationFullName};
import ${modelNameAnnotationFullName};

@ServiceCode("${serviceToken}")
@ModelName("${modelName}")
public class ${entitySimpleName}DaoClient extends ServiceClient<${entitySimpleName}, ${primaryKeyType}> {

	private static final long serialVersionUID = 1L;

}