<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Mihstore A Ecommerce Category Flat Bootstarp Resposive Website Template | Single :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mihstore Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>
<!--//fonts-->
<!--//slider-script-->
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close2').on('click', function(c){
		$('.message2').fadeOut('slow', function(c){
	  		$('.message2').remove();
		});
	});	  
});
</script>
<link rel="stylesheet" href="css/etalage.css">
<script src="js/jquery.etalage.min.js"></script>
		<script>
			jQuery(document).ready(function($){

				$('#etalage').etalage({
					thumb_image_width: 300,
					thumb_image_height: 400,
					source_image_width: 900,
					source_image_height: 1200,
					show_hint: true,
					click_callback: function(image_anchor, instance_id){
						alert('Callback example:\nYou clicked on an image with the anchor: "'+image_anchor+'"\n(in Etalage instance: "'+instance_id+'")');
					}
				});

			});
		</script>
		<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
				</script>
				<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>		
</head>
<body> 


<!--header-->
	<div class="container">
		<!-- header-top -->
		<jsp:include page="header/header-top.jsp"></jsp:include>
		<!-- header-top -->
		<!-- header-bottom -->
		<jsp:include page="header/header-bottom.jsp"></jsp:include>
		<!-- header-bottom -->
		
		
		<div class="content">

			<div class="col-md-9">
			<div class="col-md-5 single-top">	
						<ul id="etalage">
							<li>
								<a href="optionallink.jsp">
									<img class="etalage_thumb_image img-responsive" src="images/hinh1.jpg" alt="" >
									<img class="etalage_source_image img-responsive" src="images/hinh1.jpg" alt="" >
								</a>
							</li>
							<li>
								<img class="etalage_thumb_image img-responsive" src="images/hinh1.2.jpg" alt="" >
								<img class="etalage_source_image img-responsive" src="images/hinh1.2.jpg" alt="" >
							</li>
							<li>
								<img class="etalage_thumb_image img-responsive" src="images/hinh1.3.jpg" alt=""  >
								<img class="etalage_source_image img-responsive" src="images/hinh1.3.jpg" alt="" >
							</li>
						</ul>

					</div>	
					<div class="col-md-7 single-top-in">
						<div class="single-para">
							<h4>Laptop ASUS ZenBook 13 UX333FA-A4011T (13.3" FHD/i5-8265U/8GB/256GB SSD/UHD 620/Win10/1.2 kg)</h4>
							<div class="para-grid">
								<span  class="add-to">22.990.000đ</span>
								<a href="#" class=" cart-to">Add to Cart</a>					
								<div class="clearfix"></div>
							 </div>
								<a href="#" class="cart-an ">More details</a>
							<div class="share">
							<h4>Share Product :</h4>
							<ul class="share_nav">
								<li><a href="#"><img src="images/facebook.png" title="facebook"></a></li>
								<li><a href="#"><img src="images/gpluse.png" title="Google+"></a></li>
				    		</ul>
						</div>
						</div>
					</div>
				<div class="clearfix"> </div>
 <ul id="flexiselDemo1">
			<li><img src="images/hinh2.jpg" /><div class="grid-flex"><a href="#">ASUS ZenBook 13</a><p>22.990.000</p></div></li>
			<li><img src="images/hinh4.jpg" /><div class="grid-flex"><a href="#">HP Pavilion</a><p>13.390.000</p></div></li>
			<li><img src="images/hinh6.jpg" /><div class="grid-flex"><a href="#">Acer Nitro 5</a><p>20.990.000</p></div></li>
			<li><img src="images/hinh5.jpg" /><div class="grid-flex"><a href="#">Dell Vostro</a><p>14.990.000</p></div></li>
			<li><img src="images/hinh9.jpg" /><div class="grid-flex"><a href="#">Dell Inspiron</a><p>17.390.000</p></div></li>
		 </ul>
		 
		 
		 
	    <script type="text/javascript">
		 $(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems: 5,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	</script>
	
	<script type="text/javascript" src="js/jquery.flexisel.js"></script>
			</div>
			<div class="clearfix"> </div>
		</div>
		<!---->
		<footer>
			<jsp:include page="footer/footerlv1.jsp"></jsp:include>
		</footer> 
	</div>

	<!---->
</body>
</html>