import java.util.Scanner;

// Clase Test que permite al usuario introducir mensajes y verifica si contienen palabras prohibidas.

public class Test {
    
// Lista de palabras prohibidas en los mensajes.
     
    static String tpalabros[] = {"caca", "culo", "pedo", "pis"};

    /**
     * Método principal que solicita mensajes al usuario y verifica su contenido.
     * @param argv Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");

        String linea = "";
        boolean error;
        do {
            error = false;
            try {
                linea = leerLineaOK(sc);
            } catch (BurradasNOTException e) {
                System.out.println(e.getMessage());
                error = true;
            }
            if (!error) System.out.println("OK.");
        } while (!linea.contentEquals("."));
        
        System.out.println("FIN DEL PROGRAMA.");
    }

    /**
     * Lee una línea de entrada del usuario y verifica si contiene palabras prohibidas.
     * @param sc Scanner para leer la entrada del usuario.
     * @return La línea introducida por el usuario si es válida.
     * @throws BurradasNOTException Si la línea contiene palabras prohibidas.
     */
    public static String leerLineaOK(Scanner sc) throws BurradasNOTException {
        String cadena = sc.nextLine();
        for (int i = 0; i < tpalabros.length; i++) {
            if (cadena.contains(tpalabros[i])) {
                throw new BurradasNOTException("Error: la palabra prohibida '" + tpalabros[i] + "' ha sido detectada.");
            }
        }
        return cadena;
    }
}


// Excepción que se lanza cuando se detecta una palabra prohibida en un mensaje.
 
	class BurradasNOTException extends Exception {
    /**
     * Constructor de la excepción.
     * @param mensaje Mensaje de error asociado a la excepción.
     */
    public BurradasNOTException(String mensaje) {
        super(mensaje);
    }
}

