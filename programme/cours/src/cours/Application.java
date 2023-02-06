package cours;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quantite;
		float prix;
		
		System.out.println("saisir la quantite");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) {
			quantite = br.readLine();
		};
		
	}

}
