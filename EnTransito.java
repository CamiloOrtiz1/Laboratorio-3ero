public class EnTransito implements EstadoEnvio{
    
    @Override
    public void avanzarEnvio(Envio envio) {
        //Coloca al envio en estado entregado
       System.out.println("El envio " + Thread.currentThread().getName() + "EnTransito ---->Entregado");
       envio.setEstado(new Entregado());
    }

    @Override
    public void cancelarEnvio(Envio envio) {
        //Coloca al envio en estado cancelado
        System.out.println("El envio " + Thread.currentThread().getName() + "EnTransito ---->Cancelado");
        envio.setEstado(new Cancelado());

    }
}
