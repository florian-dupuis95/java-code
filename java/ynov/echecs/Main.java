package ynov.echecs;

import java.util.Scanner;

import ynov.echecs.pieces.Piece;

class Joueur {
  public String nom;
  public boolean blanc;
}

public class Main {  

  public static void main(String args[]) { 

    System.out.println("Bienvenue sur mon super jeu d'echecs...");

    String j1 = saisie("Joueur 1 : ");
    String j2 = saisie("Joueur 2 : ");

    System.out.println("Bienvenue " + j1 + " et " + j2);
    
    Joueur joueur1 = new Joueur();
    Joueur joueur2 = new Joueur();
    joueur1.nom = j1;
    joueur2.nom = j2;

    System.out.println("L'ordinateur va tirer un nombre entre 0 et 10.");
    System.out.println("Le joueur qui aura les blancs "
     + "est celui qui sera le plus proche.");

    double cible = Math.random() * 10;
    double valeur1;
    double valeur2;
    while(true) {
	    String nbrJ1 = saisie(joueur1.nom + ", votre essai:");
	    String nbrJ2 = saisie(joueur2.nom + ", votre essai:");
	    try {
	    	valeur1 = Double.parseDouble(nbrJ1);
	    	valeur2 = Double.parseDouble(nbrJ2);
	    }
	    catch(Exception exception) {
	    	System.out.println("Veuillez saisir des nombre...");
	    	exception.printStackTrace();
	    	continue;
	    }
	    break;
    }
    System.out.println("Nombre a trouver : " + cible);
    double delta1 = Math.abs(cible - valeur1);
    double delta2 = Math.abs(cible - valeur2);
    if (delta1 < delta2) {
    	System.out.println(joueur1.nom + " joue avec les blancs !");
    	joueur1.blanc = true;
    	joueur2.blanc = false;
    }
    else if (delta1 == delta2) {
    	System.out.println("Personne ne joue ...");
    	System.exit(0);
    }
    else {
    	System.out.println(joueur2.nom + " joue avec les blancs !");
    	joueur2.blanc = true;
    	joueur1.blanc = false;
    }
    
    JeuEchecs jeu = new JeuEchecs();
    jeu.affiche();
    jeu.attendreClic();
    
    System.out.println("Merci " + joueur1.nom 
                       + " et " + joueur2.nom
                       + " d'avoir joue a mon jeu...");
    system.exit(0)

  }

  public static String saisie(String msg) {
    System.out.print(msg); 
    Scanner clavier = new Scanner(System.in);
    String joueur = clavier.nextLine();
    return joueur;
  }
 
}