

/*JQuery(document).ready(function(){*/


   // 资料修改上传校验-----------------------------------------------------
       var LOGIN = {
           checkInput:function() {
           //在这里校验，本次资料修改全通过h5新特性校验
             return true;
           },
           doUp:function() {
             var form = new FormData(document.getElementById("selfinfoup"));
             $.ajax({
                 url:"/weshare/user/saveupdate",
                 type:"post",
                 data:form,
                 processData:false,
                 contentType:false,
                 success:function(data){
                     alert("修改成功");
                     window.location.href = "/weshare/user/updateinformation";
                 },
                 error:function(data){
                     alert("上传失败，"+data.msg);

                     //window.clearInterval(timer);
                 }
             });

                },
           Up:function() {
             if (this.checkInput()) {
               this.doUp();
             }
           }
       };
       $(function(){
         $("#selfinfobtn").click(function(){
           LOGIN.Up();
         });
       });



       //密码修改
       $("#passwordbtn").click(function(){
         var form = new FormData(document.getElementById("change_password"));
         var newp = $("#newpassword").val();
         var oldp = $("#oldpassword").val();
         $.ajax({
             url:"/weshare/user/changepass/"+oldp+"/"+newp,
             type:"post",
             data:form,
             processData:false,
             contentType:false,
             success:function(data){
            	 if(data.data){
            		 alert("修改成功!");
            		 window.location.href = "/weshare/changepass";
            	 }else{
            		 alert("旧密码输入错误！");
            	 }
                 
             },
             error:function(data){
                 alert("修改失败，"+data.msg);

                 //window.clearInterval(timer);
             }
         });





       });
       
       
       
       
       
       
       
       $(function() {
    	   $("#imgupload").click(function () {

    	   $("#imgupload").change(function(){
    	     var objUrl = getObjectURL(this.files[0]) ; //获取图片的路径，该路径不是图片在本地的路径
    	     var size = this.files[0].size/1024;

    	     if(size<=2048){
    	       if (objUrl) {
    	         $("#uploadimg").attr("src", objUrl) ; //将图片路径存入src中，显示出图片
    	       }
    	     }
    	     else{
    	       alert("不得上传超过2mb的图片");
    	     }


    	   });

    	   });
    	   });



    	   //建立一個可存取到該file的url
    	   function getObjectURL(file) {
    	     var url = null ;
    	     if (window.createObjectURL!=undefined) { // basic
    	     url = window.createObjectURL(file) ;
    	     } else if (window.URL!=undefined) { // mozilla(firefox)
    	     url = window.URL.createObjectURL(file) ;
    	     } else if (window.webkitURL!=undefined) { // webkit or chrome
    	     url = window.webkitURL.createObjectURL(file) ;
    	     }
    	     return url ;
    	   }








/* })*/
