
// Excepción que se lanza cuando se detecta lenguaje obsceno.
public class BurradasNOTException extends Exception {
    
    /**
     * Constructor de la excepción que recibe una palabra inapropiada.
     * @param tpalabros Palabra o frase que contiene lenguaje obsceno.
     */
    public BurradasNOTException(String tpalabros) {
        super("Error, no se permite lenguaje obsceno");
    }
}
