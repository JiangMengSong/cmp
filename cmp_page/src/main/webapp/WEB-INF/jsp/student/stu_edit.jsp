<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <title></title>
</head>
<body>

<article class="page-container">
    <form class="form form-horizontal" id="form_stu_edit">
        <input type="hidden" name="stuid" value="${stu.stuid}"/>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>姓名:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.stuname}" placeholder="" id="username" name="stuname">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>性别:</label>
            <div class="formControls col-xs-8 col-sm-9 skin-minimal">
                <div class="radio-box">
                    <input name="stusex" type="radio" value="1" id="sex-1" checked>
                    <label for="sex-1">男</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="sex-2" value="0" name="stusex"
                           <c:if test="${stu.stusex == 0}">checked</c:if>
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
                       id="commentdatemin" value="<fmt:formatDate value="${stu.stubirth}" pattern="yyyy-MM-dd HH:mm:ss"/>" name="stubirth" class="input-text Wdate">
                <%--<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="commentdatemin" class="input-text Wdate" style="width:120px;">--%>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>入学日期:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"
                       onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'commentdatemin\')}' })"
                       id="commentdatemax" value="<fmt:formatDate value="${stu.stuentrytime}" pattern="yyyy-MM-dd HH:mm:ss"/>" name="stuentrytime" class="input-text Wdate">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>所在班级：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <span class="select-box">
                    <select class="select" size="1" id="clazzId" name="clazz.clazzid">
                        <option value="0">请选择班级</option>
                        <c:forEach items="${clazzList}" var="clazz">
                            <option value="${clazz.clazzid}"
                                <c:if test="${stu.clazz.clazzid == clazz.clazzid}"
                                >selected</c:if>
                            >${clazz.classname}</option>
                        </c:forEach>
                    </select>
                </span>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>联系电话:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.stuphone}" placeholder="" id="stuphone" name="stuphone">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>紧急电话:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.stucontact}" placeholder="" id="stucontact" name="stucontact">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">学历:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.studegree}" placeholder="" name="studegree" id="studegree">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">邮箱:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.stuemail}" placeholder="@" name="stuemail" id="stuemail">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">住址:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.stuaddress}" placeholder="" name="stuaddress" id="stuaddress">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">QQ:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${stu.stuqq}" placeholder="" name="stuqq" id="stuqq">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">备注：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="studesc" cols="" rows="" class="textarea" placeholder="备注信息,最多填写100字(可不填)"
                          onKeyUp="$.Huitextarealength(this,100)">${stu.studesc}</textarea>
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

        $("#form_stu_edit").validate({
            rules: {
                stuname: {
                    required: true,
                    minlength: 2,
                    maxlength: 8
                },
                stubirth:{ required: true, },
                stuentrytime:{ required: true, },
                stuphone: {
                    required: true,
                    isMobile: true
                },
                stucontact: {
                    required: true,
                    isMobile: true
                },
                stuemail: {
                    email: true
                }
            },
            onkeyup: false,
            focusCleanup: true,
            success: "valid",
            submitHandler: function (form) {
                //$(form).ajaxSubmit();
                if (isEmpty($("input[name=stusex]").val())){
                    alert("请选择性别")
                    return false;
                }
                if ($("#clazzId").val() == 0){
                    alert("请选择班级")
                    return false;
                }
                $.ajax({
                    url:"${pro}/student/editStu.html",
                    data:$("#form_stu_edit").serialize(),
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
            }
        });
    });
</script>
</body>
</html>
