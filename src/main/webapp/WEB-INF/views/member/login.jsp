<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login -MovieCritic</title>
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<style>

#login_box{
	border : 1px solid lightgray;
	width: 300px;
	height: 300px;
	margin: 200px auto;
}

h3, p{
	text-align:center;
}

p {
	background: darkblue;
	color: white;
	width: 250px;
	margin: 0 auto;
}

#or{
	text-align:center;
	margin: 5px 0 5px;
}

#id_box, #pw_box{
	margin-left: 25px;
	margin-top: 5px;
	
}

.login{
	width: 250px;
	height: 25px;
	border-radius: 5px;
	border : 1px solid gray;
}

#forgot{
	text-align:center;
	margin-top:10px;
}

#login_btn{
	text-align:center;
	background:black;
	color:white;
	width:270px;
	height:30px;
	margin: 13px 15px;
	padding-top: 3px;
}

#foot{
	text-align:center;
	font-size:12px;
}

</style>
</head>

<body>

<!-- 절대경로 -->
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>

<div id="site_layout">

	<!--movieCri-->
	<!-- 상단 메뉴-->

   <div id="top_menu_wrapper">
	<div id="top_menu">

		<nav id="top_menu1">
		<ul id="left_menu">
		
		<li class="left_menu">		
		<a href="#"><img src="/resources/image/logo.webp" alt="OpenCritic"></a>
		</li>
		<li class="left_menu">
			<a href="#" class="top_text1">Genre</a>
				
				<ul id="genre_sub">
					<li class="left_inner_menu"><a href="# "class="top_text3">Action</a></li>
					<li class="left_inner_menu"><a href="#" class="top_text3">Comedy</a></li>
					<li class="left_inner_menu"><a href="#" class="top_text3">Drama</a></li>
				</ul>
				
		</li>
		<li class="left_menu">
			<a href="#" class="top_text1">Release Schedule</a>
		</li>
		</ul>
		</nav>
		<nav id="top_menu2">
			
			<div id="form" class="right_menu">
	
				<form action="login.jsp" method="post" class="right_menu">

					<input type="text" placeholder="Search" class="top_text2" id="search">

				</form>			
			</div>
		
			<div id="login" class="right_menu">
				<a href="login.do" class="top_text2">Login</a>
			</div>
			<div id="sign_up" class="right_menu">
				<a href="sign_up.do" class="top_text2">Sign Up</a>
			</div>
			<div class="right_menu">
				<a href="#">
					<img src="/resources/image/toMyPage.png"
					width="30px" height="30px">
				</a>
			</div>
			<div id="logout" class="right_menu">
				<a href="#" class="top_text2">Log Out</a>
			</div>
		</nav>

	</div>
   </div>
	<!-- 상단 메뉴 끝-->

<section id="login_box">
	<h3> LOG IN TO OPENCRITIC </h3>
	<p>Continue with Facebook</p>
	<div id="or"><span>or</span></div>
	
	<form action="${rootPath}/member/login.do" method="post">
		
		<div id="id_box">
			<input type="text" placeholder=" ID" class="login" name="memberID">
		</div>
		<div id="pw_box">
			<input type="password" placeholder=" Password" class="login" name="memberPW">
		</div>

		<div id="forgot"><a>Forgot Password?</a></div>

		<article>
			 <input type="submit" id="login_btn" value="Log In"/> 
		</article>
		<div id="foot"><span>Not a member?</span><a href="#" style=text-decoration:none;>Create an account</a></div>
	
	</form>
</section>

</div>

</body>
</html>