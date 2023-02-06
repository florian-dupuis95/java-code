package banque;

public class CompteEpargne extends Compte {
	
	private double tauxInteret;
	
	public void ajouterDesInteret(double interet) {
		solde=solde*interet;		
	}

}
