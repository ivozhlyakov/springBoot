<#import "parts/common.ftl" as common>

<@common.page>
<form method="get" action="/main">
    <select size = "10" multiple name="operType">
        <option disabled>Select operation type</option>
        <#list objecttype as ot>
            <option>${ot.sysname}</option>
        </#list>
    </select>
    <button type="submit">Find</button>
</form>
<!--div>Список перечислений</div>
<form method="post" action="/enum">
    <input type="text" name="enumSysName">
    <button type="submit">Найти</button>
</form-->
<#list taxenum as en>
    <div>
        ${en.id}
        ${en.enumSysName}
        ${en.sysName}
        ${en.name}
    </div>
    <#else>
    Non Selected!!!
</#list>
</@common.page>