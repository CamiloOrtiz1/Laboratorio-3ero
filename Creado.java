public class Creado implements EstadoEnvio {
    
    @Override
    public void avanzarEnvio(Envio envio) {
        envio.setEstado(new EnTransito());
        System.out.println("El Envio pasa al estado en Transito");
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        envio.setEstado(new Cancelado());
        System.out.println("El envio paso al estado Cancelado luego de su creacion");
    }
  
}