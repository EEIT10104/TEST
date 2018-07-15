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
<title>Products</title>
<link rel='stylesheet' href='css/styles.css' type='text/css' />
</head>
<body>
	<section>
		<div>
			<div class="container" style="text-align: center">
				<h1>報名球隊</h1>
			</div>
		</div>
	</section>
	<hr
		style="height: 1px; border: none; color: #333; background-color: #333;">
	<section class="container">
		<div class="row">

			<c:forEach var='register' items='${register}'>

				<div class="col-sm-6 col-md-3" style="width: 360px; height: 360px">

					<div class="caption">

						<p>報名ID: ${register.registerSeasonId}</p>
						<p>賽季ID:${register.seasonId}</p>
						<p>隊伍ID:${register.teamId}</p>
						<p>繳費成功:${register.paymentComplete}</p>
						<p>球員成功:${register.playerComplete}</p>
						<p>報名成功:${register.registerSuccess}</p>
						<p>報名時間:${register.registerSuccessTime}</p>
						<a
							href="<spring:url value='checkregister?id=${register.teamId}'/>"
							class="btn btn-primary"> <span
							class="glyphicon-info-sigh glyphicon"></span>編輯
						</a>

					</div>
				</div>

			</c:forEach>
			<p>
				 <a href="javascript:history.back(-1);" class="btn btn-default">
					<span class="glyphicon-hand-left glyphicon"></span>返回
				</a> <a href="<spring:url value='/' />" class="btn btn-default"> <span
					class="glyphicon-hand-left glyphicon"></span>回首頁
				</a>
			</p>
		</div>
	</section>
</body>
</html>