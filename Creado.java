public class Creado implements EstadoEnvio {
    
    @Override
    public void avanzarEnvio(Envio envio) {
        envio.setEstado(new EnTransito()); 
        System.out.println("El envio " + Thread.currentThread().getName() + " Creado ---->EnTransito");
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        envio.setEstado(new Cancelado());
        System.out.println("El envio " + Thread.currentThread().getName() + " Creado ---->Cancelado");
    }

    @Override
    public void setEnvio(Envio envio) {
        
    }


    
}