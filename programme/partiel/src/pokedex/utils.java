package pokedex;

import java.util.HashMap;

public class utils {
	private HashMap<String, Pokemon> pokedex = new HashMap<String, Pokemon>(); 
	
	public HashMap<String, Pokemon> filterByType(String type) {
		
		
		HashMap<String, Pokemon> pokemonType =new HashMap<String, Pokemon>();
		
		for(HashMap.Entry<String, Pokemon> entry : pokedex.entrySet()) {
			if (type == entry.getValue().getType()) {
				pokemonType.put(entry.getValue().getNom(), entry.getValue());
			}
		}
		
		return pokemonType;
	}
}
