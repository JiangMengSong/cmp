<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <title>学生详细信息</title>
</head>
<body>
<div class="cl pd-20" style=" background-color:#5bacb6">
    <img class="avatar size-XL l" src="${pro}/resources/uploads/headImage/${stu.stuhead}">
    <dl style="margin-left:80px; color:#fff">
        <dt>
            <span class="f-18">${stu.stuname}</span>
            <span class="pl-10 f-12">编号:${stu.stucode}</span>
        </dt>
        <dd class="pt-10 f-12" style="margin-left:0">
            <c:if test="${empty stu.studesc or stu.studesc ==''}">这家伙很懒，什么也没有留下</c:if>
            ${stu.studesc}
        </dd>
    </dl>
</div>
<div class="pd-20">
    <table class="table">
        <tbody>
        <tr>
            <th class="text-r" width="80">性别：</th>
            <td>
                <c:if test="${stu.stusex == 1}">男</c:if>
                <c:if test="${stu.stusex == 0}">女</c:if>
            </td>
        </tr>
        <tr>
            <th class="text-r" width="80">班级：</th>
            <td>${stu.clazz.classname}</td>
        </tr>
        <tr>
            <th class="text-r">出生日期：</th>
            <td><fmt:formatDate value="${stu.stubirth}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <th class="text-r">入学日期：</th>
            <td><fmt:formatDate value="${stu.stubirth}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <th class="text-r">手机：</th>
            <td>${stu.stuphone}</td>
        </tr>
        <tr>
            <th class="text-r">紧急联系电话：</th>
            <td>${stu.stucontact}</td>
        </tr>
        <tr>
            <th class="text-r">住址：</th>
            <td>
                <c:if test="${empty stu.stuaddress or stu.stuaddress ==''}">未填写</c:if>
                ${stu.stuaddress}
            </td>
        </tr>
        <tr>
            <th class="text-r">QQ：</th>
            <td>
                <c:if test="${empty stu.stuqq or stu.stuqq ==''}">未填写</c:if>
                ${stu.stuqq}
            </td>
        </tr>
        <tr>
            <th class="text-r">邮箱：</th>
            <td>
                ${stu.stuemail}
                <c:if test="${empty stu.stuemail or stu.stuemail ==''}">未填写</c:if>
            </td>
        </tr>
        <tr>
            <th class="text-r">学历：</th>
            <td>
                ${stu.studegree}
                <c:if test="${empty stu.studegree or stu.studegree ==''}">未填写</c:if>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
