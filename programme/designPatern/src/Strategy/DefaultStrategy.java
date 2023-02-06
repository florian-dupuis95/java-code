package Strategy;

public class DefaultStrategy implements IStrategy{
	
	@Override
	public void applyStrategy() {
		System.out.println("On est dans l'algo dans la Strategy par défaut");
	}

}
