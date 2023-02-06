package tpCollection;

import java.util.ArrayList;
import java.util.HashMap;

public class application {
	
	public static void maoin(String[] ags) {
		
		//tableau
		
		int[] tableauChiffreAremplir=new int[5];
		
		int [] tableauChiffreDejaRempli = {1,2,3,4,5};
		
		for (int i=0; i<tableauChiffreDejaRempli.length;i++) {
			//System.out.println(tableauChiffreDejaRempli[i]);
		}
		
		tableauChiffreAremplir[0]=5;
		tableauChiffreAremplir[1]=45;
		tableauChiffreAremplir[2]=30;
		tableauChiffreAremplir[3]=12;
		tableauChiffreAremplir[4]=1;
		
		String[] eleves= {"toto", "bob", "marc"};
		
		//ArrayList (tableau sans fin définie)
		
		ArrayList<String> tabEleves= new ArrayList<String>();
		
		tabEleves.add("bob");
		
		// hashMap
		HashMap<String, String> pokedex = new HashMap<String, String>();
		
		pokedex.put("pikachu", "valeur");
		
	}
	
	public double calculeMoyen(double[] note) {
		if(note.length==0) return 0;
		double somme=0;
		for (int i=0; i<note.length;i++) {
			somme+= note[i];
		}
		double moyenne= somme/note.length;
		return moyenne;
	}
	
	public ArrayList<String> doublon (ArrayList<String> array){
		
		
		
		return nouveauArray;
	}
	
}
