<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Agenda de contatos</title>
</head>
<body>
	<h1> Agenda de contatos</h1>
	
	<%
	/**** conexão com o banco ****/
	Connection con = null;
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	String user = "root";
	String password = "";
	/**** CRUD - READ ****/
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		String read = "select * from contatos order by nome";
		ResultSet rs = con.createStatement().executeQuery(read);
		while(rs.next()){
			out.println(rs.getString(1));
			out.println(rs.getString(2));
			out.println(rs.getString(3));
			out.println(rs.getString(4));
			out.println("<br>");
		}
	}catch (Exception e) {
		out.println(e);
	}finally {
		con.close();
	}
	%>
</body>
</html>