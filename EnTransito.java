public class EnTransito implements EstadoEnvio{
    
    @Override
    public void avanzarEnvio(Envio envio) {
        //Coloca al envio en estado entregado
       System.out.println("Envio #" + envio.getId() + " - Cambia al estado Entregado.  EnTransito ---> Entregado");
       envio.setEstado(new Entregado());
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        //Coloca al envio en estado cancelado
        System.out.println("Envio #" + envio.getId() + " - Cambia al estado Cancelado.  EnTransito ---> Cancelado");
        envio.setEstado(new Cancelado());

    }
}
