package async;

public class PrincipalAsync {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		PizzariaAsync Fogazza = new PizzariaAsync("Fogazza");
		PizzariaAsync Pizza = new PizzariaAsync("Pizza");

		Thread pedidofogazza = new Thread(Fogazza, "Thread-1");
		Thread pedidoPizza = new Thread(Pizza, "Thread-2");

		pedidofogazza.start();
		pedidoPizza.run();

		long end = System.currentTimeMillis();
		double total = (end - start) / 3000.0;

		System.out.println("Tempo de espera: " + total);
	}

}
