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

<title>访谈操作 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form action="" method="post" class="form form-horizontal" id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>访谈时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="" value="<fmt:formatDate value="${interview.intetime }" pattern="yyyy-MM-dd"/>" name="intetime" id="intetime">
				<input type="hidden" class="input-text" value="${interview.inteid }" placeholder="" id="inteid" name="inteid">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>访谈学员：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" id="stuid" name="student.stuid">
					<option value="0">请选择访谈学员</option>
					<c:forEach var="s" items="${studentList }">
							<%-- <c:if test='${s.stuid eq inteverview.student.stuid }'>selected</c:if> --%>
						<option <c:if test='${s.stuid == interview.student.stuid }'>selected</c:if> value="${s.stuid }" >${s.stuname }</option>
					</c:forEach>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>访谈者：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" id="empid" name="employee.empid">
					<option value="0">请选择访谈者</option>
					<c:forEach var="e" items="${employeeList }">
						
							<%-- <c:if test='${e.empid eq interview.employee.empid }'>selected</c:if> --%>
						<option
								<c:if test='${e.empid == interview.employee.empid }'>
									selected
						</c:if>
								value="${e.empid }" >${e.empname }</option>
					</c:forEach>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>访谈说明：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${interview.intedesc }" placeholder="" id="intedesc" name="intedesc">
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input id="btn" class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="${pro }/resources/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pro }/resources/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${pro }/resources/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${pro }/resources/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/webuploader/0.1.5/webuploader.min.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/ueditor/1.4.3/ueditor.config.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/ueditor/1.4.3/ueditor.all.min.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules : {
				"intetime" : "required",
				"student.stuid" : {
					required : true
				},
				"employee.empid" : "required",
				"intedesc" : "required"
			},
			messages : {
				"intetime" : "请输入访谈时间！",
				"student.stuid" : {
					required : "请输入访谈学员！"
				},
				"employee.empid" : "请输入访谈者",
				"intedesc" : "请输入访谈说明"
			},
        onkeyup: false,
        focusCleanup: true,
        success: "valid",
        submitHandler: function (form) {
            if ($("#stuid").val() == 0){
                alert("请输入访谈学员")
                return false;
            }
            if ($("#empid").val() == 0){
                alert("请输入访谈者")
                return false;
            }
            $.ajax({
                url:"${pro}/interview/addInterview.html",
                data:$("#form-member-add").serialize(),
                dataType:"json",
                type:"post",
                success:function (result) {
                    if (result.flag){
                        alert("操作成功");
                        var index = parent.layer.getFrameIndex(window.name); // 获取当前页面信息
                        parent.location.replace(parent.location.href); // 刷新父页面
                        parent.layer.close(index); // 关闭当前页面
                    }else alert(result.msg);
                },error: function (data) {
                    console.log(data.msg);
                }
            })
        }
		}
	);
		
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>