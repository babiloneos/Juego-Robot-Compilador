package Sintactico;

import Lexico.AnalizadorLexico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author gballesteros
 */
public class TestSintactico {
    public static void main(String[] args) {
        String ruta = System.getProperty("user.dir") + "/src/Config/fuente.txt";
        try {
            Reader leer = new BufferedReader(new FileReader(new File(ruta)));
           
            AnalizadorLexico al = new AnalizadorLexico(leer);
            analisis_sintactico as = new analisis_sintactico(al);
            Symbol parse = as.parse();
            System.out.println(parse.toString());
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("\t FileNotFoundException ");
        } catch (IOException ex) {
            System.out.println("\t IOException");
        } catch (Exception ex) {
            System.out.println("Exception " + ex.getMessage());
        }
    }
}
