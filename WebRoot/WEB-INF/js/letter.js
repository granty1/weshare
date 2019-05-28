jQuery(document).ready(function(){

  var LOGIN = {
      checkInput:function() {


         if ($("#letterhead").val() == "") {
              alert("标题不能为空！");
           $("#letterhead").focus();
           return false;
         }         
         if ($("#msg").val() == "") {
             alert("内容不能为空！");
          $("#msg").focus();
          return false;
        }

        return true;
      },
      doLogin:function() {
        var manid= $("#lettersend").data("manid");
        var form = new FormData(document.getElementById("letterfor"));
        $.ajax({
          url:  "/weshare/priletter/sendpriletter/"+manid,
          data:form,
          type:"post",
          processData:false,
          contentType:false,
          success:function(data){
              //window.clearInterval(timer);

              alert("发送成功");
              location.href = "";
              console.log("over..");
          },
          error:function(data){
              alert("发送失败，"+data.msg);
              // location.href = "/weshare/file/itempage";

              //window.clearInterval(timer);
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
    $("#lettersend").click(function(){
      LOGIN.login();
    });
  });
  
  $('.theme-poptit .close').click(function(){
	  $('#theme-popover-mask').fadeOut(100);
	  $('#theme-popover').slideUp(200);
	})
	$('#quxiao').click(function(){
	$('#theme-popover-mask').fadeOut(100);
	$('#theme-popover').slideUp(200);
	})
  
})
