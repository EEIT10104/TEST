<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Season</title>
<link rel='stylesheet' href='css/styles.css' type='text/css' />
</head>
<body>
	<section>
		<div>
			<div class="container" style="text-align: center">
				<h2>賽季詳細資訊</h2>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">

			<div class="col-md-5">
				<h3>${season.seasonName}</h3>

				<p>賽季ID: ${season.seasonId}</p>

				<p>比賽地點:${season.location}</p>
				<p>場地數量:${season.locationSum}</p>
				<p>賽季開始時間:${season.seasonStartDate}</p>
				<p>賽季結束時間:${season.seasonEndDate}</p>
				<p>報名開始時間:${season.seasonRegisterStart}</p>
				<p>報名結束時間:${season.seasonRegisterEnd}</p>
				<p>賽制:${season.competitionSystem}</p>
				<p>組別:${season.seasonGroup}</p>
				<p>隊伍上限:${season.teamMax}</p>
				<p>隊伍下限:${season.teamMin}</p>
				<p>球員上限:${season.playerMax}</p>
				<p>球員下限:${season.playerMin}</p>
				<p>報名金額:${season.payment}</p>
				<p>繳費期限:${season.paymentDeadline}</p>
				<p>隊伍報名數量:${season.teamSum}</p>

			
				<p>
				<a href="<spring:url value='register?id=${season.seasonId}' />"
								class="btn btn-primary"> <span
								class="glyphicon-info-sigh glyphicon"></span>查看報名隊伍
							</a>
					
					 <a href="<spring:url value='/delete?id=${season.seasonId}' />"
						class="btn btn-primary"> <span
						class="glyphicon-info-sigh glyphicon"></span>刪除賽季
					</a>
					
					 <a href="<spring:url value='/update?id=${season.seasonId}' />"
						class="btn btn-primary"> <span
						class="glyphicon-info-sigh glyphicon"></span>修改賽季
					</a>
				</p>
				<p>
					<a href="<spring:url value='/seasons' />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span>返回
					</a>
					<a href="<spring:url value='/' />" class="btn btn-default"> <span
						class="glyphicon-hand-left glyphicon"></span>回首頁</a>
				</p>
			</div>
		</div>
	</section>
</body>
</html>