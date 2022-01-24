package servlets;

import java.io.IOException;

import beans.Client;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreationClient extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	this.getServletContext().getRequestDispatcher("/WEB-INF/creation_client.jsp").forward(req, resp);		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomClient= req.getParameter("nomClient");
        String prenomClient = req.getParameter("prenomClient");
        String adresseClient = req.getParameter("adresseClient");
        String telephoneClient = req.getParameter("telephoneClient");
        String emailClient = req.getParameter("emailClient");
        
        Client client = new Client();
        client.setNom(nomClient);
        client.setPrenom(prenomClient);
        client.setAdresse(adresseClient);
        client.setTelephone(telephoneClient);
        client.setEmail(emailClient);
        
        String success = !isEmpty(nomClient) && !isEmpty(adresseClient) && !isEmpty(telephoneClient) ? "1" : "0";
        
        req.setAttribute("client", client);
        req.setAttribute("success", success);
        
        req.getRequestDispatcher("WEB-INF/afficher_client.jsp").forward(req,resp);
	}
	
	private boolean isEmpty(String str) {
		return str == null || "".equals(str);
	}
}
