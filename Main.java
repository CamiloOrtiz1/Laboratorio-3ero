import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Envio>> futures = new ArrayList<>();

        try {
            // Creacion de los envios, hilosEnvios y se agregan a la lista de Future
            for (int i=1; i < 20; i++) {
                Envio envio = new Envio(i);
                HiloEnvio tareaEnvio = new HiloEnvio(envio);
                futures.add(executor.submit(tareaEnvio));
            }

            for (Future<Envio> future : futures) {
                try {
                    System.out.println("Estado Envio: " + future.get().toString());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            executor.shutdown();
        }
    }
}

