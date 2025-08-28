import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        Envio envio = new Envio();
        HiloEnvio tareaEnvio = new HiloEnvio(envio);

        Future <Envio> future = executor.submit(tareaEnvio);
        try {
        System.out.println("Estado envio: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

