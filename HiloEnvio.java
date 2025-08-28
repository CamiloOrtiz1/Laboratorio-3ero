import java.util.concurrent.Callable;

public class HiloEnvio implements Callable<Envio> {
    private Envio envio;

    public HiloEnvio(Envio envio) {
        this.envio = envio;
    }

    @Override
    public Envio call() throws Exception {
        
        System.out.println("El envio : " + Thread.currentThread().getName() + " Ha sido creado");
        Thread.sleep(1000);

        // Simular aleatoriamente la cancelacion
        if (Math.random() < 0.3) {
            this.envio.cancelarEnvio();
            //System.out.println(this.envio.toString());
        } else {
            this.envio.avanzarEnvio();
            Thread.sleep(1000);
            //System.out.println(this.envio.toString());
            this.envio.avanzarEnvio();
        }
        return envio;
    }
}
