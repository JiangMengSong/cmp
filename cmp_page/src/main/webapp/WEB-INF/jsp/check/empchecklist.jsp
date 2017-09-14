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
        class="c-gray en">&gt;</span> 考勤管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                              href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <form method="post" action="${pro}/empcheck/getEmpCheck.html">
    <div class="text-c"> 日期范围：

        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="startDate"
               class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" name="endDate"
               class="input-text Wdate" style="width:120px;">
        <input type="text" class="input-text" style="width:250px" placeholder="输入学生名称" id="" name="seaName">
        <button type="submit" class="btn btn-success radius" id="selStuBtn" name=""><i class="Hui-iconfont">&#xe665;</i>
            搜教员
        </button>

    </div>
    </form>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="data_del()" class="btn btn-danger radius">
                <i class="Hui-iconfont">&#xe6e2;</i> 批量删除
            </a>
            <a href="javascript:;" onclick="emp_up(0)"
               class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加考勤
            </a>
        </span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="16">考勤管理</th>
            </tr>
            <tr class="text-c">
                <th><input type="checkbox" value="" name=""></th>
                <th>ID</th>
                <th>员工姓名</th>
                <th>考勤时间</th>
                <th>考勤情况</th>
                <th>考勤说明</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${checkList}" var="empcheck">

                <tr class="text-c">
                    <td><input type="checkbox" value="${empcheck.empcheckingid}" name="empcheckId"></td>
                    <td>${empcheck.empcheckingid}</td>
                    <td><a href="#">${empcheck.employee.empname}</a></td>
                    <td><fmt:formatDate value="${empcheck.chetime}"
                                        pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>
                        <c:if test="${empcheck.chestatus == 1}">正常</c:if>
                        <c:if test="${empcheck.chestatus == 2}">迟到</c:if>
                        <c:if test="${empcheck.chestatus == 3}">请假</c:if>
                        <c:if test="${empcheck.chestatus == 4}">旷课</c:if>
                    </td>
                    <td>${empcheck.empcheckdesc}</td>

                    <td class="f-14">
                        <a title="编辑" href="javascript:;" onclick="emp_up(${empcheck.empcheckingid})"
                           style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
                        <a title="删除" href="javascript:;" onclick="stu_del(${empcheck.empcheckingid})" class="ml-5"
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
    /* 批量删除 */
    function data_del() {
        var empcheckid = new Array();
        $.each($("input[name=empcheckId]:checked"),function () {
            empcheckid.push($(this).val());
        })
        if(confirm('确认要删除吗？')) {
            $.ajax({
                type: 'POST',
                url: '${pro}/empcheck/delEmpCheckAll',
                data:{"empcheckId" : empcheckid},
                dataType: 'json',
                success: function (result) {
                    if (result.flag){
                        alert("删除成功");
                        location.replace(location.href);
                    } else alert("删除失败")
                },
                error: function (reslult) {
                    console.log(result.msg);
                },
            })
        }
    }
    $(function () {

        $('.table-sort').dataTable({
            "aaSorting": [[1, "desc"]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            ]
        });
    });

    /*跳转编辑员工信息*/
    function emp_up(empcheckingid){
        layer.open({
            type: 2,
            area: [800 + 'px', ($(window).height() - 50) + 'px'],
            fix: false, //不固定
            maxmin: true,
            shade: 0.4,
            title: "编辑学生",
            content: "${pro}/empcheck/toGet/"+empcheckingid
        });
    }


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
