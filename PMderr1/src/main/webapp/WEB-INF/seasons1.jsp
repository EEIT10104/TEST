<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
<link rel='stylesheet' href='css/styles.css' type='text/css' />
</head>
<body>
	<section>
		<div>
			<div class="container" style="text-align: center">
				<h1>賽季表</h1>
			</div>
		</div>
	</section>
	<hr
		style="height: 1px; border: none; color: #333; background-color: #333;">
	<section class="container">
		<div class="row">

			<c:forEach var='seasons' items='${seasons}'>
			
				<div class="col-sm-6 col-md-3" style="width: 360px; height: 360px">

					<div class="caption">

						<p>賽季ID: ${seasons.seasonId}</p>
						<p>賽季名稱:${seasons.seasonName}</p>
						<p>比賽地點:${seasons.location}</p>
						<p>賽季開始時間:${seasons.seasonStartDate}</p>
						<p>報名開始時間:${seasons.seasonRegisterStart}</p>
						<p>報名金額:${seasons.payment}</p>
						<p>隊伍報名數量:${seasons.teamSum}</p>
						<p>
							<a href="<spring:url value='season?id=${seasons.seasonId}' />"
								class="btn btn-primary"> <span
								class="glyphicon-info-sigh glyphicon"></span>詳細資料
							</a>
							<a href="<spring:url value='/delete?id=${seasons.seasonId}' />"
								class="btn btn-primary"> <span
								class="glyphicon-info-sigh glyphicon"></span>刪除賽季
							</a>
						</p>
					</div>
				</div>
			</c:forEach>
			<p>
					<a href="<spring:url value='/' />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span>回首頁</a>
				</p>
		</div>
	</section>
</body>
</html>