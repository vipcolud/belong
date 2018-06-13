$(function() {
	$.post(ctx + "video/query", function(r) {
		if (r.code == 0) {
			var data = JSON.parse(r.msg)
			var videohtml="";
			var videolen=data.dataList[0].contList;
			  for(i in videolen) { 
				  videohtml ='<h3>'+data.dataList[0].contList[i].name+'</h3>';
				  videohtml +='<video src='+data.dataList[0].contList[i].coverVideo+'  controls="controls">';	
				  $(".card").append(videohtml)
			  }	
		} else {
           console.log("查询天气失败，请联系网站管理员！");
		}
	});
});