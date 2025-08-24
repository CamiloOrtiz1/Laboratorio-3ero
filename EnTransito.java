public class EnTransito implements EstadoEnvio{
    
    @Override
    public void avanzarEnvio(Envio envio) {
       System.out.println("El envio fue entregado con exito");
       envio.setEstado(new Entregado());
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        System.out.println("El envio fue cancelado mientras estaba en el estado EnTransito");
        envio.setEstado(new Cancelado());

    }

    @Override
    public void setEnvio(Envio envio) {   
    }
    
}
