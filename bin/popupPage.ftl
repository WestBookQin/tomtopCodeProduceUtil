package ${popupPackageName};

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

import com.google.gson.Gson;
import ${entityFullName};
import ${entityServiceClientPackageName}.${entitySimpleName}DaoClient;
import com.tomtop.system.core.page.PopupPage;

public class Popup${entitySimpleName} extends PopupPage {

	private static final long serialVersionUID = 1L;
	
	private String requestJson;
	private ${entitySimpleName} editEntity;
	private ${entitySimpleName}DaoClient ${entitySimpleNameFirstLowerCase}DaoClient = new ${entitySimpleName}DaoClient();
	
	public String edit${entitySimpleName}() {
		_execute();
		if (getId() != null) {
			setEntity(${entitySimpleNameFirstLowerCase}DaoClient.findEntityById(getId()));
		} else {
			setWaav(new ${entitySimpleName}());
		}
		return SUCCESS;
	}

	public String delete${entitySimpleName}() {
		Gson gson = new Gson();
		Map<String, String> request = gson.fromJson(requestJson, HashMap.class);
		Long id = null;
		if (MapUtils.isNotEmpty(request) 
				&& StringUtils.isNotBlank(request.get("id"))
				&& StringUtils.isNumeric(request.get("id"))) {
			id = Long.parseLong(request.get("id"));
		}
		if (id != null) {
			if (${entitySimpleNameFirstLowerCase}DaoClient.deleteEntityById(id)) {
				return SUCCESS;
			}
		}
		return INPUT;
	}

	public String save${entitySimpleName}() {
	
		// TODO
		return SUCCESS;
	}

	public ${entitySimpleName} getEditEntity() {
		return waav;
	}

	public void setEditEntity(${entitySimpleName} editEntity) {
		this.editEntity = editEntity;
	}

	public String getRequestJson() {
		return requestJson;
	}

	public void setRequestJson(String requestJson) {
		this.requestJson = requestJson;
	}

}
