import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        try {
            for(int i=0; i < 10; i++) {
            Envio envio = new Envio();
            HiloEnvio tarea = new HiloEnvio(envio);
            Future<Envio> future = executor.submit(tarea);
            System.out.println(future.get())    ;
            }
            
        } catch(InterruptedException | ExecutionException e) {
            System.out.println("Error");
        } finally {
            executor.shutdown();
        }
    }
}
