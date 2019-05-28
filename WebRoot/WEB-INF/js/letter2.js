jQuery(document).ready(function(){
	
	


  
  //私信内容浮动窗口----------------------------------------------------
  $('.letterclick').click(function(){
/*    $('#theme-popover-mask').fadeIn(100);
    $('#theme-popover').slideDown(200);*/	  
	  var letterthis = $(this);
	  var weidu = letterthis.find("#weidu");
	  weidu.text(" ");
    var letterid= letterthis.data("letterid");
    $.ajax({
      url:  "/weshare/priletter/selectpriletterdesc/"+letterid,

      type:"post",
      processData:false,
      contentType:false,
      success:function(data){
         $("#ltittle").text(data.pTitle);
         $("#lname").text(data.authorName);
         $("#msg").text(data.pTitle);
         $('#theme-popover-mask').fadeIn(100);
         $('#theme-popover').slideDown(200);
         $('#msg').html($('#msg').val());
         $('#msg').emotionsToHtml();
         
    	 

      },
      error:function(data){
          alert("打开失败，"+data.msg);
          // location.href = "/weshare/file/itempage";

          //window.clearInterval(timer);
      }

    });

})

 //文章内容浮动窗口----------------------------------------------------

  


$("#letteranswer").click(function(){
  $('#theme-popover-mask-1').fadeIn(100);
  $('#theme-popover-1').slideDown(200);

});
$('.theme-poptit .close').click(function(){
$('#theme-popover-mask-1').fadeOut(100);
$('#theme-popover-1').slideUp(200);
})
$('#quxiao-1').click(function(){
$('#theme-popover-mask-1').fadeOut(100);
$('#theme-popover-1').slideUp(200);
})


  $('.theme-poptit .close').click(function(){
  $('#theme-popover-mask').fadeOut(100);
  $('#theme-popover').slideUp(200);
})
$('#quxiao').click(function(){
$('#theme-popover-mask').fadeOut(100);
$('#theme-popover').slideUp(200);
})






var LOGIN = {
    checkInput1:function() {


       if ($("#letterhead1").val() == "") {
            alert("标题不能为空！");
         $("#letterhead").focus();
         return false;
       }         
       if ($("#msg1").val() == "") {
           alert("内容不能为空！");
        $("#msg").focus();
        return false;
      }

      return true;
    },
    doLogin1:function() {
//    	alert(data.authorName);
      
      var manname = $("#lname").html();
  
      var form = new FormData(document.getElementById("letterfor1"));
      $.ajax({
        url:  "/weshare/priletter/answer/"+manname,
        data:form,
        type:"post",
        processData:false,
        contentType:false,
        success:function(data){
            //window.clearInterval(timer);

            alert("回复成功");
            $('#theme-popover-mask-1').fadeOut(100);
            $('#theme-popover-1').slideUp(200);
            
        },
        error:function(data){
            alert("发送失败，"+data.msg);
            // location.href = "/weshare/file/itempage";

            //window.clearInterval(timer);
        }

      });

         },
    login1:function() {
      if (this.checkInput1()) {
        this.doLogin1();
      }
    }
};
$(function(){
  $("#lettersend-answer").click(function(){
    LOGIN.login1();
  });
});





})
$(function(){
	$(".leterdel1").click(function(event){
	   
		event.stopPropagation();
	});
	$(".leteraname1").click(function(event){
		   
		event.stopPropagation();
	});

});

