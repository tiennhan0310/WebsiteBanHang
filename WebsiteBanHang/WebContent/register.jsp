<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Mihstore A Ecommerce Category Flat Bootstarp Resposive Website Template | Account :: w3layouts</title>
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
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>

<!--  script bat loi -->
<script >
$(document).ready(function() {
	

    function validateEmail(sEmail) {
        var filter = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
        if (filter.test(sEmail)) {
            return true;
        } else {
            return false;
        }
    }
    $('#myform').bind({
        'submit': function() {
            if (!validateEmail($('#UserName').val())) {
                $('#UserName').css('color','red');
                $('#error_username').html('Bạn không được bỏ trống trường này!!!');
                return false;
            }
            if ($('#pwd').val()=='') {
                $('#error_pass').html('Bạn không được bỏ trống trường này!!!');
                return false;
            }
            return true;
        },
        'keydown': function() {
            if ($('#email').val().length > 0) {
                $('#error_email').html('');
            }
            if ($('#pwd').val().length > 0) {
                $('#error_pass').html('');
            }
        }
    });
});
</script>



				<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>		
</head>
<body> 
	
		<div class="account-in register-top">
							<h2>Register</h2>
							<div class=" account-top register">
								<form>
								<div> 	
									<span>Name*</span>
									<input type="text"> 
								</div>
								<div> 	
									<span>Email*</span>
									<input type="text"> 
								</div>
								<div> 
									<span  class="pass">Password*</span>
									<input type="password">
								</div>	
								<div> 
									<span  class="pass">Nhập lại Password*</span>
									<input type="password">
								</div>			
									<input type="submit" value="Đăng kí"> 
								</form>
							</div>
							
					</div>	

	
		
</body>
</html>