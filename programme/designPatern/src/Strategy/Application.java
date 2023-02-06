package Strategy;

public class Application {
	public static void main(String[] args) {
		Context context = new Context();
		
		context.process();
		
		System.out.println("----------------");
		
		context.setStrategy(new ConcreteStrategyA());
		
		context.process();
		
		System.out.println("----------------");
		
		
		
		context.process();
		
		System.out.println("----------------");
	}

}