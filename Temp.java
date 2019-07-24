package Interprete;

import Lexico.AnalizadorLexico;
import Sintactico.analisis_sintactico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author gballesteros
 */
public class Temp {
    public static void main(String[] args) {
        String ruta = System.getProperty("user.dir") + "/src/Archivos/fuente.txt";
        File archivo = new File(ruta);
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            AnalizadorLexico lexer = new AnalizadorLexico(br);
            analisis_sintactico sintax = new analisis_sintactico(lexer);
            Symbol parse = sintax.parse();
            
            Intermedio interm = new Intermedio(sintax.getInter());
            
            Interprete interp = new Interprete();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Temp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Temp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
