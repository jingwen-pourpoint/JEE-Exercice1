package beans;

import java.io.Serializable;
import java.util.Date;

public class Commande implements Serializable {
	
	
	private Client client;
	private String date;
	private String montant;
	private String modePaiement;
	private String statutPaiement;
	private String modeLivraison;
	private String statutLivraison;
	
	
	
	public Commande() {
	
	}
	

	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}




	public String getMontant() {
		return montant;
	}



	public void setMontant(String montant) {
		this.montant = montant;
	}



	public String getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
	public String getStatutPaiement() {
		return statutPaiement;
	}
	public void setStatutPaiement(String statutPaiement) {
		this.statutPaiement = statutPaiement;
	}
	public String getModeLivraison() {
		return modeLivraison;
	}
	public void setModeLivraison(String modeLivraison) {
		this.modeLivraison = modeLivraison;
	}
	public String getStatutLivraison() {
		return statutLivraison;
	}
	public void setStatutLivraison(String statutLivraison) {
		this.statutLivraison = statutLivraison;
	}
	
	
	
	
}
