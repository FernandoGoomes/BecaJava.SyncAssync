package Sync;

public class PrincipalSync {

	public static void main(String[] args) throws InterruptedException {

		long start = System.currentTimeMillis();

		PizzariaSync pizza = new PizzariaSync();// Injecao de dependencia

		PizzariaSync fogazza = new PizzariaSync();// Injecao dependecia

		pizza.fazerPedido("Pizza", "1");
		fogazza.fazerPedido("fogazza", "2");

		long end = System.currentTimeMillis();

		double total = (end - start) / 1000.0;

		System.out.println("Tempo de espera: " + total + " segundos");

	}
}