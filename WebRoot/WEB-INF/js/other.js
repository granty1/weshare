jQuery(document).ready(function($){

	$(".focusbtn").click(function(){

	    var now = $(this);

/*      $("JButton.d-none").removeClass("d-none");
      now.addClass("d-none");*/
//
      $.ajax({
            url : "/weshare/focus/addfocus",
            processData:false,
            contentType:false,
            success : function(data) {
              if(data.data){
        
                  now.text("√已关注");
                 

              }
              else{
      
                  now.text("+关注");
               
              }

            },
            error : function(data) {
              alert("关注失敗！" + data.msg);

            }
          });
	});
})
	$(".focusbtn1").click(function(){
			var now = $(this);
			var username = now.data("id");
			$.ajax({
						url : "/weshare/focus/addfocusByOther?beFocusName="+username,
						processData:false,
						contentType:false,
						success : function(data) {
							if(data.data){

									now.text("√已关注");
							}
							else{
									now.text("+关注");
							}

						},
						error : function(data) {
							alert("关注失敗！" + data.msg);

						}
					});
	});