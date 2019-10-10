<#import "pages.ftl" as p>

<@p.pages page url />

<div>
            <table class="table table-striped" style="width:100%">
                <#list page.content as oper>
                    <tr>
                        <td>${oper.id}</td>
                        <td>${oper.number}</td>
                        <td>${oper.type}</td>
                    </tr>
                    </#list>
            </table>
</div>


<@p.pages page url/>