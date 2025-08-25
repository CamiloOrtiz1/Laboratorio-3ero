import java.util.Scanner;
    
public class Menu {
    Envio envio;
    
    public Menu (Envio envio){
        this.envio= envio;
    }
    
    public void display(){
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones= "Realizar accion: " + "a)Preparar b) Enviar c)Entregar  d)Cancelar  e)Estado s)Salir";
        opcion = scanner.next().charAt(0);
        switch(opcion){
            case 'a': System.out.println("Envio: "); envio.avanzarEnvio(); break;
            case 'b': System.out.println("Envio: "); envio.avanzarEnvio(); break;
            case 'c': System.out.println("Envio: "); envio.avanzarEnvio(); break;
            case 'd': System.out.println("Envio: "); envio.cancelarEnvio(); break;
            case 'e': System.out.println(); ; break;
            case 's': System.out.println("Gracias por usar la plataforma"); break;
            default: System.out.println("Opcion invalida");
        }
    }
}
