public class Cancelado implements EstadoEnvio {
    
    @Override
    public void avanzarEnvio(Envio envio) {
        System.out.println("Envio #" + envio.getId() + " - Ya fue Cancelado y no es posible seguir");
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        System.out.println("Envio #" + envio.getId() + " - Ya fue Cancelado");
    }
}
