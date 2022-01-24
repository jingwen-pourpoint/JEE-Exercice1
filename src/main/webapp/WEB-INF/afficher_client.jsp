<%@page import="beans.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage client</title>
<link type="text/css" rel="stylesheet" href="inc/style.css" />
</head>
<body>
	<% Client client = (Client) request.getAttribute("client"); %>
	
	<span class="info">
	<% if ("1".equals(request.getAttribute("success"))) { %>
		Client créé avec succès !
	<% } else { %>
		Erreur - Vous n'avez pas rempli tous les champs obligatoires.<br>
		<a href="CreationClient">Cliquez ici</a> pour accèder au formulaire de création d'un client
	<% } %>
	</span>
	
	<br><br>
	Nom : <%=client.getNom() %><br>
	Prénom : <%=client.getPrenom() %><br>
	Adresse : <%=client.getAdresse() %><br>
	Téléphone : <%=client.getTelephone() %><br>
	Email : <%=client.getEmail() %><br>
	
</body>
</html>