<#include "layout/header.ftl">
<!DOCTYPE html>
<html lang="cmn-Hans">
<@header title="freemarker"></@header>
<body>
<#list userList as username>
<#if username == "王五">
    <p>下面是王五</p>
</#if>
<p>${username}</p>
</#list>
</body>
</html>