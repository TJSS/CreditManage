

$(document).ready(function(event){
	var width = $(window).width();
	$("body").css("font-size", width*18/720);
	if(window.chrome) {
	  $('.theBanner li').css('background-size', '100% 100%');
	}
	$('.theBanner').unslider({
	  fluid: true,  //响应式
	  speed: 500,   //速度         
	  delay: 2500,  //延迟
	  dots: true    //点
	});	
});