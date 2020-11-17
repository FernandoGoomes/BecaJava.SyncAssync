package Sync;



public class PizzariaSync {

    public void fazerPedido(String pedido, String atendente) throws InterruptedException {
        System.out.println("O atendente " + atendente + " está preparando a sua " + pedido);

        // O sleep substitui o processo de preparação do pedido.
        Thread.sleep(1000);

        System.out.println("O atendente " + atendente + " finalizou a sua " + pedido);
    }
    
    
}