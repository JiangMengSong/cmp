<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/5 0005
  Time: 5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <title></title>
</head>
<body>
<article class="page-container">
    <form class="form form-horizontal" id="form_check_edit">
        <input type="hidden" name="empcheckingid" value="${empedit.empcheckingid}"/>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>教员:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <c:if test="${empedit.empcheckingid!=null}">
                    <input  type="text" class="input-text" value="${empedit.employee.empname}" readonly>
                </c:if>
                <c:if test="${empedit.empcheckingid==null}">
                <span class="select-box">
                    <select class="select" size="1" id="empid" name="employee.empid">
                        <option value="0">请选择教员</option>
                        <c:forEach items="${employee}" var="employee">
                            <option value="${employee.empid}"
                                    <c:if test="${empedit.employee.empid == employee.empid}"
                                    >selected</c:if>
                            >${employee.empname}</option>
                        </c:forEach>
                    </select>
                </span>
                </c:if>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>考勤日期:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"
                       onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'commentdatemax\')||\'%y-%M-%d\'}' })"
                       id="commentdatemin" value="<fmt:formatDate value="${empedit.chetime}" pattern="yyyy-MM-dd HH:mm:ss"/>" name="chetime" class="input-text Wdate">
                <%--<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="commentdatemin" class="input-text Wdate" style="width:120px;">--%>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>考勤情况:</label>
            <div class="formControls col-xs-8 col-sm-9 skin-minimal">
                <div class="radio-box">
                    <input name="chestatus" type="radio" value="1" id="che1" checked>
                    <label for="che1">正常</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="che2" value="2" name="chestatus"
                           <c:if test="${empedit.chestatus == 2}">checked</c:if>
                    >
                    <label for="che2">迟到</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="che3" value="3" name="chestatus"
                           <c:if test="${empedit.chestatus == 3}">checked</c:if>
                    >
                    <label for="che3">请假</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="che4" value="4" name="chestatus"
                           <c:if test="${empedit.chestatus == 4}">checked</c:if>
                    >
                    <label for="che4">旷课</label>
                </div>
            </div>
        </div>



        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>考勤说明:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${empedit.empcheckdesc}" placeholder="" id="stucheckingdesc" name="empcheckdesc">
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input  type="button" id="btnEmp"  class="btn btn-primary radius" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
            </div>
        </div>
    </form>

</article>

<script type="text/javascript" src="${pro}/resources/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/webuploader/0.1.5/webuploader.min.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/ueditor/1.4.3/ueditor.config.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/ueditor/1.4.3/ueditor.all.min.js"></script>
<script type="text/javascript" src="${pro}/resources/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">

    $(function () {

     $("#btnEmp").click(function () {

            if ($("#empid").val()==0){
                alert("请选择教员")
                return false;
            }

            if (isEmpty($("input[name=chetime]").val())){
                alert("请输入时间")
                return false;
            }
            $.ajax({
                url:"${pro}/empcheck/upEmpCheck.html",
                data:$("#form_check_edit").serialize(),
                dataType:"json",
                type:"post",
                success:function (result) {
                    if (result.flag){
                        alert("编辑成功");
                        var index = parent.layer.getFrameIndex(window.name); // 获取当前页面信息
                        parent.location.replace(parent.location.href); // 刷新父页面
                        parent.layer.close(index); // 关闭当前页面
                    }else alert(result.msg);
                },error: function (data) {
                    console.log(data.msg);
                }
            })
        });

    });
</script>
</body>
</html>
