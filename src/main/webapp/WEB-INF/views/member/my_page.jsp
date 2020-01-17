<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<style>

#main_setting_area{
	margin: 70px 700px 100px;
	border: 1px solid white;
	font-size: 13px;

}

.main_inner_area{
	border-bottom: 1px solid #aaa;
	padding:30px 7px;
	height: 80px;
	padding-left:15px;
}

.content_left_area{
	float:left;
	padding-left: 5px;
	width: 80px;
}

.content_right_area{
	float:left;
	padding-left: 25px;
	
}

</style>

</head>

<body>


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
			<a href="../movie_list.do" class="top_text1">Genre</a> <!-- ../ 현재디렉토리 기준 상위디렉토리로 이동. -->
				
				<ul id="genre_sub">
					<li class="left_inner_menu"><a href="../movie_list.do"class="top_text3">Action</a></li>
					<li class="left_inner_menu"><a href="../movie_list.do" class="top_text3">Comedy</a></li>
					<li class="left_inner_menu"><a href="../movie_list.do" class="top_text3">Drama</a></li>
				</ul>
				
		</li>
		<li class="left_menu">
			<a href="#" class="top_text1">Release Schedule</a>
		</li>
		</ul>
		</nav>
		<nav id="top_menu2">
			
			<div id="form" class="right_menu">
	
				<form action="#" method="post" class="right_menu">

					<input type="text" placeholder="Search" class="top_text2" id="search">

				</form>			
			</div>
		
			<div id="login" class="right_menu">
				<a href="member/login.do" class="top_text2">Login</a>
			</div>
			<div id="sign_up" class="right_menu">
				<a href="member/sign_up.do" class="top_text2">Sign Up</a>
			</div>
		</nav>

	</div>
   </div>
	<!-- 상단 메뉴 끝-->


<div id="main_setting_area">

	<h3>ACCOUNT SETTINGS</h3>

	<div class="main_inner_area">
		<div class="content_left_area">PROFILE IMAGE</div>

		<div class="content_right_area"><img src="/resources/image/profile.png"></div>

		<div class="content_right_area"><input type="button" value="파일 선택"></div>
	</div>

	<div class="main_inner_area">
		<div class="content_left_area">NICKNAME</div>

		<div class="content_right_area"> <input type="text" placeholder="now"> </div>
	</div>

	<div class="main_inner_area">
		<div class="content_left_area">ID</div>

		<div class="content_right_area"> current_id </div>
	</div>

	<div class="main_inner_area">
		<div class="content_left_area">PW</div>
	
		<div class="content_right_area">
			<div><input type="password" placeholder="current password"></div>
			<div><input type="password" placeholder="new password"></div>
			<div><input type="password" placeholder="verify password"></div>
		</div>
	</div>

	<div class="main_inner_area">
		<div class="content_left_area">EMAIL</div>

		<div class="content_right_area"> current email </div>
	</div>

	<div class="main_inner_area">
		<div class="content_left_area">PHONE</div>

		<div class="content_right_area"> current phone </div>
	</div>


</div>

<!--main_setting.. 끝-->

</div>
<!--site_layout 끝-->

</body>

</html>