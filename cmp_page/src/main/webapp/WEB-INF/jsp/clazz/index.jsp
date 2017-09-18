<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/commons/includes/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>信息管理系统界面</title>

<script language="JavaScript" src="${ctx }/resources/js/jquery.js"></script>
${jquery_form_js}
<script type="text/javascript" src="${resourcesCtx }/js/tableExport.js"></script>
<script type="text/javascript"
	src="${resourcesCtx }/js/jquery.base64.js"></script>
<script type="text/javascript">
	function exportFile() {
		window.location.href = "${ctx}/uploadExcel/ajaxExport.htm";
	}
</script>
<script type="text/javascript">
	//ajax 方式上传文件操作
	$(document)
			.ready(
					function() {
						$('#btnUpfile')
								.click(
										function() {
											if (checkData()) {
												alert("${ctx}/computerExperiment/UploadComputerExperimentCompletion");
												$('#upfileForm')
														.ajaxSubmit(
																{
																	url : '${ctx}/computerExperiment/UploadComputerExperimentCompletion',
																	dataType : 'text',
																	success : resutlMsg,
																	error : errorMsg
																});
												function resutlMsg(msg) {
													alert("导入成功");
													location.reload();
												}
												function errorMsg() {
													alert("导入excel出错！");
												}
											}
										});

						$("#chart")
								.click(
										function() {
											//var sel = $("#sel").val();
											//if(sel=="按等级"){
											location.href = "${ctx}/computerExperiment/getChartByCredit";
											//}

										});

					});

	//JS校验form表单信息
	function checkData() {
		var fileDir = $("#upfile").val();
		var suffix = fileDir.substr(fileDir.lastIndexOf("."));
		if ("" == fileDir) {
			alert("选择需要导入的Excel文件！");
			return false;
		}
		if (".xls" != suffix && ".xlsx" != suffix) {
			alert("选择Excel格式的文件导入！");
			return false;
		}
		return true;
	}
</script>
</head>
<body>

	<p>
		<input class="common_button" type="button" value="柱状图" id="chart">
	</p>
	<input type="button" value="Excel导入模版下载"
		onclick="javascript:location.href='${ctx}/downloadExcel?fileName=computerExperimentCompletion.xls';" />
	<form id="upfileForm"
		action="${ctx}/computerExperiment/UploadComputerExperimentCompletion.json"
		method="post" enctype="multipart/form-data">
		<input type="hidden" value="${computerExperimentVo.id }"
			name="computerExperimentId" /> <input id="upfile" type="file"
			name="upfile" /> <input type="button" value="Excel导入" id="btnUpfile" />
	</form>
	<br />
	<br />


	<form action="${ctx}/index.htm" method="post">
		<!-- 隐藏域存取分页信息 -->
		<input type="hidden" name="page" value="${search.page }" />
		<!-- 当前页码 -->
		<input type="hidden" name="rows" value="${search.rows }" />
		<!-- 每页条数 -->

		<input type="button" value="Excel导出" id="excelExport"
			onclick="$('#table2excel').tableExport({type:'excel',separator:';',escape:'false'});" />

		<input type="button" value="Excel导出 POI" id="excelExport2"
			onclick="exportFile()" />
		<table class="result-tab" width="100%" id="table2excel">
			<tr>
				<!-- <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th> -->
				<td>序号</td>
				<td>用户名称</td>
				<td>用户电话</td>
				<td>用户邮箱</td>
				<td>操作</td>


			</tr>
			<c:forEach var="stu" items="${list }" varStatus="status">
				<tr>
					<%--  <td class="tc"><input name="id[]" value="${stu.id }" type="checkbox"></td> --%>


					<td>${status.index+1 }</td>
					<td>${stu.username }</td>
					<td>${stu.phone }</td>
					<td>${stu.email }</td>
					<td><a class="link-update" rel="${stu.id }"
						href="javascript:;">修改</a>&nbsp;&nbsp; <%-- <a class="link-del" rel="${stu.id }" href="javascript:;">删除</a>&nbsp;&nbsp; --%>
						<a class="link-show"
						href="${ctx}/studentManager/getStudentlearningQualityList.htm?eqId=${stu.id }">查看学习质量详情</a>
					</td>
				</tr>
			</c:forEach>


		</table>
		<%@ include file="/commons/imports/page.jsp"%>
	</form>


	<c:if test="${chartURL!=null }">
		<div style="text-align:center">
			<img src="${chartURL}" width=600 height=400 border=0 color=gray>
		</div>
	</c:if>
</body>
</html>

