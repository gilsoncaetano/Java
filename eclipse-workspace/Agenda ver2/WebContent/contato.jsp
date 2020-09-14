<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html >
<head>
	<meta charset="utf-8">
	<title>Agenda de contato</title>
</head>
<body>
	<form name="frmContato" action="Controller">
		<table>
			<tr>
				<td><input type="text" name="nome" placeholder="Nome"></td>
			</tr>
			<tr>
				<td><input type="text" name="fone" placeholder="Fone"></td>
			</tr>
			<tr>
				<td><input type="text" name="email" placeholder="Email"></td>
			</tr>
		</table>
		<input type="button" value="Enviar" onclick="validar()">
	</form>
	<script src="validador.js"></script>
</body>
</html>