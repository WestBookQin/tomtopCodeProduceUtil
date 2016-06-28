package ${mainPackageName};

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

import com.tomtop.system.core.page.MainPage;
import ${entityServiceClientPackageName}.${entitySimpleName}DaoClient;

public class Manage${entitySimpleName} extends MainPage {

	private static final long serialVersionUID = 1L;
	private ${entitySimpleName}DaoClient ${entitySimpleNameFirstLowerCase}DaoClient = new ${entitySimpleName}DaoClient();
	
	public String execute() throws Exception {
		_execute();
		Map<String, Object> result = ${entitySimpleNameFirstLowerCase}DaoClient.findEntityCollection();
		if  (MapUtils.isNotEmpty(result)) {
			setCollection(list);
			setCollectionCount(result.get("collectionCount"));
		}else {
			setCollection(new ArrayList());
			setCollectionCount(0);
		}
		return SUCCESS;
	}
	
}
