package tpPOO;
import utils.Constante;
public class Lettre extends ObjetPostal{
	private boolean urgent;
	
	public Lettre() {}
	public Lettre(String n,String a, String c, String v, boolean r, boolean u) {
		super(n,a,c,v,r);
		this.urgent = u;
	}

	public boolean isUrgent() {
		return urgent;
	}
	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}
	public float calculePrix() {
		float prix=(float)0.53;
		if(super.isRecommande()==true) {
			prix+=1.5;
		}
		if(this.urgent==true) {
			prix+=0.6;
		}
		return prix;
	}
	@Override
	public String toString() {
		
		return "type= lettre, nom : " + super.getNomDestinataire() + ", adresse : " + super.getAdresse() +" "+
		super.getCodePostal() + " " +super.getVille()+", recommande : "+ super.isRecommande() + ", urgent : "+
				this.urgent +", tarif : "+ this.calculePrix();
	}
	
}
