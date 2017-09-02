<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/2 0002
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp"%>
    <title>职工管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 人员管理 <span class="c-gray en">&gt;</span> 职工管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray"> <span class="l"> <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a class="btn btn-primary radius" href="javascript:;" onclick="admin_role_add('添加角色','admin-role-add.html','800')"><i class="Hui-iconfont">&#xe600;</i> 添加职工</a> </span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
    <table class="table table-border table-bordered table-hover table-bg">
        <thead>
            <tr>
                <th scope="col" colspan="15">职工管理</th>
            </tr>
            <tr class="text-c">
                <th><input type="checkbox" value="" name=""></th>
                <th>ID</th>
                <th>用户名</th>
                <th>登录名</th>
                <th>性别</th>
                <th>角色</th>
                <th>入职日期</th>
                <th>出生日期</th>
                <th>电话</th>
                <th>住址</th>
                <th>QQ</th>
                <th>学历</th>
                <th>邮箱</th>
                <th>描述</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${empList}" var="employee">
                <tr class="text-c">
                    <td><input type="checkbox" value="" name=""></td>
                    <td>${employee.empid}</td>
                    <td><a href="#">${employee.empname}</a></td>
                    <td>${employee.loginname}</td>
                    <td>
                        <c:if test="${employee.empsex == 1}">男</c:if>
                        <c:if test="${employee.empsex == 0}">女</c:if>
                    </td>
                    <td>
                        <c:if test="${employee.emprole == 1}">超级管理员</c:if>
                        <c:if test="${employee.emprole == 2}">校长</c:if>
                        <c:if test="${employee.emprole == 3}">教员</c:if>
                        <c:if test="${employee.emprole == 4}">班主任</c:if>
                    </td>
                    <td><fmt:formatDate value="${employee.empentrytime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
                    <td><fmt:formatDate value="${employee.empbirth}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
                    <td>${employee.empphone}</td>
                    <td>${employee.empaddress}</td>
                    <td>
                        ${employee.empqq}
                        <c:if test="${empty employee.empqq or employee.empqq ==''}">未填写</c:if>
                    </td>
                    <td>
                        ${employee.empmajor}
                        <c:if test="${empty employee.empmajor or employee.empmajor ==''}">未填写</c:if>
                    </td>
                    <td>
                        ${employee.empemail}
                        <c:if test="${empty employee.empemail or employee.empemail ==''}">未填写</c:if>
                    </td>
                    <<td>
                        ${employee.empdesc}
                        <c:if test="${empty employee.empdesc or employee.empdesc ==''}">未填写</c:if>
                    </td>
                    <td class="f-14">
                        <a title="编辑" href="javascript:;" onclick="admin_role_edit('角色编辑','admin-role-add.html','1')" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
                        <a title="删除" href="javascript:;" onclick="admin_role_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<script type="text/javascript" src="${pro}/resources/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript">
    /*管理员-角色-添加*/
    function admin_role_add(title,url,w,h){
        layer_show(title,url,w,h);
    }
    /*管理员-角色-编辑*/
    function admin_role_edit(title,url,id,w,h){
        layer_show(title,url,w,h);
    }
    /*管理员-角色-删除*/
    function admin_role_del(obj,id){
        layer.confirm('角色删除须谨慎，确认要删除吗？',function(index){
            $.ajax({
                type: 'POST',
                url: '',
                dataType: 'json',
                success: function(data){
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                },
                error:function(data) {
                    console.log(data.msg);
                },
            });
        });
    }
</script>
</body>
</html>
