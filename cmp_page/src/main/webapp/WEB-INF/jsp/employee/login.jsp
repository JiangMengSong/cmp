<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/31 0031
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/resources/common/taglib.jsp"%>
<html>
<head>
    <link href="${pro}/resources/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="${pro}/resources/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="${pro}/resources/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${pro}/resources/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
    <title>后台登录 - H-ui.admin v3.1</title>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" id="loginForms" method="post">
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="loginname" name="loginname" type="text" placeholder="账户" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="loginpwd" name="loginpwd" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <%--<div class="row cl">--%>
                <%--<div class="formControls col-xs-8 col-xs-offset-3">--%>
                    <%--<input class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">--%>
                    <%--<img src=""> <a id="kanbuq" href="javascript:;">看不清，换一张</a> </div>--%>
            <%--</div>--%>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <label for="online">
                        <input type="checkbox" name="loginCheck" id="online" value="1">
                        三天内不再次登录</label>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input id="loginBtn" type="button" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>
<div class="footer">Copyright 你的公司名称 by H-ui.admin v3.1</div>
${jquery_3}${jquery_common}
<script type="text/javascript" src="${pro}/resources/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript">
    $(function () {
       $("#loginBtn").click(function () {
           if (isEmpty($("#loginname").val())){
               alert("请输入用户名");
               return false;
           }
           if (isEmpty($("#loginpwd").val())){
               alert("请输入密码");
               return false;
           }
           $.ajax({
               url:"${pro}/employee/login/doLogin.html",
               data:$("#loginForms").serialize(),
               dataType:"json",
               type:"post",
               success:function (result) {
                    if (result.flag){
                        alert('登录成功')
                        location.href='${pro}/employee/toIndex.html'
                    }else{
                        alert(res.resMsg)
                    }
               },error:function () {
                   alert("登录错误");
               }
           })
       });
    });
</script>
</body>
</html>
