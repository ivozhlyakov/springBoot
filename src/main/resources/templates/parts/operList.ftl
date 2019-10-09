<#import "pages.ftl" as p>

<@p.pages page url />

<div>
            <table class="table table-striped" style="width:100%">
                <#list page.content as oper>
                    <tr>
                        <td>${oper.BASEOPERID}</td>
                        <td>${oper.CORPACTNUMBER}</td>
                        <td>${oper.SYSNAME}</td>
                    </tr>
                    </#list>
            </table>
</div>


<@p.pages page url/>