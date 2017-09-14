<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <title></title>
</head>
<body>

<article class="page-container">
    <form class="form form-horizontal" id="form_emp_edit" method="post">
        <input type="hidden" name="empid" value="${employee.empid}"/>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>姓名:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.empname}" placeholder="" id="empname" name="empname">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>登录名:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.loginname}" placeholder="" id="loginname" name="loginname">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>登录密码:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.loginpwd}" placeholder="" id="loginpwd" name="loginpwd">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>性别:</label>
            <div class="formControls col-xs-8 col-sm-9 skin-minimal">
                <div class="radio-box">
                    <input name="empsex" type="radio" value="1" id="sex-1" checked>
                    <label for="sex-1">男</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="sex-2" value="0" name="empsex"
                           <c:if test="${employee.empsex == 0}">checked</c:if>
                    >
                    <label for="sex-2">女</label>
                </div>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>出生日期:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"
                       onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'commentdatemax\')||\'%y-%M-%d\'}' })"
                       id="commentdatemin" value="<fmt:formatDate value="${employee.empbirth}" pattern="yyyy-MM-dd HH:mm:ss"/>" name="empbirth" class="input-text Wdate">
                <%--<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="commentdatemin" class="input-text Wdate" style="width:120px;">--%>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>入职日期:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"
                       onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'commentdatemin\')}' })"
                       id="commentdatemax" value="<fmt:formatDate value="${employee.empentrytime}" pattern="yyyy-MM-dd HH:mm:ss"/>" name="empentrytime" class="input-text Wdate">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色设定:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <span class="select-box">
                    <select class="select" size="1" id="empRole" name="emprole">
                        <option value="0">请选择角色:</option>
                        <option value="3"
                                <c:if test="${employee.emprole == 3}"
                                >selected</c:if>
                        >教员</option>
                        <option value="4"
                                <c:if test="${employee.emprole == 4}"
                                >selected</c:if>
                        >班主任</option>
                    </select>
                </span>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>联系电话:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.empphone}" placeholder="" id="empphone" name="empphone">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>状态:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <div class="radio-box">
                    <input name="empstauts" type="radio" value="1" checked>
                    <label for="sex-1">在职</label>
                </div>
                <div class="radio-box">
                    <input type="radio" value="0" name="empstauts"
                           <c:if test="${employee.empstauts == 0}">checked</c:if>
                    >
                    <label for="sex-2">离职</label>
                </div>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">学历:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.empmajor}" placeholder="" name="empmajor" id="empmajor">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">邮箱:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.empemail}" placeholder="@" name="empemail" id="empemail">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">住址:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.empaddress}" placeholder="" name="empaddress" id="empaddress">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">QQ:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${employee.empqq}" placeholder="" name="empqq" id="empqq">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">备注：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="empdesc" cols="" rows="" class="textarea" placeholder="备注信息,最多填写100字(可不填)"
                          onKeyUp="$.Huitextarealength(this,100)">${employee.empdesc}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
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
        $('.skin-minimal input').iCheck({
            checkboxClass: 'icheckbox-blue',
            radioClass: 'iradio-blue',
            increaseArea: '20%'
        });

        $("#form_emp_edit").validate({
            rules: {
                empname: {
                    required: true,
                    minlength: 2,
                    maxlength: 8
                },
                empbirth:{ required: true, },
                empentrytime:{ required: true, },
                empphone: {
                    required: true,
                    isMobile: true
                },
                empemail: {
                    email: true
                }
            },
            onkeyup: false,
            focusCleanup: true,
            success: "valid",
            submitHandler: function (form) {
                //$(form).ajaxSubmit();
                if(isEmpty($("input[name=empsex]").val())){
                    alert("请选择性别");
                    return false;
                }
                if ($("#empRole").val() == 0){
                    alert("请选择角色");
                    return false;
                }
                if(isEmpty($("input[name=empstauts]").val())){
                    alert("请选择状态");
                    return false;
                }
                $.ajax({
                    url:"${pro}/employee/editEmp.html",
                    data:$("#form_emp_edit").serialize(),
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
                        alert("出现错误");
                        console.log(data.msg);
                    }
                })
            }
        });
    });
</script>
</body>
</html>
