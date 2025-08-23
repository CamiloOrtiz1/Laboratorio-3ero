public class Envio {
    private EstadoEnvio estado;

    // Una vez que se crea un envio, se le asigna el estado de creado
    public Envio() {
        this.estado = new Creado();
    }

    // Metodo que permite cambiar el estado del envio al que le corresponda
    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    // Metodo que permite avanzar al envio al cual corresponda
    public void avanzarEnvio(){
        this.estado.avanzarEnvio(this);
    }
    
    // Metodo que cancela el envio
    public void cancelarEnvio(){
        this.estado.cancelarEnvio(this);
    }

}