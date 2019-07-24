package Config;

import java.io.IOException;

/**Hasta
 *
 * @author Guillermo Ballesteross
 */
public class CrearCUP {
    private final static String rutaArchivos = System.getProperty("user.dir") + "/src/Archivos/";
    private final static String rutaSalida = System.getProperty("user.dir") + "/src/Sintactico/";
    public static void crearCUP() throws IOException, Exception {
         String[] atributos = {"-destdir", rutaSalida,
             "-parser","analisis_sintactico","-symbols","Simbolos",
             rutaArchivos + "Sintactico.cup"};


         java_cup.Main.main(atributos);
         //java_cup.Main.main(atributos);
    }
    public static void main(String[] args) {
        try {
            CrearCUP.crearCUP();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}