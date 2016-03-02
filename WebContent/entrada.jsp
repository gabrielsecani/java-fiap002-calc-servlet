<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fiap.rm72468.bo.Calculadora"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora JSP</title>
<style>
select, input[type=text] {
	width: 40px;
}
</style>
</head>
<body>
	<%
		Double n1 = 0.0;
		Double n2 = 0.0;
		String op = "";
		String resultado="";
		if (request.getParameter("txtNumero1") != null) {
			n1 = Double.parseDouble(request.getParameter("txtNumero1"));
			n2 = Double.parseDouble(request.getParameter("txtNumero2"));
			op = request.getParameter("operacao");

			out.println("Os parametros enviados foram n1=" + n1 + ", n2=" + n2 + " e op=" + op);

			Calculadora c = new Calculadora(n1, n2, op);
			try {
				resultado = c.fazCalculo();
			} catch (ArithmeticException e) {
				resultado = e.getMessage();
			}
		}
	%>

	<form action="" method="get">
		N&uacute;mero 1: <input type="text" name="txtNumero1" value="<%=n1%>" />
		Operação <select name="operacao">
			<option value="+" <% if(op == "+") out.print("selected"); %>" >+</option>
			<option value="-" <% if(op == "-") out.print("selected"); %>" >-</option>
			<option value="*" <% if(op == "*") out.print("selected"); %>" >*</option>
			<option value="/" <% if(op == "/") out.print("selected"); %>" >/</option>
		</select> N&uacute;mero 2: <input type="text" name="txtNumero2" value="<%=n2%>" /><br />
		<br />
		<input type="submit" value="Calcular" /><br />
		<% if( !resultado.isEmpty() ){ %>
			<div style="font-weight: bold">Resultado:	<%=resultado%></div>
		<% }else{ %>
			<div style="font-weight: bold; color: red">ERRO:<%=resultado%></div>
		<%} %>
		
	</form>
</body>
</html>