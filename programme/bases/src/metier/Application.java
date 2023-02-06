package metier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//type primitif
		/*
		boolean present = true; //1bit
		byte petiChifre=125; // -128 a 127  8bit
		short moyenChifre=3000;//16 bit
		int nobreEleves=23;//32 bit
		double pi=3.14;//64 bit
		float simplePrecision=12.5f;//32 bit
		long tresLongChiffre=546454554;//64 bit
		
		
		
		// type par référence
		
		String salutation = "bonjour";
		Date dateDuJour = new Date();
		
		
		//operateur mathemathique
		
		int premierChifre=10;
		int deuxiemeChifre=5;
		
		int some= premierChifre+deuxiemeChifre;
		int mult= premierChifre*deuxiemeChifre;
		int dif= premierChifre-deuxiemeChifre;
		int divi= premierChifre/deuxiemeChifre;
		
		System.out.println("la somme des chiffres est:"+ some);
		System.out.println(4152);
		*/
		//récuperer une saisie clavier depuis la console
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("bonjour veuller saisir votre nom");
		String nom = br.readLine();
		System.out.println("vous avez saisi:"+nom);
		
		System.out.println("veuller taper le premier chifre");
		int chifre1=Integer.parseInt(br.readLine());
		System.out.println("vous avez saisi le chiffre:"+chifre1);
		System.out.println("veuller taper le deuxieme chifre");
		int chifre2=Integer.parseInt(br.readLine());
		System.out.println("vous avez saisi le chiffre:"+chifre2);
		int somme=chifre1+chifre2;
		System.out.println("la somme des 2 chiffres est égale à:"+somme);
		
		if(somme>100) {
			System.out.println("la somme est trop grande");
		} else{
			System.out.println("parfait");
		}
		if(somme<10) {
			System.out.println("la somme est trop petite");
		} else if(somme<15) {
			System.out.println("la somme est petite");
		} else if(somme<25) {
			System.out.println("la somme est moyenne");
		} else {
			System.out.println("la somme est ok");
		}*/
		
		/*String nom ="Malek";
		if(nom!="Malek") {
			System.out.println("erreur");
		} else {
			System.out.println("super");
		}
		
		System.out.println("saisissez un cantite");
		int quantite=Integer.parseInt(br.readLine());
		System.out.println("saisissez un prix");
		float prix=Float.parseFloat(br.readLine());
		float total= quantite*prix;
		if(total>150) {
			System.out.println("vos avez droit à une réduction");
		}
		
		int jour =5;
		
		switch(jour) {
		case 1:
			System.out.println("lundi");
			break;
		case 2:
			System.out.println("mardi");
			break;
		case 3:
			System.out.println("mercredi");
			break;
		case 4:
			System.out.println("jeudi");
			break;
		case 5:
			System.out.println("vendredi");
			break;
		case 6:
			System.out.println("samedi");
			break;
		case 7:
			System.out.println("dimanche");
			break;
		default:
			System.out.println("oups ce jour n'existe pas");
			break;
		}
		
		System.out.println("taper vour age");
		int saisie=Integer.parseInt(br.readLine());
		boolean majeur = saisie >= 18 ? true : false;
		System.out.println(majeur);*/
		
		//les boucle
		/*int score=0;
		for(int i = 0; i<10; i++) {
			score+=i;
		}
		
		String[] eleves= {"AZARA","BOUGUETOF","Brazeau","CERETUS"};
		for(int i=0; i<eleves.length; i++) {
			System.out.println(eleves[i]);
		}
		// boucle for each
		for(String eleve:eleves) {
			System.out.println(eleve);
		}
		
		int elu = new Random().nextInt(eleves.length);
		
		System.out.println("le supléent est :" + eleves[elu]);
		//boucle while
		int i =0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		//boucle do while
		int i=0;
		do {
			System.out.println(i);
			i++;
		} while(i<=5);
		
		System.out.println("saisissez une qantite");
		String saisie=br.readLine();
		//regex expression reguliere qui permet de verifier la conformité de la saisie par rapport
		//à un champs de possibilité
		while (!saisie.matches("[0-9]")) {
			System.out.println("ce n'est pas un chifre");
			saisie=br.readLine();
		} 
		int quantite=Integer.parseInt(saisie);
		System.out.println("saisissez un prix");
		float prix=Float.parseFloat(br.readLine());
		float total= quantite*prix;
		if(total>150) {
			System.out.println("vos avez droit à une réduction");
		}*/
		
		displayMessage();
		System.out.println(somme(5,10));
		
		
	}
	
	static void displayMessage() {
		System.out.println("supert");
	}
	static int somme(int a, int b) {
		return a+b;
	}

}
