<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<%@include file="/resources/common/cs_js.jsp" %>
<!--/meta 作为公共模版分离出去-->

<title>添加用户 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form action="" method="post" class="form form-horizontal" id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>班级名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${clazz.classname }" placeholder="" id="classname" name="classname">
				<input type="hidden" class="input-text" value="${clazz.clazzid }" placeholder="" id="clazzid" name="clazzid">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>学生人数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${clazz.stunum }" placeholder="" id="stunum" name="stunum">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">所属专业：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" id="majorid" name="major.majorid">
					<option value="0" selected>请选择所属专业</option>
					<c:forEach var="m" items="${majorList }">
						
							<%-- <c:if test='${m.majorid eq clazz.major.majorid }'>selected</c:if> --%> 
						<option value="${m.majorid }" >${m.majorname }</option>
					</c:forEach>
				</select>
				</span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>班级编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${clazz.classcode }" placeholder="" name="classcode" id="classcode">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">班级状态：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" id="classstatus" name="classstatus">
					<option value="0">未开班</option>
					<option value="1">预科</option>
					<option value="2">已开班</option>
					<option value="3">结业</option>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>开班时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				
				<input type="text" class="input-text" placeholder="" value="<fmt:formatDate value="${clazz.classbegintime }" pattern="yyyy-MM-dd"/>" name="classbegintime" id="classbegintime">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>结业时间：</label>
			<div class="formControls col-xs-8 col-sm-9">				
				<input type="text" class="input-text" placeholder="" value="<fmt:formatDate value="${clazz.classendtime }" pattern="yyyy-MM-dd"/>" name="classendtime" id="classendtime">
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input id="btn" class="btn btn-primary radius" type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="${pro }/resources/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pro }/resources/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${pro }/resources/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${pro }/resources/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules : {
				"classname" : "required",
				"stunum" : {
					required : true,
					minlength : 1
				},
				"major.majorid" : "required",
				"classcode" : "required",
				"classstatus" : "required"
			},
			messages : {
				"classname" : "请输入班级名称！",
				"stunum" : {
					required : "请输入学生人数！",
					minlength : "学生人数不能小于1位！"},
				"major.majorid" : "请选择所属专业",
				"classcode" : "请输入班级编号",
				"classstatus" : "请选择班级状态"
			}
		}
	});
	$("#btn").click(function() {
			//验证
			if ($("#form-member-add").valid()) {
				//通过验证
				$.ajax({
				url:"${pro}/clazz/addClazz.html",
				data:$("#form-member-add").serialize(),
				dataType:"json",
				type:"post",
				success:function(result){
					if (result.flag == true) {
						alert('操作成功');					
						window.location.href = "${pro}/clazz/clazzList.html";
					} else {
						alert('操作失败');
					}
				},error:function(){
					alert("錯誤");
				}
			});
			}

		});
		
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>