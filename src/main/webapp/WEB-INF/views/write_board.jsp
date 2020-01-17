<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<style>

#main_write_area{
	
	

}


#main_right_area{
	
	margin: 50px 600px 100px;
	padding: 0;
	width:650px;
	height:600px;
	border: 1px solid green;

}

table {
	width: 
	border: 1px solid #444444;
	border-collapse: collapse;
}

  td {
	border: 1px solid #444444;
	padding: 10px;
	
}

td:nth-child(2n+1){
	background:#fee;
}

#submit_btn_area{
	padding: 10px 0px 0px 575px;
	border: 1px solid red;
}

#submit_inner{
	background:transparent;
	background:#fbb;
	color:#000;
	border: 1px solid black;
}
</style>

<script>




</script>

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
		<a href="#"><img src="C:\Users\orc4g\Desktop\image\logo.webp" alt="OpenCritic"></a>
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
	
				<form action="#" method="post" class="right_menu">

					<input type="text" placeholder="Search" class="top_text2" id="search">

				</form>			
			</div>
		
			<div id="login" class="right_menu">
				<a href="#" class="top_text2">Login</a>
			</div>
			<div id="sign_up" class="right_menu">
				<a href="#" class="top_text2">Sign Up</a>
			</div>
		</nav>

	</div>
   </div>
	<!-- 상단 메뉴 끝-->


	<!-- 글쓰기 폼 시작-->

	
	<h2 style="text-align:center; margin-top:30px;">게시글 작성</h2>

		<div id="main_right_area">		

			<form action="#" method="get">

			
				<table>
	
					<tr>
						<td> Title  </td>
						<td><input type="text"> </td>
					</tr>
					<tr>
						<td> Starring  </td>
						<td><input type="text"> </td>
					</tr>
					<tr>
						<td> Genre  </td>
						<td><input type="text"> </td>
					</tr>
					<tr>
						<td> Summary  </td>
						<td><textarea cols="70" rows="10" maxlength="500"></textarea> </td>
					</tr>
					<tr>
						<td> 첨부  </td>
						<td><input type="file"/> </td>
					</tr>
					
				</table>

				<div id="submit_btn_area"><input type="submit" id="submit_inner"></div>

			
	
			</form>
		</div>

	

	<!--글쓰기 폼 끝-->

</div>

</body>
</html>