package tpPOO;

public class Coli extends ObjetPostal{


	private float poids;
	
	public Coli() {}
	public Coli(String n, String a, String c, String v, boolean r, float poids) {
		super(n,a,c,v,r);
		this.poids = poids;
	}


	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public float calculePrix() {
		float prix=(float)0.53;
		float poidReduit=this.poids;
		if(super.isRecommande()==true) {
			prix+=3;
		}
		while(poidReduit>=0.1) {
			prix+=0.8;
			poidReduit-=0.1;
		}
		return prix;
	}
	@Override
	public String toString() {
		
		return "type= coli, nom : " + super.getNomDestinataire() + ", adresse : " + super.getAdresse() +" "+
		super.getCodePostal() + " " +super.getVille()+", recommande : "+ super.isRecommande() + 
		", poids : "+ this.poids +", tarif : "+ this.calculePrix();
	}
	
	
}
