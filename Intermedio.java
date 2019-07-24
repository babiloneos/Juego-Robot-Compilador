package Interprete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gballesteros
 */
public class Intermedio {
    
    private String ruta = System.getProperty("user.dir") + "/src/Archivos/intermedio.fes";
    private File Archivo = new File(ruta);
    private BufferedWriter bw;


    public Intermedio(ArrayList<String> a) throws IOException {
        try {
            if (Archivo.exists()) {
                Archivo.delete();
                Archivo.createNewFile();
            } 
         
            bw = new BufferedWriter(new FileWriter(Archivo));
            while (!a.isEmpty()) {
                bw.write((String) a.remove(0) + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bw) {
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
}
