package tpPOO;

public class ObjetPostal {
	private String nomDestinataire;
	private String adresse;
	private String codePostal;
	private String ville;
	private boolean recommande;
	
	
	public ObjetPostal(String nomDestinataire,String adresse, String codePostal, String ville, boolean recommande) {
		this.nomDestinataire = nomDestinataire;
		this.adresse=adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.recommande = recommande;
	}
	public ObjetPostal() {}
	public String getNomDestinataire() {
		return nomDestinataire;
	}
	public void setNomDestinataire(String nomDestinataire) {
		this.nomDestinataire = nomDestinataire;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public boolean isRecommande() {
		return recommande;
	}
	public void setRecommande(boolean recommande) {
		this.recommande = recommande;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "ObjetPostal [nomDestinataire=" + nomDestinataire + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", recommande=" + recommande + "]";
	}
	
	
}
