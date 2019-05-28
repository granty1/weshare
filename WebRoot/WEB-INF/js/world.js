var type = 0;

jQuery(document).ready(function($){
  
  $("#explore").load("/weshare/filelist");
  var sId = $(".selected").data("id");  //获取data-id的值
  window.location.hash = sId;  //设置锚点
  $("#naveach .tabnav-tab").each(function(index){

    $(this).click(function(){
      var sId = $(this).data("id");  //获取data-id的值
      window.location.hash = sId;  //设置锚点
      $("#naveach .tabnav-tab.selected").removeClass("selected");
      $(this).addClass("selected");
      type = index;
      if(index==0)
      {
        $("#explore").load("/weshare/filelist").fadeIn('slow');
      }
      else if(index==1){
        $("#explore").load("/weshare/userlist").fadeIn('slow');
      }
    });
  });




	//點擊搜索
	$(".subnav-search-icon").click(function() {
		searchclick();
		$("#keyWord").blur();
	});

	/*  //回車鍵搜索
		$("#keyWord").onkeydown=function(event){
	     var e = event || window.event || arguments.callee.caller.arguments[0];
	      if(e && e.keyCode==13){ // enter 键
	    	  $(".subnav-search-icon").click();
	    	  return false;
	        }

	   };*/

	document.onkeydown = function(event) {
		var e = event || window.event || arguments.callee.caller.arguments[0];
		if (e && e.keyCode == 13) { // enter 键
			searchclick();
			$("#keyWord").blur();

		}
	};

//  //关注
//  $(".focusbtn1").click(function(){
//			var now = $(this);
//			alert("111111111111");
//			var username = now.data("id");
//			$.ajax({
//						url : "/weshare/focus/addfocusByOther?beFocusName="+username,
//						processData:false,
//						contentType:false,
//						success : function(data) {
//							if(data.data){
//
//									now.text("√已关注");
//							}
//							else{
//									now.text("+关注");
//							}
//
//						},
//						error : function(data) {
//							alert("关注失敗！" + data.msg);
//
//						}
//					});
//	});


})
//收藏函数
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
//        jqobj.unbind("click");

        alert("收藏成功！");


        },
        error : function(data) {
          alert("收藏失敗！" + data.msg);

        //window.clearInterval(timer);
        }
      });

}

//搜索函數
function searchclick()
{
  if ($("#keyWord").val() != "") {
    $.ajax({
      url : "/weshare/file/select/by/" + $("#keyWord").val()+"/"+type,
      type : "get",
      success : function(data) {
        if (data.data) {
        	if(type==0){
                $("#explore").load("/weshare/filelist").fadeIn('slow');
        	}
        	else{
        		$("#explore").load("/weshare/userlist").fadeIn('slow');
        	}
        } else {
          alert("没有找到哦");

        }
      },
      error : function(data) {
        alert("查询失败11111，" + data.msg);

      //window.clearInterval(timer);
      }
    });
  }else{
    $.ajax({
      url : "/weshare/file/select/byNull/"+type,
      type : "get",
      success : function(data) {
        if (data.data) {
        	if(type==0){
                $("#explore").load("/weshare/filelist").fadeIn('slow');
        	}
        	else{
        		$("#explore").load("/weshare/userlist").fadeIn('slow');
        	}
        } else {
          alert("没有找到哦");

        }
      },
      error : function(data) {
        alert("查询失败222222，" + data.msg);

      //window.clearInterval(timer);
      }
    });
  }

}
