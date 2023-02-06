package Singleton;

public class Singleton {
	private static Singleton instance;
	static {
		instance=new Singleton();
	}
	
	private Singleton() {
		//this.instance=new Singleton();
	}

	public static Singleton getInstance() {
		return instance;
	};
	
	
	
}
