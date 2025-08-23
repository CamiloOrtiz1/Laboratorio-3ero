public class Creado implements EstadoEnvio {

    public void avanzarEnvio(Envio envio) {
        envio.setEstado(new EnTransito);
        System.out.println("El Envio pasa al estado en Transito");
    }

    public void cancelarEnvio(Envio envio) {
        envio.cancelarEnvio(new Cancelado());
        System.out.println("El envio fue cancelado desde el estado Creado");
    }
}