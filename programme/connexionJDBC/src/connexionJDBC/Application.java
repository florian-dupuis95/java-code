package connexionJDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import metier.CatalogueMetierImpl;
import metier.Client;



public class Application {

	public static void main(String[] args) throws IOException {
		CatalogueMetierImpl metier = new CatalogueMetierImpl();
		List<Client> clients = metier.getAllClients();
		
		for(Client c: clients) {
			System.out.println("Client numéro: " +c.getIdClient()+ "\t" + c.getNomClient()+ "\t" + c.getPrenomClient());
		}
		
		List<Client> clientsByKw = metier.getClientByKeyword("s");
		
		for(Client c: clientsByKw) {
			System.out.println("Client numéro: " +c.getIdClient()+ "\t" + c.getNomClient()+ "\t" + c.getPrenomClient());
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Client c = new Client();
		System.out.println("Bonjour, Veuillez saisir votre nom : ");
		c.setNomClient(br.readLine());
		System.out.println("Bonjour, Veuillez saisir votre prénom : ");
		c.setPrenomClient(br.readLine());
		
		
		metier.addClient(c);
	}

}
