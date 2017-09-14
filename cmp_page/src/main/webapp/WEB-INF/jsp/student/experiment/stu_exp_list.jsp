<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <title>作业测验</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 人员管理 <span
        class="c-gray en">&gt;</span> 作业测验 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                              href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c"> 日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin"
               class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax"
               class="input-text Wdate" style="width:120px;">
        <input type="text" class="input-text" style="width:250px" placeholder="输入测验内容" id="" name="">
        <button type="submit" class="btn btn-success radius" id="selStuBtn" name=""><i class="Hui-iconfont">&#xe665;</i>
            搜测验内容
        </button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="" class="btn btn-danger radius">
                <i class="Hui-iconfont">&#xe6e2;</i> 批量删除
            </a>
            <a href="javascript:;" onclick=""
               class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 发布作业
            </a>
        </span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="10">作业测验</th>
            </tr>
            <tr class="text-c">
                <th><input type="checkbox" value="" name=""></th>
                <th>姓名</th>
                <th>科目</th>
                <th>教员</th>
                <th>上机类型</th>
                <th>上机日期</th>
                <th>上机内容</th>
                <th>上机分数</th>
                <th>上机描述</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${expList}" var="experiment">
                <tr class="text-c">
                    <td><input type="checkbox" value="" name=""></td>
                    <td><a href="#">${experiment.student.stuname}</a></td>
                    <td>${experiment.subject.subname}</td>
                    <td>${experiment.employee.empname}</td>
                    <td>${experiment.experimentType.typename}</td>
                    <td><fmt:formatDate value="${experiment.exptime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>${experiment.expcontent}</td>
                    <td>
                        <c:if test="${experiment.expscore == -1}">未打分</c:if>
                        <c:if test="${experiment.expscore == 0}">未参与</c:if>
                        <c:if test="${experiment.expscore > 0}">${experiment.expscore}</c:if>
                    </td>
                    <td>
                            ${experiment.expdesc}
                        <c:if test="${empty experiment.expdesc or experiment.expdesc ==''}">未填写</c:if>
                    </td>
                    <td class="f-14">
                        <a title="编辑" href="javascript:;" onclick="stuExp_edit()"
                           style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
                        <a title="删除" href="javascript:;" onclick="" class="ml-5"
                           style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
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

    function stuExp_edit(){
        layer.open({
            type: 2,
            area: [800 + 'px', ($(window).height() - 50) + 'px'],
            fix: false, //不固定
            maxmin: true,
            shade: 0.4,
            title: "测验编辑",
            content: ""
        });
    }
</script>
</body>
</html>
