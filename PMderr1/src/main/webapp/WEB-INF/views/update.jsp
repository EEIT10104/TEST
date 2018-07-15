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
		<form:form method='POST' modelAttribute="upSeasonBean">
			<fieldset>
				<form:input path="seasonId" type="hidden"/>
				<div class="form-group">
					<label> 賽季名稱 </label>
					<div>
						<form:input path="seasonName" type="text"/>
					</div>
				</div>

				<div>
					<label> 場地名稱 </label>
					<div>
						<form:input path="location" type="text"/>
					</div>
				</div>


				<div>
					<div class="form-group">
						<label> 場地數量 </label>
						<div>
							<form:input path="locationSum" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 賽季開始時間 </label>
						<div>
							<form:input path="seasonStartDate" type="date"/>
						</div>
					</div>
					<div class="form-group">
						<label> 賽季結束時間 </label>
						<div>
							<form:input path="seasonEndDate" type="date"/>
						</div>
					</div>
					<div class="form-group">
						<label> 報名開始時間 </label>
						<div>
							<form:input path="seasonRegisterStart" type="date"/>
						</div>
					</div>
					<div class="form-group">
						<label>報名結束時間 </label>
						<div>
							<form:input path="seasonRegisterEnd" type="date"/>
						</div>
					</div>
					<div class="form-group">
						<label> 賽制 </label>
						<div>
							<form:input path="competitionSystem" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 組別 </label>
						<div>
							<form:input path="seasonGroup" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 隊伍上限 </label>
						<div>
							<form:input path="teamMax" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 隊伍下限</label>
						<div>
							<form:input path="teamMin" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 球員上限</label>
						<div>
							<form:input path="playerMax" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 球員下限</label>
						<div>
							<form:input path="playerMin" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 報名金額</label>
						<div>
							<form:input path="payment" type="text"/>
						</div>
					</div>
					<div class="form-group">
						<label> 繳費期限</label>
						<div>
							<form:input path="paymentDeadline" type="date"/>
						</div>
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
