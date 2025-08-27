public class Entregado implements EstadoEnvio{
    //Clase Entregado que implementa un posible estado del envio, seria una clase final ya que aqui no hay posibles cambios
    @Override
    public void avanzarEnvio(Envio envio) {
        //Como el envio ya fue entregado no se puede seguir avanzando
       System.out.println("El pedido ya fue entregado por lo tanto finalizo su recorrido");
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        //Al querer cancelar un envio no es posible porque ya fue entregado
        System.out.println("El pedido no puede cancelarse porque ya fue entregado");
    }
}
