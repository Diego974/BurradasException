import java.util.Scanner;

public class Test
{
    static String tpalabros[] = {"caca","culo","pedo","pis"};
    
    public static void main ( String argv[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
        // Completar
        
        /* 
        while(true) {
        try {
        	String mensaje = leerLineaOK(sc);
        	if (mensaje.equals(".")) {
        		System.out.println("Fin del programa");
        		break;
        	}
        	System.out.println("OK");
        }
        catch (BurradasNOTException e) {
        	System.out.println(e.getMessage());
        	}
        }
    }*/
        
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
        	if (! error) System.out.println("OK.");
        }
        while (!linea.contentEquals("."));
        System.out.println("FIN DEL PROGRAMA.");
        }
        
       
     
    public static String leerLineaOK (Scanner sc) throws BurradasNOTException {
        //completar
    	
    	/*String LeerLineaOK = sc.nextLine();
    	for (int i = 0; i < tpalabros.length; i++) {
    		if (LeerLineaOK.contains(tpalabros[i])) {
    			throw new BurradasNOTException ("Error, mensajes obscenos no permitidos");
    		}
    	}
        return "cadena leida";
        */
    	
    	String cadena = sc.nextLine();
    	for (int i = 0; i < tpalabros.length; i++) {
    		if (cadena.contains(tpalabros[i])) {
    			throw new BurradasNOTException(tpalabros[i]);
    		}
    	}
    	return cadena;
    	
    	
    	
    	
    }
}
