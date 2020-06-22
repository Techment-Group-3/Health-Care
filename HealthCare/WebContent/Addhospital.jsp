<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int hid=Integer.parseInt(request.getParameter("hid"));
		int pincode=Integer.parseInt(request.getParameter("hpincode"));
		String name=request.getParameter("hname");
		String address=request.getParameter("haddress");
		String street=request.getParameter("hstreet");
		String state=request.getParameter("hstate"); %>
</body>
</html>