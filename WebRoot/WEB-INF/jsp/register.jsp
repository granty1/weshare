<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
    <link rel="stylesheet" media="screen" href="css/frameworks.css">
    <link rel="stylesheet" media="screen" href="css/site.css">
    <link rel="stylesheet" media="screen" href="css/weshare.css">
    <script type="text/javascript" src="./js/jquery-1.6.4.js"></script>
</head>

<body class="logged-out env-production page-responsive min-width-0 f4 intent-mouse">
  <div role="main" class="application-main ">

      <div id="js-pjax-container">


<div class="bg-shade-gradient" style="height: 600px;">
  <div class="margincenter">
    <div class="">
      <div class="paiban3">
    <div class="setup-header setup-org">
        <h1>Join WeShare</h1>
        <p class="lead myfont">欢迎注册WeShare-For better learning and sharing</p>
    </div>

    <div class="setup-main">
      <div class="setup-form-container">
        <noscript>
          <p class="error">WeShare does not support browsers with JavaScript disabled.<br>
          We promise we’ll behave.</p>
        </noscript>


        <form id="personRegForm" accept-charset="UTF-8" action="/join" autocomplete="off"  method="post" onsubmit="return false;">
            <div onselectstart="return false;">
              <div>
                <div id="select-regName">
                    <label autocapitalize="off" autofocus="autofocus"><b class="ftx04">*</b>用户名(请输入4~12位之间的字符)</label>
                    <div>
                        <div>
                            <input type="text" id="regName" name="username" tabindex="1" autoComplete="off"
                                   class="form-control myform-control"
                                   
                                   onpaste="return false;"
                                   value=""
                                   onfocus="if(this.value=='') this.value='';this.style.color='#333'"
                                   onblur="if(this.value=='') {this.value='';this.style.color='#999999'}"/>
    
                        </div>
                    </div>
                </div><br/>
                <div id="o-password">
                    <div>
                        <label autocapitalize="off" autofocus="autofocus"><b class="ftx04">*</b>设置密码(请输入6~12位之间的字符)</label>
                        <div>
                            <input type="password" id="pwd" name="password" tabindex="2"
                                   class="form-control myform-control"
                                   
                                   style="ime-mode:disabled;"
                                   onpaste="return  false" autocomplete="off"/>
  
                        </div>
                    </div><br/>

                    <div>
                        <label autocapitalize="off" autofocus="autofocus"><b class="ftx04">*</b>确认密码</label>
                        <div>
                            <input type="password" id="pwdRepeat" name="pwdRepeat" tabindex="3"
                                   class="form-control myform-control"
                                   
                                   onpaste="return  false" autocomplete="off"/>
                            <i class="i-pass"></i>
                            <label id="pwdRepeat_succeed" class="blank"></label>
                            <label id="pwdRepeat_error"></label>
                        </div>
                    </div><br/>

					</div>
          </div>
          <div class="paiban1">
          <div>
            <label autocapitalize="off" autofocus="autofocus"> 性别</label><br/>
            <input   type="radio" name="uSex" value="男" checked="checked">男
            &emsp;
            <input   type="radio" name="uSex" value="女" >女
          </div><br/>
          <div>
            <label autocapitalize="off" autofocus="autofocus"> 职业</label><br/>
            <select name="uOccu" class="form-control myform-control">
              <option value="计算机/互联网/通信" >计算机/互联网/通信</option>
              <option value="生产/工艺/制造" >生产/工艺/制造</option>
              <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
              <option value="文化/广告/传媒" >文化/广告/传媒</option>
              <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
              <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
              <option value="学生" >学生</option>
              <option value="其他" >其他</option>
            </select>
          </div><br/>
          <div id="dphone">
            <label autocapitalize="off" autofocus="autofocus"><b class="ftx04">*</b>手机号</label><br/>
						<div class="fl item-ifo">
							<input type="text" id="phone" maxlength="11" name="uPhone"
								class="form-control myform-control" tabindex="4"
								autocomplete="off" /> <i class="i-phone"></i> <label
								id="phone_succeed" class="blank"></label> <label
								id="phone_error"></label>
						</div>
					</div>
         </div>     <!--paiban1 -->
         <div class="paiban2">
                <div>
                    <span class="label">&nbsp;</span>

                    <div class="lead myfont1">
                        <input type="checkbox" class="checkbox" checked="checked" id="readme"
                               onclick="agreeonProtocol();">
                        <label for="protocol">我已阅读并同意<a href="#" class="blue" id="protocol">《网络文明公约》</a></label>
                        <span class="clr"></span>
                        <label id="protocol_error" class="error hide">请接受服务条款</label>
                        <label>如果您已拥有一个WeShare账号，可以选择<a href="/weshare">-登陆</a></label>
                    </div>
                </div>
                <div>
                    <span class="label">&nbsp;</span>
                    <input type="JButton" class="btn btn-color1 btn-large btn-size3" id="registsubmit" value="立即注册" tabindex="8"
                           clstag="regist|keycount|personalreg|07"
                           data-disable-with="Creating account…"
                           onclick="REGISTER.reg();"/>
                </div>
            </div>
          </div>
            <span class="clr"></span>
        </form>
    </div>
      </div> <!-- /.setup-form-container -->
    </div>
    </div> <!-- /.setup-main -->
  </div>
    </div>
      </div>
      <div class="modal-backdrop js-touch-events"></div>
  </div>
  <script type="text/javascript">
 
