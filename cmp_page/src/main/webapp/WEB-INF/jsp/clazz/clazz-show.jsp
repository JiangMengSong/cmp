<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/resources/common/cs_js.jsp" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<title>用户查看</title>
</head>
<body>
<div class="cl pd-20" style=" background-color:#5bacb6">
	<img class="avatar size-XL l" src="static/h-ui/images/ucnter/avatar-default.jpg">
	<dl style="margin-left:80px; color:#fff">
		<dt>
			<span class="f-18">${clazz.classname }</span>
			<span class="pl-10 f-12">学生人数:${clazz.stunum }</span>
		</dt>
		<dd class="pt-10 f-12" style="margin-left:0">这家伙很懒，什么也没有留下</dd>
	</dl>
</div>
<div class="pd-20">
	<table class="table">
		<tbody>
			<tr>
				<th class="text-r" width="80">班级ID：</th>
				<td>${clazz.clazzid }</td>
			</tr>
			<tr>
				<th class="text-r">班级编号：</th>
				<td>${clazz.classcode }</td>
			</tr>
			<tr>
				<th class="text-r">班级状态：</th>
				<td>
					<c:if test="${clazz.classstatus eq 0 }">
						未开班
					</c:if>
					<c:if test="${clazz.classstatus eq 1 }">
						预科
					</c:if>
					<c:if test="${clazz.classstatus eq 2 }">
						已开班
					</c:if>
					<c:if test="${clazz.classstatus eq 3 }">
						结业
					</c:if>
				</td>
			</tr>
			<tr>
				<th class="text-r">开班时间：</th>
				<td>${clazz.classbegintime }</td>
			</tr>
			<tr>
				<th class="text-r">结业时间：</th>
				<td>${clazz.classendtime }</td>
			</tr>
			<tr>
				<th class="text-r">说明：</th>
				<td>${clazz.classdesc }</td>
			</tr>
		</tbody>
	</table>
</div>
</body>
</html>