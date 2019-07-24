package Lexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author gballesteros
 */
public class TestLexico {
    public static void main(String[] args) {
        String ruta = System.getProperty("user.dir") + "/src/Config/fuente.txt";
        try {
            Reader leer = new BufferedReader(new FileReader(new File(ruta)));
           
            AnalizadorLexico al = new AnalizadorLexico(leer);
            while(al.next_token() != null){
                System.out.println(al.yytext());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo fuente.txt no encontrado");
        } catch (IOException ex) {
            System.out.println("Error de lectura en fuente.txt");
        }
    }
}
