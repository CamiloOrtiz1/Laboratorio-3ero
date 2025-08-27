public class Cancelado implements EstadoEnvio {
    
    @Override
    public void avanzarEnvio(Envio envio) {
        System.out.println("El pedido fue cancelado y no se puede proseguir con el envio");
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        System.out.println("El pedido ya fue cancelado");
    }
}