//正则匹配手机格式
function  IsMobile(text){
    var _emp=/^\s*|\s*$/g;
    text=text.replace(_emp,"");
    var _d=/^1[3578][01379]\d{8}$/g;
    var _l=/^1[34578][01256]\d{8}$/g;
    var _y=/^(134[012345678]\d{7}|1[34578][012356789]\d{8})$/g;
    if(_d.test(text)){
    return true;
   } else if(_l.test(text)){
   return true;
  }else if(_y.test(text)){
  return true;
 }
 return false;
  	}
function checkU() { //检查用户名  
  		var u = document.getElementById("regName");
  		if (u.value.length < 4 || u.value.length > 12) {		
  			return false;
  		} else {
  			return true;
  		}
 }
 function check() { //检查密码格式
  		var u = document.getElementById("pwd");
  		if (u.value.length < 6 || u.value.length > 12) {		
  			return false;
  		} else {
  			return true;
  		}
 }
  	var REGISTER={
  		 
  		inputcheck : function() {
  		var yh = /^[a-zA-Z0-9_-]{4,12}$/;
  			//不能为空检查
  			if ($("#regName").val() == "") {
  				alert("用户名不能为空！");
  				$("#regName").focus();
  				return false;
  			}
  			var regn = $("#regName").val()
  			if (!yh.test(regn)){
  				alert("用户名不能包含中文！");
  				$("#regName").focus();
  				return false;
  			}  			
  			if ($("#pwd").val() == "") {
  				alert("密码不能为空");
  				$("#pwd").focus();
  				return false;
  			}
  			if ($("#phone").val() == "") {
  				alert("手机号不能为空");
  				$("#phone").focus();
  				return false;
  			}
  			if (!IsMobile($("#phone").val())) {
  				alert("手机号格式不正确！");
  				$("#phone").focus();
  				return false;
  			}
  			if (!checkU()) {
  				alert("用户名格式不正确！");
  				$("#regName").focus();
  				return false;
  			}
  			if (!check()) {
  				alert("密码格式不正确！");
  				$("#pwd").focus();
  				return false;
  			}
  			//密码检查
  			if ($("#pwd").val() != $("#pwdRepeat").val()) {
  				alert("确认密码和密码不一致，请重新输入！");
  				$("#pwdRepeat").select();
  				$("#pwdRepeat").focus();
  				return false;
  			}
  			return true;
  		},
  		 beforeSubmit:function() {
  				//检查用户是否已经被占用
  				$.ajax({
    	            	url : "/weshare/user/check/"+escape($("#regName").val())+"/1",
    	            	success : function(data) {
    	            		if (data.data) {
    	            			//检查手机号是否存在
    	            			$.ajax({
    	            				url :"/weshare/user/check/"+$("#phone").val()+"/2",
  				            	success : function(data) {
  				            		if (data.data) {
  					            		REGISTER.doSubmit();
  				            		} else {
  				            			alert("此手机号已经被注册！");
  				            			$("#phone").select();
  				            		}
  				            	}
    	            			});
    	            		} else {
    	            			alert("此用户名已经被占用，请选择其他用户名");
    	            			$("#regName").select();
    	            		}
    	            	}
  				});
  
  		}, 
  		doSubmit:function() {
  			$.post("/weshare/user/register",$("#personRegForm").serialize(), function(data){
  				if(data.status == 200){
  					alert('用户注册成功，请登录！');
  					REGISTER.login();
  				} else {
  					alert("注册失败！");
  				}
  			});
  		},
  		login:function() {
  			 location.href = "/weshare";
  			 return false;
  		},
  		reg:function() {
  			if (this.inputcheck()) {
  				this.beforeSubmit();
  				//this.doSubmit();
  			}
  		}
  	};
  </script>


</body>

</html>
