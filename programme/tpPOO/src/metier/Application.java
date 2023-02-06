package metier;

import tpPOO.Coli;
import tpPOO.Lettre;
//import tpPOO.Compte;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************       DEBUT      *****************");
		
		Coli colis1 = new Coli("toto", "15 rue blabla", "75013", "paris", false, (float) 0.54);
		Lettre lettre1 = new Lettre("toto", "15 rue blabla", "75013", "paris", true, false);
		
		System.out.println(colis1);
		System.out.println(lettre1);

		/*int age = 25;
		Compte comptePerso = new Compte("123456", 1000);
		Compte comptePerso2 = new Compte("125436");
		Compte comptePerso3 = new Compte();
		
		System.out.println(comptePerso.getNumero());
		System.out.println(comptePerso.getSolde());
		System.out.println(comptePerso2.getNumero());
		System.out.println(comptePerso2.getSolde());
		System.out.println(comptePerso3.getNumero());
		System.out.println(comptePerso3.getSolde());*/
		
	}

}
