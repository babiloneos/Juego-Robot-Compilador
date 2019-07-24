package Config;

import java.io.File;

/**
 *
 * @author Guillermo Ballesteros
 */
public class CrearJFlex {

    private final static String rutaArchivos = System.getProperty("user.dir") + "/src/Archivos/";
    private final static String rutaSalida = System.getProperty("user.dir") + "/src/Lexico/";

    public static void crearJFlex() {
        File file = new File(rutaArchivos + "Lexico.jflex");
        jflex.Options.setDir(rutaSalida);
        jflex.Main.generate(file);
    }

    public static void main(String[] args) {
        CrearJFlex.crearJFlex();
    }
}