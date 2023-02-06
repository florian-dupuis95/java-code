package metier;

import java.util.List;

public interface CatalogueMetier {
	public List<Client> getAllClients();
	public List<Client> getClientByKeyword(String mc);
	public void addClient(Client c);
}
