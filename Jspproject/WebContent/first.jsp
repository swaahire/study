<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<%@ include file="/hello.jsp" %>
<%! public int add(int a,int b){
	return a+b;}
int k;
%>
<%

k=add(655,770);
%>
<br>
The value of k is: <%=k %>!!	
</body>
</html>