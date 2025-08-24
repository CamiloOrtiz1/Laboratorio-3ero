import java.util.Random;
import java.util.concurrent.Callable;
import java.util.random.*;

public class HiloEnvio implements Callable<Envio> {
    private Envio envio;
    private Random numAl;

    public HiloEnvio(Envio envio) {
        this.envio = envio;
        numAl = new Random();
    }

    @Override
    public Envio call() throws Exception {
        
        System.out.println("El envio :" + Thread.currentThread().getName() + "Ha sido creado");
        if(numAl.nextInt(100) < 29){
            envio.cancelarEnvio();
        }else{
            envio.avanzarEnvio();
        }
        
        if(numAl.nextInt(100)<14){
            envio.cancelarEnvio();
        }else{
            envio.avanzarEnvio();
        }

        



        return envio; 
    }
}
