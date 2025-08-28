public class Creado implements EstadoEnvio {
    
    @Override
    public void avanzarEnvio(Envio envio) {
        envio.setEstado(new EnTransito());
        System.out.println("Envio #" + envio.getId() + " - Cambia al estado en Transito.  Creado ---> EnTransito");
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        envio.setEstado(new Cancelado());
        System.out.println("Envio #" + envio.getId() + " - Cambia al estado Cancelado luego de su Creacion.  Creado ---> Cancelado");
    }
  
}