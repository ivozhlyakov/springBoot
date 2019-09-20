<#import "parts/common.ftl" as common>

<@common.page>
    <table>
        <tr>
            <div style="margin-top:30px">
                <td>
                    <form method="get" action="/main">
                        <select size="10" multiple name="operType">
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
                </td>
                <td align="right">
                    <div>
                        <table class="table table-striped" style="width:100%">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>ENUM_SYSNAME</th>
                                <th>SYSNAME</th>
                                <th>NAME</th>
                            </tr>
                            </thead>
                            <#list taxenum as en>
                                <tr>
                                    <td>${en.id}</td>
                                    <td>${en.enumSysName}</td>
                                    <td>${en.sysName}</td>
                                    <td>${en.name}</td>
                                </tr>
                            <#else>
                                <tr>
                                    <td colspan="4">Non Selected!!!</td>
                                </tr>
                            </#list>
                        </table>
                    </div>
                </td>
            </div>
        </tr>
    </table>
</@common.page>