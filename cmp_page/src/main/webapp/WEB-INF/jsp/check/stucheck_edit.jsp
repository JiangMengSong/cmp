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
    <form class="form form-horizontal" id="form_stucheck_edit">
        <input type="hidden" name="stucheckingid" value="${stu.stucheckingid}"/>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>学生:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <c:if test="${stu.stucheckingid!=null}">
                    <input type="text" class="input-text" value="${stu.student.stuname}" placeholder="" id="stuname" name="student.stuname"  readonly>
                </c:if>

                <c:if test="${stu.stucheckingid==null}">
                <span class="select-box">
                    <select class="select" size="1" id="stuid" name="student.stuid">
                        <option value="0">请选择学生</option>
                        <c:forEach items="${student}" var="student">
                            <option value="${student.stuid}"
                                    <c:if test="${stu.student.stuid == student.stuid}"
                                    >selected</c:if>
                            >${student.stuname}</option>
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
                       id="commentdatemin" value="<fmt:formatDate value="${stu.chetime}" pattern="yyyy-MM-dd HH:mm:ss"/>" name="chetime" class="input-text Wdate">
                <%--<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="commentdatemin" class="input-text Wdate" style="width:120px;">--%>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>考勤情况:</label>
            <div class="formControls col-xs-8 col-sm-9 skin-minimal">
                <div class="radio-box">
                    <input name="chestatus" type="radio" value="1" id="sex-1" checked>
                    <label for="sex-1">正常</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="sex-2" value="2" name="chestatus"
                           <c:if test="${stu.chestatus == 2}">checked</c:if>
                    >
                    <label for="sex-2">迟到</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="sex-3" value="3" name="chestatus"
                           <c:if test="${stu.chestatus == 3}">checked</c:if>
                    >
                    <label for="sex-3">请假</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="sex-4" value="4" name="chestatus"
                           <c:if test="${stu.chestatus == 4}">checked</c:if>
                    >
                    <label for="sex-4">旷课</label>
                </div>
            </div>
        </div>



        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>考勤说明:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.stucheckingdesc}" placeholder="" id="stucheckingdesc" name="stucheckingdesc">
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input id="btnStu"  type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
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
        $("#btnStu").click(function () {
                $.ajax({
                    url:"${pro}/stucheck/upStuCheck.html",
                    data:$("#form_stucheck_edit").serialize(),
                    dataType:"json",
                    type:"post",
                    success:function (result) {
                        alert($("#form_stucheck_edit").serialize());
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

