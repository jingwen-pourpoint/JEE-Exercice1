package servlets;

import java.io.IOException;

import beans.Client;
import beans.Commande;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreationCommande extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	this.getServletContext().getRequestDispatcher("/WEB-INF/creation_commande.jsp").forward(req, resp);		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomClient= req.getParameter("nomClient");
        String prenomClient = req.getParameter("prenomClient");
        String adresseClient = req.getParameter("adresseClient");
        String telephoneClient = req.getParameter("telephoneClient");
        String emailClient = req.getParameter("emailClient");
        
        
  
        String dateCommande = req.getParameter("dataCommande");
        String montantCommande = req.getParameter("montantCommande");
        String modePaiementCommande = req.getParameter("modePaiementCommande");
        String statutPaiementCommande = req.getParameter("statutPaiementCommande");
        String modeLivraisonCommande = req.getParameter("modeLivraisonCommande");
        String statutLivraisonCommande = req.getParameter("statutLivraisonCommande");
        
        
        Client client = new Client();
        client.setNom(nomClient);
        client.setPrenom(prenomClient);
        client.setAdresse(adresseClient);
        client.setTelephone(telephoneClient);
        client.setEmail(emailClient);
        
        
        Commande commande = new Commande();
        commande.setClient(client);
        commande.setDate(dateCommande);
        commande.setMontant(montantCommande);
        commande.setModePaiement(modePaiementCommande);
        commande.setStatutPaiement(statutPaiementCommande);
        commande.setModeLivraison(modeLivraisonCommande);
        commande.setStatutLivraison(statutLivraisonCommande);
        
        
        String success = !isEmpty(nomClient) && !isEmpty(adresseClient) && !isEmpty(telephoneClient) && 
        		!isEmpty(dateCommande) && !isEmpty(montantCommande) && !isEmpty(modePaiementCommande)&& !isEmpty(modeLivraisonCommande)? "1" : "0";
   
        req.setAttribute("commande", commande);
        req.setAttribute("success", success);
        
        req.getRequestDispatcher("WEB-INF/afficher_commande.jsp").forward(req,resp);
	}
	
	
	private boolean isEmpty(String str) {
		return str == null || "".equals(str);
	}
}
