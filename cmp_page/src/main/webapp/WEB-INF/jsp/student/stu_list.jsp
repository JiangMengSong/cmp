<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <input type="text" class="input-text" style="width:250px" placeholder="输入学生名称" id="" name="">
        <button type="submit" class="btn btn-success radius" id="selStuBtn" name=""><i class="Hui-iconfont">&#xe665;</i>
            搜学生
        </button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="data_del()" class="btn btn-danger radius">
                <i class="Hui-iconfont">&#xe6e2;</i> 批量删除
            </a>
            <a href="javascript:;" onclick="stu_edit(0)"
               class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加学生
            </a>
        </span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="9">学生管理</th>
            </tr>
            <tr class="text-c">
                <th><input type="checkbox" value="" name=""></th>
                <th>姓名</th>
                <th>性别</th>
                <th>班级</th>
                <th>入学日期</th>
                <th>编号</th>
                <th>电话</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${stuList}" var="student">
                <tr class="text-c">
                    <td><input type="checkbox" value="${student.stuid}" name="stuId"></td>
                    <td><a href="javascript:;" onclick="stu_show(${student.stuid},'${student.stuname}')">${student.stuname}</a></td>
                    <td>
                        <c:if test="${student.stusex == 1}">男</c:if>
                        <c:if test="${student.stusex == 0}">女</c:if>
                    </td>
                    <td>${student.clazz.classname}</td>
                    <td><fmt:formatDate value="${student.stuentrytime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>${student.stucode}</td>
                    <td>${student.stuphone}</td>
                    <td class="f-14">
                        <a title="编辑" href="javascript:;" onclick="stu_edit(${student.stuid})"
                           style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
                        <a title="删除" href="javascript:;" onclick="stu_del(${student.stuid})" class="ml-5"
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
                //{"orderable": false, "aTargets": [0, 8, 9]}// 制定列不参与排序
            ]
        });
    });

    /*跳转查看学生信息*/
    function stu_show(stuId,stuName){
        layer.open({
            type: 2,
            area: [360 + 'px', 400 + 'px'],
            fix: false, //不固定
            maxmin: true,
            shade: 0.4,
            title: stuName,
            content: "${pro}/student/toEditStu/"+stuId+"?sel=1"
        });
    }

    /*跳转编辑学生信息*/
    function stu_edit(stuId){
        layer.open({
            type: 2,
            area: [800 + 'px', ($(window).height() - 50) + 'px'],
            fix: false, //不固定
            maxmin: true,
            shade: 0.4,
            title: "编辑学生",
            content: "${pro}/student/toEditStu/"+stuId
        });
    }

    /* 删除单个学生 */
    function stu_del(stuId) {
        if(confirm('确认要删除吗？')) {
            $.ajax({
                type: 'POST',
                url: '${pro}/student/delStu/'+stuId,
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

    /* 批量删除学生 */
    function data_del() {
        var stuId = new Array();
        $.each($("input[name=stuId]:checked"),function () {
            stuId.push($(this).val());
        })
        if(confirm('确认要删除吗？')) {
            $.ajax({
                type: 'POST',
                url: '${pro}/student/delStudent',
                data:{"stuId" : stuId},
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

