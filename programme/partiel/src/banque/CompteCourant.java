package banque;

public class CompteCourant extends Compte {
	private boolean decouvertAutorise;
	
	public void deposerRetirerArgent(int somme) {
		if((solde +somme)<decouvertAutorise) {
			solde=solde+somme;
		}
		
	}
}
