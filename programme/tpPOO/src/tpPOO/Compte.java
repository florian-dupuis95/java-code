package tpPOO;

public class Compte {
	private String numero;
	private float solde;
	
	//constructeur
	public Compte() {}
	public Compte(String numero, float solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public Compte(String numero) {
		this.numero = numero;
	}
	
	//accesseur
	//seteur
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	//geteur
	public float getSolde(){
		return this.solde; 
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	//toString
	@Override
	public String toString(){
		return "Compter numero : " + numero +", solde du compte : " + solde;
	}
	
}
