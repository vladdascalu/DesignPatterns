package eu.pregatire.cts;
public class Singleton {
	private static Singleton instance;
	private int id;
	
	private Singleton(){
		id = 0;
	}
	
	public int getId() {
		return id;
	}

	public static synchronized Singleton getInstance(){
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public void incrementID(){
		id++;
	}
}
