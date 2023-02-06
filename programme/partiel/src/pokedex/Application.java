package pokedex;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon pokemon1= new Pokemon("pikachu", "electric", 1 );
		Pokemon pokemon2= new Pokemon("salameche", "feu", 1 );
		Pokemon pokemon3= new Pokemon("bulbisare", "plante", 1 );
		Pokemon pokemon4= new Pokemon("reptincel", "feu", 1 );
		Pokemon pokemon5= new Pokemon("evoli", "normale", 1 );
		Pokemon pokemon6= new Pokemon("tiploob", "eau", 1 );
		Pokemon pokemon7= new Pokemon("magicarp", "eau", 1 );
		Pokemon pokemon8= new Pokemon("pirobut", "feu", 1 );
		Pokemon pokemon9= new Pokemon("pichu", "electric", 1 );
		Pokemon pokemon10= new Pokemon("raichu", "electric", 1 );
		
		Pokemon[] pokemons = {pokemon1, pokemon2,pokemon3,pokemon4,pokemon5,pokemon6,pokemon7,pokemon8,pokemon9,pokemon10};
		
		Pokemon[] pokemonType= filterByType("electic");
		System.out.println(pokemonType);
	}

}
