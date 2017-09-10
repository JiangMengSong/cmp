<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/10 0010
  Time: 8:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <title>学生详细信息</title>
</head>
<body>
<div class="cl pd-20" style=" background-color:#5bacb6">
    <img class="avatar size-XL l" src="${pro}/uploads/headImage/${student.stuhead}">
    <dl style="margin-left:80px; color:#fff">
        <dt>
            <span class="f-18">张三</span>
            <span class="pl-10 f-12">编号:${student.stucode}</span>
        </dt>
        <dd class="pt-10 f-12" style="margin-left:0">这家伙很懒，什么也没有留下</dd>
    </dl>
</div>
<div class="pd-20">
    <table class="table">
        <tbody>
        <tr>
            <th class="text-r" width="80">性别:</th>
            <td>
                <c:if test="${student.stusex == 1}">男</c:if>
                <c:if test="${student.stusex == 0}">女</c:if>
            </td>
        </tr>
        <tr>
            <th class="text-r" width="80">班级:</th>
            <td>${student.clazz.classname}</td>
        </tr>
        <tr>
            <th class="text-r">出生日期:</th>
            <td><fmt:formatDate value="${student.stubirth}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <th class="text-r">入学日期:</th>
            <td><fmt:formatDate value="${student.stubirth}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <th class="text-r">手机:</th>
            <td>${student.stuphone}</td>
        </tr>
        <tr>
            <th class="text-r">紧急联系电话:</th>
            <td>${student.stucontact}</td>
        </tr>
        <tr>
            <th class="text-r">积分:</th>
            <td>330</td>
        </tr>
        <tr>
            <th class="text-r">积分:</th>
            <td>330</td>
        </tr>
        <tr>
            <th class="text-r">积分:</th>
            <td>330</td>
        </tr>
        <tr>
            <th class="text-r">积分:</th>
            <td>330</td>
        </tr>
        <tr>
            <th class="text-r">积分:</th>
            <td>330</td>
        </tr>
        <tr>
            <th class="text-r">积分:</th>
            <td>330</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
