<!-- acl -->
<manage.${entitySimpleName?lower_case} link="/sale/manage${entitySimpleName}">
	<acl>
		<edit link="/${modelName}/edit${entitySimpleName}" />
		<save link="/${modelName}/save${entitySimpleName}" />
		<delete link="/${modelName}/delete${entitySimpleName}"/>
	</acl>
</manage.${entitySimpleName?lower_case}>

<!-- package_cn.properties-->
manage.${entitySimpleName?lower_case}=#####


<!-- structs config -->
<action name="manage${entitySimpleName}" class="${mainPackageName}.Manage${entitySimpleName}">
	<result name="success">/design/template/page/1column-main.ftl</result>
</action>

<!-- editPage -->
<action name="edit${entitySimpleName}" class="${editPackageName}.Edit${entitySimpleName}" method="edit${entitySimpleName}">
	<result>/design/template/edit.ftl</result>
	<result name="input">/design/template/page/ajax/failure.ftl</result>
</action> 
<action name="save${entitySimpleName}" class="${editPackageName}.Edit${entitySimpleName}" method="save${entitySimpleName}">
	<result name="success">/design/template/page/ajax/success.ftl</result>
	<result name="input">/design/template/page/ajax/failure.ftl</result>
</action>
<action name="delete${entitySimpleName}" class="${editPackageName}.Edit${entitySimpleName}" method="delete${entitySimpleName}">
	<result name="success">/design/template/page/ajax/success.ftl</result>
	<result name="input">/design/template/page/ajax/failure.ftl</result>
</action>

<!-- popupPage -->
<action name="edit${entitySimpleName}" class="${popupPackageName}.Popup${entitySimpleName}" method="edit${entitySimpleName}">
	<result>/design/template/edit.ftl</result>
	<result name="input">/design/template/page/ajax/failure.ftl</result>
</action> 
<action name="save${entitySimpleName}" class="${popupPackageName}.Popup${entitySimpleName}" method="save${entitySimpleName}">
	<result name="success">/design/template/page/ajax/success.ftl</result>
	<result name="input">/design/template/page/ajax/failure.ftl</result>
</action>
<action name="delete${entitySimpleName}" class="${popupPackageName}.Popup${entitySimpleName}" method="delete${entitySimpleName}">
	<result name="success">/design/template/page/ajax/success.ftl</result>
	<result name="input">/design/template/page/ajax/failure.ftl</result>
</action>

