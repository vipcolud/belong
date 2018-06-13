$(function(){
		$.post(ctx+"one/oneList",function(r){
			if(r.code == 0){
				var data = JSON.parse(r.msg);
				var paint = data.data.content_list;
				for(i in paint) {		
				  $(".slider").find("#"+i+"").attr("src",paint[i].img_url); 
				  $("#p"+i+"").text(paint[i].forward);
				}
				
			}else{
				$MB.n_danger(r.msg);
			}
		});
	});