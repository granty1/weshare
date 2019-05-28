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
      <div class="" style="position:relative;top:100px;left:400px;">
    <div class="setup-header setup-org">
        <h1 style="width:200px;">WeShare</h1><span class="lead myfont" style="font-size:20px;float:left;">——丢三落四者的密码找回</span>
        
    </div>

    <div class="setup-main">
      <div class="setup-form-container">
        


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
                <div>
                <div id="select-regName">
                    <label autocapitalize="off" autofocus="autofocus"><b class="ftx04">*</b>手机号</label>
                    <div>
                        <div>
                            <input type="text" id="phone" name="uPhone" tabindex="1" autoComplete="off"
                                   class="form-control myform-control"
                                   
                                   onpaste="return false;"
                                   />
    
                        </div>
                    </div>
                </div><br/>
                <div id="o-password">
                    <div>
                        <label autocapitalize="off" autofocus="autofocus"><b class="ftx04">*</b>设置新密码(请输入6~12位之间的字符)</label>
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
                    
                    <div>
                    <span class="label">&nbsp;</span>
                    <input type="JButton" class="btn btn-color1 btn-large btn-size3" id="registsubmit" value="立即找回" tabindex="8"
                           clstag="regist|keycount|personalreg|07"
                           style="left:-15px;"
                           data-disable-with="Creating account…"
                           onclick="REGISTER.reg();"/>
                </div>

					</div>
          </div>
          <div class="paiban1">

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
  			
  			if ($("#phone").val() == "") {
  				alert("手机号不能为空");
  				$("#phone").focus();
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
  				//检查用户名与手机号是否匹配
  				$.ajax({
    	            	url : "/weshare/user/findpassword/"+escape($("#regName").val())+"/"+escape($("#phone").val()),
    	            	success : function(data) {
    	            		if (data.data) {
    	            			//该用户名与手机号一致
    	            			//更新新密码
    	            			REGISTER.doSave();
    	            		} else {
    	            			alert(data.msg);
    	            			$("#regName").select();
    	            		}
    	            	}
  				});
  
  		}, 
  		doSave:function() {
  			$.ajax({
  			url:"/weshare/user/savefindpassword/"+escape($("#regName").val())+"/"+escape($("#pwd").val()),
  			success : function(data){
  				if(data.data){
  					REGISTER.login();
  				}else{
  					alert(data.msg);
  				}
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
