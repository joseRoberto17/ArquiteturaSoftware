package Singleton_Ex1;

public class Incremental {
	private static final Object lock = new Object();

	private static Incremental singletonInstance;

	private static int count = 0;

	private int numero;

 Incremental() {
		numero = ++count;
	}

	public static Incremental getInstance() {
		synchronized (lock) {
			if (singletonInstance == null)
				singletonInstance = new Incremental();
		}

		return singletonInstance;
	}

	public String toString() {
		return "Incremental " + numero;
	}

	public void mostrar(){
	
			for (int i = 0; i < 10; i++) {
				Incremental inc = new Incremental();
				System.out.println(inc);
			}
	}

}
