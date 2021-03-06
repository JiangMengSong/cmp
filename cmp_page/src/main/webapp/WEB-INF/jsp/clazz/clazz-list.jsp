<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<%@include file="/resources/common/cs_js.jsp" %>
<title>用户管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"><form method="post" action="${pro }/clazz/clazzList.html"> 日期范围：
		<input type="text" name="classbegintime" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" name="classendtime" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" class="input-text" style="width:250px;" id="" name="classname">
		<button type="button" value="" id="excelExport2" class="btn btn-success radius"
			   onclick="exportFile()" ><i class="Hui-iconfont">&#xe665;</i>Excel导出 POI</button>
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
		</form>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="clazz_add(0)" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span></div>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">班级ID</th>
				<th width="100">班级名称</th>
				<th width="100">学生人数</th>
				<th width="90">所属专业</th>
				<th width="150">班级编号</th>
				<th width="">班级状态</th>
				<th width="130">开班时间</th>
				<th width="70">结业时间</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="clazz" items="${clazzList }">
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>${clazz.clazzid }</td>
				<td><a href="${pro}/clazz/clazzshow/${clazz.clazzid }" style="cursor:pointer" class="text-primary" >${clazz.classname }</a></td>
				<td>${clazz.stunum }</td>
				<td>${clazz.major.majorname }</td>
				<td>${clazz.classcode }</td>
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
				<td><fmt:formatDate value="${clazz.classbegintime }"
                                        pattern="yyyy-MM-dd"/></td>
                <td><fmt:formatDate value="${clazz.classendtime }"
                                        pattern="yyyy-MM-dd"/></td>
				<td class="td-manage"><a title="编辑" href="javascript:;" onclick="clazz_add(${clazz.clazzid })" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a title="删除" href="javascript:;" onclick="clazz_del(${clazz.clazzid })" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</div>
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pro }/resources/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${pro }/resources/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${pro }/resources/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    function exportFile() {
        window.location.href = "${pro}/clazz/ajaxExport.html";
    }
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
		]
	});
	
});
/*用户添加*/
    function clazz_add(clazzId){
        layer.open({
            type: 2,
            area: [800 + 'px', ($(window).height() - 50) + 'px'],
            fix: false, //不固定
            maxmin: true,
            shade: 0.4,
            title: "用户",
            content: "${pro}/clazz/toAddClazz/"+clazzId
        });
    }
    //删除
    function clazz_del(clazzId) {
        if(confirm('确认要删除吗？')) {
            $.ajax({
                type: 'POST',
                url: '${pro}/clazz/delClazz/'+clazzId,
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
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
				$(obj).remove();
				layer.msg('已停用!',{icon: 5,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
				$(obj).remove();
				layer.msg('已启用!',{icon: 6,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
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