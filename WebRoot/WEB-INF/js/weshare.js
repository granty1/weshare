//
jQuery(document).ready(function($) {

  //文件上传浮动窗口----------------------------------------------------
    $('#upload').click(function(){
    $('#theme-popover-mask').fadeIn(100);
    $('#theme-popover').slideDown(200);
  })
    $('.theme-poptit .close').click(function(){
    $('#theme-popover-mask').fadeOut(100);
    $('#theme-popover').slideUp(200);
  })
  
  //文章上传窗口-----------------------------------------------------------
  $('#upload1').click(function(){
    $('#theme-popover-mask').fadeIn(100);
    $('#theme-popover1').slideDown(200);
  })
    $('.theme-poptit .close').click(function(){
    $('#theme-popover-mask').fadeOut(100);
    $('#theme-popover1').slideUp(200);
  })


 //下拉--------------------------------------------------------------------
 $("#ul_se li .showinfo1").click(function(){

   var now = $(this);
   var now_sanjiao = now.find("span");
   var now_paren = now.parent();
   var now_file = now_paren.find(".fileinfo");
   if(now_sanjiao.hasClass("dot-bottom")){
     now_sanjiao.removeClass("dot-bottom");
     now_sanjiao.addClass("dot-top");
     now_file.fadeIn(100);

   }
   else{
     // $("#sanjiao").removeClass("dot-top");
     now_sanjiao.addClass("dot-bottom");
     now_file.fadeOut(100);
   }
 });
    
    
 $("#ul_se li .showinfo2").click(function(){
   var now = $(this);
   var now_sanjiao = now.find("span");
   var now_paren = now.parent();
   var now_file = now_paren.find(".fileinfo1");
   if(now_sanjiao.hasClass("dot-bottom")){
     now_sanjiao.removeClass("dot-bottom");
     now_sanjiao.addClass("dot-top");
     now_file.fadeIn(100);

   }
   else{
     now_sanjiao.addClass("dot-bottom");
     now_file.fadeOut(100);
   }
 });


//小头像悬停

    $("#dianji").mouseover(function(){
    	$('#xiala ul').fadeIn();
      /*$("#xiala ul").css("display","block");*/
    });
    $("#xiala").mouseleave(function(){
       $('#xiala ul').fadeOut();
      // $("#xiala ul").css("display","none");
    });




// 文件上传校验-----------------------------------------------------





    var LOGIN = {
        checkInput:function() {



          if ($("#selectfile").val() == "") {
            alert("没有选择上传文件");
            // $("#selectfile").focus();
            return false;
          }
          if ($("#fileName").val() == "") {
            alert("资源名称不能为空");
            $("#fileName").focus();
            return false;
          }
          if ($("#filetext").val() == "") {
            alert("资源描述不能为空");
            $("#filetext").focus();
            return false;
          }
          if ($("#filetext").val().length < 6) {
            alert("资源描述小于6个字符");
            $("#filetext").focus();
            return false;
          }
          return true;
        },
        doLogin:function() {

          form = new FormData(document.getElementById("formuploadfile"));
          xhr = $.ajaxSettings.xhr();
          $("#loginsubmit").attr("disabled", true);
          $.ajax({
              url:"/weshare/file/upload",
              type:"post",
              data:form,
              cache: false, // 是否缓存
              async: true, // 是否异步执行
              processData:false,
              contentType:false,
              xhr: function() {
                  if (onprogress && xhr.upload) {
                      xhr.upload.addEventListener("progress", onprogress, false);
                      return xhr;
                  }
              },
              success:function(data){
                  //window.clearInterval(timer);
                  alert("上传成功");
                  $("#loginsubmit").attr("disabled", false);
                  $("#loginsubmit").attr("value","提交");
                  console.log("over..");
                  location.href = "/weshare/file/itempage";
              },
              error:function(data){
                  alert("上传失败，"+data.msg);
                  $("#loginsubmit").attr("disabled", false);
                  $("#loginsubmit").attr("value","提交");
                  $("#fileName").select();
                  //window.clearInterval(timer);
              }
          });
           $("#loginsubmit").attr("value","提交");

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
    
    
    
    
    
    
 // 发表文章校验-----------------------------------------------------





    var Article = {
        checkInput:function() {
          if ($("#aName").val() == "") {
            alert("文章标题不能为空");
            $("#aName").focus();
            return false;
          }
          if ($("#aText").val() == "") {
            alert("文章内容不能为空");
            $("#aText").focus();
            return false;
          }
          return true;
        },
        doLogin:function() {

          form = new FormData(document.getElementById("formarticle"));
          //xhr = $.ajaxSettings.xhr();
          $.ajax({
              url:"/weshare/article/add",
              type:"post",
              data:form,
              cache: false, // 是否缓存
              async: true, // 是否异步执行
              processData:false,
              contentType:false,
              /*xhr: function() {
                  if (onprogress && xhr.upload) {
                      xhr.upload.addEventListener("progress", onprogress, false);
                      return xhr;
                  }
              },*/
              success:function(data){
                  //window.clearInterval(timer);
                  alert("发表成功");
                  console.log("over..");
                  location.href = "/weshare/file/itempage";
              },
              error:function(data){
                  alert("上传失败，"+data.msg);
                  $("#aName").select();
                  //window.clearInterval(timer);
              }
          });
           $("#articlesubmit").attr("value","提交");

             },
        login:function() {
          if (this.checkInput()) {
            this.doLogin();
          }
        }
    };
    $(function(){
      $("#articlesubmit").click(function(){
    	  Article.login();
      });
    });


    //导航栏浮动----------------------------------------------------------------
    $(function(){
      var nav1 = $("#mynav1");
      var nav2 = $("#mynav2");
      var myinfo1 = $("#myinfo1");
      var myinfo2 = $("#myinfo2");
      var myfloat = $("#myfloat-left");
      var win = $(window);
      var doc = $(document);
      var scroTop = $(window).scrollTop();//获取滚动条的高度
      //获取div距离顶部的距离
      var mTop1 = nav2[0].offsetTop;
      var mTop2 = myinfo2[0].offsetTop;
      // $(window).resize(function () {          //当浏览器大小变化时
      //   var fixleft = myfloat.offsetLeft;
      //   nav2.css("left",fixleft+221);
      //  });
      win.scroll(function(){  //滚动条变化时

        var myfloatwidth = myfloat.width();
        if(doc.scrollTop()>=mTop1+4){

            nav2.addClass("mynav");
            nav1.css("display","block");
            nav2.css("position","fixed");


        }else{
          nav2.removeClass("mynav");
          nav1.css("display","none");
          nav2.css("position","static");
          nav2.css("margin-left","0");

        }
        if(doc.scrollTop()>=mTop1+300){
            myinfo2.addClass("mynav2");
            myinfo2.css("display","block");
            myinfo2.css("position","fixed");
            myinfo1.css("display","block");


        }else{

          myinfo2.removeClass("mynav2");
          myinfo1.css("display","none");
          myinfo2.css("position","static");
          myinfo2.css("display","none");



        }
      });
    })


})


function uploadfile(event)
{
  var event = event || window.event,
       selectfile = $("#selectfile").get(0).files[0],
       ssize = selectfile.size / 1054000,  //mb
       stype = selectfile.type || "获取失败",
       zurl  = window.URL.createObjectURL(selectfile);//文件临时地址
        document.getElementById('textName').value = "共："+ssize.toFixed(2)+"MB.   " + document.getElementById('selectfile').value;
       //$('#textName').value = this.value;//
}

function onprogress(event)
{
  var event = event || window.event;
  console.log("已经上传：" + event.loaded);

  var loaded = Math.floor(100 * (event.loaded / event.total)); //已经上传的百分比
  $("#loginsubmit").attr("value",loaded + "%...");
}


//文件收藏

function coll(obj)
{
	var jqobj = $(obj);
	var sId = jqobj.data("id");
	var img = jqobj.find("img");
	$.ajax({
      url : "/weshare/collect/add?fileName=" + sId,
      type : "get",
      success : function(data) {

      img.attr("src","/weshare/img/coll-2.png");
      jqobj.attr("onclick","return false;");
//      jqobj.unbind("click");

      alert("收藏成功！");


      },
      error : function(data) {
        alert("收藏失敗！" + data.msg);

      //window.clearInterval(timer);
      }
    });

}
