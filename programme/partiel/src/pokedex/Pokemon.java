package pokedex;

public class Pokemon {
	private String nom;
	private String type;
	private int niveau;
	
	public Pokemon(String nom, String type, int niveau) {
		this.nom=nom;
		this.type=type;
		this.niveau=niveau;
	}
	public Pokemon() {
		this.nom=null;
		this.type=null;
		this.niveau=0;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getType() {
		return this.type;
	}

}
