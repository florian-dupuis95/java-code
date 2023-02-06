package banque;

public class Compte {
	private int solde;
	private String numeroDeCompte;
	private String nomDuPropriétaire;
	
	public void deposerRetirerArgent(int somme) {
		solde=solde+somme;
	}

}
