<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<div id="forum_pagination" class="forum_pagination">
    <div class="forum_pagination_page">
    <#if page??>
        <span class="myspan007">${page.currentPage}/${page.pageCount}</span>
        <a class="mya001" href="${projectIp+page.pageUrl}1.html">首页</a>

        <#if ((page.pageCount) <= 11) >
            <#list 1..(page.pageCount) as index_page>
                <#if (page.currentPage) == index_page >
                    <a class="mya001 mya004" href="${projectIp+page.pageUrl}${index_page}.html">${index_page}</a>
                <#else>
                    <a class="mya001" href="${projectIp+page.pageUrl}${index_page}.html">${index_page}</a>
                </#if>
            </#list>

        <#elseif ((page.pageCount) > 11)>
            <#if (((page.currentPage)+5) > (page.pageCount))>

                <#list (10-page.pageCount+page.currentPage)..1 as index_page>
                    <a class="mya001" href="${projectIp+page.pageUrl}${page.currentPage - index_page}.html">${page.currentPage - index_page}</a>
                </#list>
                <a class="mya001 mya004" href="${projectIp+page.pageUrl}${page.currentPage}.html">${page.currentPage}</a>

                <#if ((page.pageCount-page.currentPage) > 0)>
                    <#list 1..(page.pageCount-page.currentPage) as index_page>
                        <a class="mya001" href="${projectIp+page.pageUrl}${page.currentPage + index_page}.html">${page.currentPage + index_page}</a>
                    </#list>
                </#if>

            <#elseif (((page.currentPage)-5) > 1)>

                <#list 5..1 as index_page>
                    <a class="mya001" href="${projectIp+page.pageUrl}${page.currentPage - index_page}.html">${page.currentPage - index_page}</a>
                </#list>

                <a class="mya001 mya004" href="${projectIp+page.pageUrl}${page.currentPage}.html">${page.currentPage}</a>

                <#list 1..5 as index_page>
                    <#if ((page.currentPage) + index_page  <= (page.pageCount))>
                        <a class="mya001" href="${projectIp+page.pageUrl}${page.currentPage + index_page}.html">${page.currentPage + index_page}</a>
                    </#if>
                </#list>
            <#else>

                <#list 1..11 as index_page>
                    <#if (page.currentPage) == index_page>
                        <a class="mya001 mya004" href="${projectIp+page.pageUrl}${page.currentPage}.html">${page.currentPage}</a>

                    <#else>
                        <a class="mya001" href="${projectIp+page.pageUrl}${index_page}.html">${index_page}</a>

                    </#if>

                </#list>


            </#if>


        </#if>
        <a class="mya001" href="${projectIp+page.pageUrl+page.pageCount}.html">末页</a>
    </#if>
    </div>
</div>
</body>
</html>