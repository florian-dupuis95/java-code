package Strategy;

public class Context {
	
	private IStrategy strategy;
	
	public Context () {
		this.strategy = new DefaultStrategy();
	}
	
	public void process() {
		System.out.println("--------- debut ----------");
		
		strategy.applyStrategy();
	
		System.out.println("----  Fin -----");
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
}