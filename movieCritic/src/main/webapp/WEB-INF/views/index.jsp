<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome MovieCritic</title>
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<style>

#posters{ 
	display:flex;
	justify-content:center;
	align-items:center;          
}

div[id^=movie]{
	margin-left:10px;
	margin-top: 30px;
}

#board{
	display:flex;
	justify-content:center;
	align-items:center;
}



section[id^=board]{
	margin-left: 100px;
	margin-right: 100px;
}

.line{
	border-bottom: 2px solid lightgray;
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
		<a href=".do"><img src="/resources/image/logo.webp" alt="OpenCritic"></a>
		</li>
		<li class="left_menu">
			<a href="#" class="top_text1">Genre</a>
				
				<ul id="genre_sub">			<!-- select 기준 적용된 페이지 호출.. -->
					<li class="left_inner_menu"><a href="#" class="top_text3">Action</a></li>
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
		
						<!-- 로그인 안됐을 경우 , 로그인, 회원가입 버튼 보여줌-->
			<c:if test="${member==null}">		
				<div id="login" class="right_menu">
					<a href="${rootPath}/member/login.do" class="top_text2">Login</a>
				</div>
				<div id="sign_up" class="right_menu">
					<a href="${rootPath}/member/sign_up.do" class="top_text2">Sign Up</a>
				</div>
			</c:if>
		
			<!-- 로그인 됐을 경우 , 로그아웃, 마이페이지 버튼 보여줌 -->
			<c:if test="${member!=null}">
				<div class="right_menu">
						<a href="${rootPath}/member/my_page.do">
							<img src="/resources/image/toMyPage.png"
							width="30px" height="30px">
						</a>
				</div>
				<div id="logout" class="right_menu">
						<a href="${rootPath}/member/logout.do" class="top_text2">Log Out</a>
				</div>
			<!-- 관리자 로그인 -->
				<c:if test="${member.memberID=='admin'}">
					<div id="admin_write" class="right_menu">
						<a href="${rootPath}/write_board.do" class="top_text2">Write</a>
					</div>
				</c:if>
			</c:if>	
		</nav>

	</div>
   </div>
	<!-- 상단 메뉴 끝-->

	<!-- 영화 포스터-->		
	<div id="posters">
		<c:forEach items="${list}" var="list">
			<div id="movie1">
				<a href="/movie_info?movieid=${list.movieid}">
					<img src="${list.poster}" alt="movie">
				</a>		
			</div>	
		</c:forEach>
	</div>
	<!-- 영화 포스터 끝-->


	<!-- 하단 게시판-->
	<div id="board">

		<section id="board_now">
		<h2 class="line">AVAILABLE NOW</h2>
		<table>
			<thead>
				<tr>
					<th>제목</th>
					<th>작성일</th>
				</tr>
			</thead>
			
			<tbody>
	
				<c:forEach items="${list}" var="list">
					<tr>
						<td><a href=#>${list.title}</a></td>
						<td>${list.regDate}</td>
					</tr>
				</c:forEach>
  		 	</tbody>
  		 </table>
			
			
		</section>
		
		<section id="board_review">
		<h2>REVIEWED TODAY</h2>

			<article class="line">
			<h3>review 1</h3>			
	
			</article>
			
			<article class="line"> 
			<h3>review 2</h3>			
	
			</article>		

			<article class="line">
			<h3>review 3</h3>		
	
			</article>		
	
			<article class="line">
			<h3>review 4</h3>			
	
			</article>		

			<article class="line">
			<h3>review 5</h3>			
	
			</article>		
		</section>

	</div>
	<!-- 하단 게시판 끝-->

</div>

</body>
</html>
