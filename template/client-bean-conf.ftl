
<#list entityTemplateList as entity>
	<bean id="${entity.entitySimpleNameFirstLowerCase}DaoClient" class="${entity.entityServiceClientPackageName}.${entity.entitySimpleName}DaoClient"/>
</#list>