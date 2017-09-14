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
    <form class="form form-horizontal" method="post" id="form_major_edit">
        <input type="hidden" name="majorid" value="${major.majorid}"/>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>专业名称:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${major.majorname}" placeholder="" id="username" name="majorname">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>专业分类:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${major.majordesc}" placeholder="" id="majordesc" name="majordesc">
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

        $("#form_major_edit").validate({
            rules: {
                majorname: {
                    required: true,
                    minlength: 2,
                    maxlength: 8
                },
                majordesc:{ required: true, },
            },
            onkeyup: false,
            focusCleanup: true,
            success: "valid",
            submitHandler: function (form) {
                //$(form).ajaxSubmit();
                $.ajax({
                    url:"${pro}/major/updatemajor.html",
                    data:$("#form_major_edit").serialize(),
                    dataType:"json",
                    type:"post",
                    success:function (result) {
                        alert(1)
//                        var res = JSON.parse(result)
//                        alert(res.flag)
//                        if (res.flag){
//                            alert("编辑成功");
//                            var index = parent.layer.getFrameIndex(window.name); // 获取当前页面信息
//                            parent.location.replace(parent.location.href); // 刷新父页面
//                            parent.layer.close(index); // 关闭当前页面
//                        }else alert(res.msg);
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
