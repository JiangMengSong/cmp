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
    <title>科目管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 科目管理 <span
        class="c-gray en">&gt;</span> 科目管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                              href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c"> 日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin"
               class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax"
               class="input-text Wdate" style="width:120px;">
        <input type="text" class="input-text" style="width:250px" placeholder="输入科目名称" id="" name="">
        <button type="submit" class="btn btn-success radius" id="selEmpBtn" name=""><i class="Hui-iconfont">&#xe665;</i>
            搜科目
        </button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="subject_del()" class="btn btn-danger radius">
                <i class="Hui-iconfont">&#xe6e2;</i> 批量删除
            </a>
            <a href="javascript:;" onclick="subject_edit(0)"
               class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加科目
            </a>
        </span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="11">科目管理</th>
            </tr>
            <tr class="text-c">
                <th><input type="checkbox" value="" name="科目ID"></th>
                <th>科目名称</th>
                <th>科目分类</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${subjectList}" var="subject">
                <tr class="text-c">
                    <td><a href="#">${subject.subid}</a></td>
                    <td><a href="#">${subject.subname}</a></td>
                    <td><a href="#">${subject.subdesc}</a></td>
                    <td class="f-14">
                        <a title="编辑" href="javascript:;" onclick="subject_edit(${subject.subid})"
                           style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
                        <a title="删除" href="javascript:;" onclick="subject_del(${subject.subid})" class="ml-5"
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
    });/*跳转编辑科目信息*/
    function subject_edit(subid){
        layer.open({
            type: 2,
            area: [800 + 'px', ($(window).height() - 50) + 'px'],
            fix: false, //不固定
            maxmin: true,
            shade: 0.4,
            title: "编辑科目",
            content: "${pro}/subject/toupdatesubject/"+subid
        });
    }


    function subject_del(subId) {
        if(confirm('确认要删除吗？')) {
            $.ajax({
                type: 'POST',
                url: '',
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
