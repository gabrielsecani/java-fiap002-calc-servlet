<%@page import="org.w3c.dom.html.HTMLButtonElement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Atual: <%=  new Date() %></title>
</head>
<body>
<form>
Data Atual: <%=  new Date() %>
<button type="submit">Atualiar</button>
</form>
</body>
</html>