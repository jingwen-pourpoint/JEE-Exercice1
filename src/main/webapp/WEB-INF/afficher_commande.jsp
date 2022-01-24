<%@page import="beans.Commande"%>
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
	<% Commande commande = (Commande) request.getAttribute("commande"); %>
	
	<span class="info">
	<% if ("1".equals(request.getAttribute("success"))) { %>
		Commande créé avec succès !
	<% } else { %>
		Erreur - Vous n'avez pas rempli tous les champs obligatoires.<br>
		<a href="CreationCommande">Cliquez ici</a> pour accèder au formulaire de création d'une commande
	<% } %>
	</span>
	
	<br><br>
	Client<br>
	Nom : <%=commande.getClient().getNom() %><br>
	Prénom : <%=commande.getClient().getPrenom() %><br>
	Adresse : <%=commande.getClient().getAdresse() %><br>
	Téléphone : <%=commande.getClient().getTelephone() %><br>
	Email : <%=commande.getClient().getEmail() %><br><br>
	
	Commande<br>
	Date : <%=commande.getDate() %><br>
	Montant : <%=commande.getMontant() %><br>
	Mode de paiement : <%=commande.getModePaiement() %><br>
	Statut du paiement : <%=commande.getStatutPaiement() %><br>
	Mode de livraison : <%=commande.getModeLivraison() %><br>
	Statut de livraison : <%=commande.getStatutLivraison() %><br>
	
</body>
</html>