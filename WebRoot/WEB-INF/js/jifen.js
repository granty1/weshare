jQuery(document).ready(function($){
  $(".downurl").click(function(){
    var now = $(this);
    var checkurl = now.data("check");
    var downurl = now.data("url");
    $.ajax({
      url : checkurl ,
      processData:false,
      contentType:false,
      success : function(data) {
        if(data.data){
          var a = $("<a>");
          a.attr('href', downurl);
          a.attr("id","worldownclick");
          $('body').append(a);
          document.getElementById("worldownclick").click();
          a.remove();
        }
        else{
        	alert("您当前积分余额不足！");
        }

      },
      error : function(data) {
        alert(data.msg);

      }


    });


  });
  $("#huanyipi").click(function(){
	    
	    $.ajax({
	      url : "/weshare/file/select/bypage" ,
	      processData:false,
	      contentType:false,
	      success : function(data) {
	        if(data.data){
                $("#explore").load("/weshare/filelist").fadeIn('slow');
	        }
	        else{
	        	alert("没有可换的了哦~");
	        }

	      },
	      error : function(data) {
	        alert("error-"+data.msg);

	      }


	    });


	  });




})




