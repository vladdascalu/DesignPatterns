package eu.pregatire.cts;

public class Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.incrementID();
		s1.incrementID();
		int id = s2.getId();
		System.out.println(id);

	}

}
