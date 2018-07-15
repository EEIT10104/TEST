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
<style type="text/css">
fieldset {
	border: 1px solid rgb(255, 232, 57);
	width: 400px;
	margin: auto;
}
</style>
<title>Seasons</title>
</head>
<body>
	<section>
		<div class="container">
			<h1 style="text-align: center">Data maintenance</h1>
		</div>
	</section>
	<hr
		style="height: 1px; border: none; color: #333; background-color: #333;">
	<section class="container">
		<!--       三個地方要完全一樣 -->
		<form:form method='POST' modelAttribute="registerBean">
			<fieldset>
				<form:input path="registerSeasonId" type="hidden" />
				<div class="form-group">
					<label> 報名賽季ID </label>
					<div>
						<form:input path="seasonId" type="text" />
					</div>
				</div>

				<div>
					<label> 隊伍ID </label>
					<div>
						<form:input path="teamId" type="text" />
					</div>
				</div>


				<div>
					<div class="form-group">
						<label> 繳費 </label>
						<div>
							<form:input path="paymentComplete" type="text" />
						</div>
					</div>
					<div class="form-group">
						<label> 球員成功? </label>
						<div>
							<form:input path="playerComplete" />
						</div>
					</div>
					<div class="form-group">
						<label> 賽季報名成功 </label>
						<div>${registerBean.registerSuccess}</div>
					</div>
					<div class="form-group">

						<label> 報名日期 </label>
						<div>${registerBean.registerSuccessTime}</div>

					</div>


					<div>
						<input type='submit' value="Submit" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>
