public class Envio {
    private EstadoEnvio estado;
    private final int id;

    // Una vez que se crea un envio, se le asigna el estado de creado
    public Envio(int id) {
        this.estado = new Creado();
        this.id = id;
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

    public EstadoEnvio getEstado() {
        return estado;
    }
    
    @Override
    public String toString() {
        return "Envio #" + this.id + " - Estado actual: " + this.estado.getClass().getSimpleName();
    }

    public int getId() {
        return this.id;
    }
}