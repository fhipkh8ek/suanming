<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="pinfo.htm" method="post">
		输入年月日：<input type="text" value="" name="inDate"><br>
		出生时间：
		<select name="inHour">
			<option value="1">23:00-00:59</option>
			<option value="2">01:00-02:59</option>
			<option value="3">03:00-04:59</option>
			<option value="4">05:00-06:59</option>
			<option value="5">07:00-08:59</option>
			<option value="6">09:00-10:59</option>
			<option value="7">11:00-12:59</option>
			<option value="8">13:00-14:59</option>
			<option value="9">15:00-16:59</option>
			<option value="10">17:00-18:59</option>
			<option value="11">19:00-20:59</option>
			<option value="12">21:00-22:59</option>
		</select>
		<input type="submit" value="提交">
	</form>
</body>
</html>