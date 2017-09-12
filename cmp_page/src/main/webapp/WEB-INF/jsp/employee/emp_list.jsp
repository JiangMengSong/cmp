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
    <%@include file="/resources/common/cs_js.jsp" %>
    <title>职工管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 人员管理 <span
        class="c-gray en">&gt;</span> 职工管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                              href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c"> 日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin"
               class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax"
               class="input-text Wdate" style="width:120px;">
        <input type="text" class="input-text" style="width:250px" placeholder="输入员工名称" id="" name="">
        <button type="submit" class="btn btn-success radius" id="selEmpBtn" name=""><i class="Hui-iconfont">&#xe665;</i>
            搜员工
        </button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
                <i class="Hui-iconfont">&#xe6e2;</i> 批量删除
            </a>
            <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"
               class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加用户
            </a>
        </span>
        <span class="r">共有数据：<strong>88</strong> 条</span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="8">职工管理</th>
            </tr>
            <tr class="text-c">
                <th><input type="checkbox" value="" name=""></th>
                <th>用户名</th>
                <th>性别</th>
                <th>角色</th>
                <th>入职日期</th>
                <th>当前状态</th>
                <th>电话</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${empList}" var="employee">
                <tr class="text-c">
                    <td><input type="checkbox" value="" name=""></td>
                    <td><a href="#">${employee.empname}</a></td>
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
                    <td><fmt:formatDate value="${employee.empentrytime}"
                                        pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>
                        <c:if test="${employee.empstauts == 0}">已离职</c:if>
                        <c:if test="${employee.empstauts == 1}">在职</c:if>
                    </td>
                    <td>${employee.empphone}</td>
                    <td class="f-14">
                        <a title="编辑" href="javascript:;" onclick="admin_role_edit('员工编辑','${pro}/employee/toHello.html','1')"
                           style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
                        <a title="删除" href="javascript:;" onclick="emp_del(${employee.empid})" class="ml-5"
                           style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pro}/resources/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    $(function () {
        $('.table-sort').dataTable({
            "aaSorting": [[1, "desc"]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                //{"orderable": false, "aTargets": [0, 8, 9]}// 制定列不参与排序
            ]
        });
    });


    function emp_del(empcheckingid) {
        if(confirm('确认要删除吗？')) {
            $.ajax({
                type: 'POST',
                url: '${pro}/empcheck/delEmpCheck/'+empcheckingid,
                dataType: 'json',
                success: function (data) {
                    if (data.flag){
                        alert("删除成功");
                        location.replace(location.href);
                    } else alert("删除失败")
                },
                error: function (data) {
                    console.log(data.msg);
                },
            })
        }
    }


</script>
</body>
</html>
