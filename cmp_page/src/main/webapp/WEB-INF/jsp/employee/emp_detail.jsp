<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <title>职员详细信息</title>
</head>
<body>
<div class="cl pd-20" style=" background-color:#5bacb6">
    <img class="avatar size-XL l" src="${pro}/resources/uploads/headImage/${employee.emphead}">
    <dl style="margin-left:80px; color:#fff">
        <dt>
            <span class="f-18">${employee.empname}</span>
            <span class="pl-10 f-12">登录名：${employee.loginname}</span>
        </dt>
        <dd class="pt-10 f-12" style="margin-left:0">
            <c:if test="${empty employee.empdesc or employee.empdesc ==''}">这家伙很懒，什么也没有留下</c:if>
            ${employee.empdesc}
        </dd>
    </dl>
</div>
<div class="pd-20">
    <table class="table">
        <tbody>
        <tr>
            <th class="text-r" width="80">性别：</th>
            <td>
                <c:if test="${employee.empsex == 1}">男</c:if>
                <c:if test="${employee.empsex == 0}">女</c:if>
            </td>
        </tr>
        <tr>
            <th class="text-r" width="80">角色：</th>
            <td>
                <c:if test="${employee.emprole == 1}">超级管理员</c:if>
                <c:if test="${employee.emprole == 2}">校长</c:if>
                <c:if test="${employee.emprole == 3}">教员</c:if>
                <c:if test="${employee.emprole == 4}">班主任</c:if>
            </td>
        </tr>
        <tr>
            <th class="text-r">出生日期：</th>
            <td><fmt:formatDate value="${employee.empbirth}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <th class="text-r">入职日期：</th>
            <td><fmt:formatDate value="${employee.empentrytime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <th class="text-r">手机：</th>
            <td>${employee.empphone}</td>
        </tr>
        <tr>
            <th class="text-r">住址：</th>
            <td>
                <c:if test="${empty employee.empaddress or employee.empaddress ==''}">未填写</c:if>
                ${employee.empaddress}
            </td>
        </tr>
        <tr>
            <th class="text-r">QQ：</th>
            <td>
                <c:if test="${empty employee.empqq or employee.empqq ==''}">未填写</c:if>
                ${employee.empqq}
            </td>
        </tr>
        <tr>
            <th class="text-r">邮箱：</th>
            <td>
                <c:if test="${empty employee.empemail or employee.empemail ==''}">未填写</c:if>
                ${employee.empemail}
            </td>
        </tr>
        <tr>
            <th class="text-r">学历：</th>
            <td>
                <c:if test="${empty employee.empmajor or employee.empmajor ==''}">未填写</c:if>
                ${employee.empmajor}
            </td>
        </tr>
        <tr>
            <th class="text-r">状态：</th>
            <td>
                <c:if test="${employee.empstauts == 0}">离职</c:if>
                <c:if test="${employee.empstauts == 1}">在职</c:if>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
