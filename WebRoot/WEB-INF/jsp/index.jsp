<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport"content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
<title>WeShare 为你提供优质的资源</title>
    <meta charset="utf-8">
    <link rel="stylesheet" media="screen" href="${ctx }/css/frameworks.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/site.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/weshare.css">
    <script type="text/javascript" src="${ctx }/js/jquery-1.6.4.js"></script>
</head>

<body class="page-responsive min-width-0 f4 intent-mouse">


  <div class="application-main ">
    <div class="jumbotron jumbotron-codelines">
      <div class="container-lg p-responsive position-relative">
        <div class="d-md-flex flex-items-center gutter-md-spacious">
          <div class="col-md-7 text-center text-md-left ">
            <h1 class="alt-h0 text-white lh-condensed-ultra mb-3">For better learning and sharing</h1>
            <p class="alt-lead mb-4  hide-sm">
              WeShare 为你提供优质的资源，WeShare 为你提供知识的分享平台。
            </p>
          </div>
            <div class="mx-auto col-sm-8 col-md-5">
              <div class="rounded-1 text-gray bg-gray-light py-4 px-4 px-md-3 px-lg-4">
                <form id="formlogin" method="post" class="home-hero-signup" onsubmit="return false;">
                                <dl class="form-group">
                                  <dt>
                                    <label class="form-label">账号</label>
                                  </dt>
                                  <dd>
                                        <input type="text"  id="loginname" name="username" class="form-control form-control-lg input-block" placeholder="输入用户名"  tabindex="1" autocomplete="off"/>
                                        
                                  </dd>
                                </dl>
                                <script type="text/javascript">
                                    setTimeout(function () {
                                        if (!$("#loginname").val()) {
                                            $("#loginname").get(0).focus();
                                        }
                                    }, 0);
                                </script>

                                <dl class="form-group">
                                  <dt>
                                    <label class="form-label f5">密码</label>
                                  </dt>
                                  <dd>
                                        <input type="password" id="nloginpwd" name="password" class="form-control form-control-lg input-block" placeholder="输入密码" tabindex="2" autocomplete="off"/>
                                        
                                  </dd>
                                </dl>

                                  <br/><div class="as1"><input type="checkbox" /><label for="cbtest" class="js-email-notice" >记住账号</label></div>
                                  <span class="as2"><a href="/weshare/forgive" >忘记密码?</a></span>
                                    <div style="width:80%;height:100px;position:relative;">
                                      <input type="JButton" class="btn btn-color1 btn-large btn-size1" style="position:absolute;left:10px;width:55%;" id="loginsubmit" value="登&emsp;陆"/>
                                      <a href="/weshare/register">
                                        <JButton style="position:absolute;min-width:50px;width:55%;top:40px;left:70%;" class="btn btn-color2 btn-large btn-size2" type="JButton">注&emsp;册</JButton>
                                      </a>
                                      </div>

                </form>
                <script type="text/javascript">
                	var redirectUrl = "${redirect}";
                	var LOGIN = {
                			checkInput:function() {
                				if ($("#loginname").val() == "") {
                					alert("用户名不能为空");
                					$("#loginname").focus();
                					return false;
                				}
                				if ($("#nloginpwd").val() == "") {
                					alert("密码不能为空");
                					$("#nloginpwd").focus();
                					return false;
                				}
                				return true;
                			},
                			doLogin:function() {
                				$.post("/weshare/user/login", $("#formlogin").serialize(),function(data){
                					if (data.status == 200) {
                						/* alert("登录成功！"); */
                						if (redirectUrl == "") {
                							location.href = "/weshare/file/itempage";
                						} else {
                							location.href = redirectUrl;
                						}
                					}
                					 if (data.status == 300) {
                						 alert("欢迎你!系统管理员！"); 
                						if (redirectUrl == "") {
                							location.href = "/weshare/background";
                						} else {
                							location.href = redirectUrl;
                						} 
                					} 
                					if(data.status == 400) {
                						alert(data.msg);
                						$("#loginname").select();
                					}
                					if(data.status == 500){
                						alert("对不起，你的号已经被冻结，原因是可能存在"+data.msg);
                						$("#loginname").select();
                					}
                				});
                			},
                			login:function() {
                				if (this.checkInput()) {
                					this.doLogin();
                				}
                			}

                	};
                	$(function(){
                		$("#loginsubmit").click(function(){
                			LOGIN.login();
                		});
                	});
                </script>

             </div>
            </div>
      </div>
    </div>
  </div>
 </div>

  <div class="footer container-lg p-responsive mt-6">
    <div class="d-flex flex-wrap py-5 mb-5" style="margin-left:20px;">
      <div class="col-12 col-md-2 mb-3" style="margin-right:20px;">
        <p class="textset1" style="font-size:20px;">WeShare<p>
        <p class="text-gray alt-text-small">
          © 2018
        </p>
      </div>
      <div class="col-6 col-sm-4 col-md-2 mb-3 pr-3"style="margin-left:20px;">
        <h4 class="mb-2"style="font-size:15px;">我们的平台</h4>
        <ul class="list-style-none text-gray">
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">世界</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">朋友圈</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">交友平台</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small no-wrap">共享资源</a></li>

        </ul>
      </div>
      <div class="col-6 col-sm-4 col-md-2 mb-3 pr-3"style="margin-left:20px;">
        <h4 class="mb-2"style="font-size:15px;">帮助</h4>
        <ul class="list-style-none">
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">使用条款</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">帮助文档</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">开源-OpenAPI</a></li>
        </ul>
      </div>
      <div class="col-6 col-sm-4 col-md-2 mb-3 pr-3"style="margin-left:20px;">
              <h4 class="mb-2"style="font-size:15px;">关于</h4>
        <ul class="list-style-none">
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">开发者</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">关于网站</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">了解更多</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">意见与建议</a></li>
        </ul>

      </div>
      <div class="col-6 col-sm-4 col-md-2 mb-3 pr-3"style="margin-left:20px;">
              <h4 class="mb-2"style="font-size:15px;">联系我们</h4>
        <ul class="list-style-none">

          
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">QQ：1029363172</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">email：1029363172@qq.com</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">微信：Yuhn</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">网站：weshare.com</a></li>
          <li class="lh-condensed mb-2"><a href="####" class="muted-link alt-text-small">tel：18361489220</a></li>
        </ul>

      </div>
    </div>
  </div>

</body>

</html>
