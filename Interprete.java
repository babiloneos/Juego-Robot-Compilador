package Interprete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gballesteros
 */
public class Interprete {
    private String ruta = System.getProperty("user.dir") + "/src/Archivos/intermedio.fes";
    private File Archivo = new File(ruta);
    private BufferedReader br;

    private Boolean inicio, fin;
    
    public Interprete() {
        try {
            
            br = new BufferedReader(new FileReader(Archivo));
            String lectura = br.readLine();
            
            while(lectura != null){
                Decisiones(lectura);
                lectura = br.readLine();
            }
                
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error de lectura de intermedio.fes");
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar intermedio.fes");
            }
        }
    }
    
    public void Decisiones(String inter){
        
        String[] instrucciones;
        instrucciones = inter.split(" ");
        
        switch(instrucciones[0]){
            case "START":
                inicio = true;
                break;
            case "FINISH":
                fin = true;
                System.out.println("TODO OK :D");
                break;
            case "MOVE":
                /*   Checar cantidad   */
                
                int repeticiones = Integer.valueOf(instrucciones[2]);
                
                switch(instrucciones[1]){
                    case "LEFT":
                        for (int i = 0; i < repeticiones; i++){
                            
                        }
                        break;
                    case "RIGHT":
                        for (int i = 0; i < repeticiones; i++){
                            
                        }
                        break;
                    case "UP":
                        for (int i = 0; i < repeticiones; i++){
                            
                        }
                        break;
                    case "DOWN":
                        for (int i = 0; i < repeticiones; i++){
                            
                        }
                        break;
                }
                
                break;
            case "EAT":
                /*   Mandar a comer   */
                break;
            case "IF":
                
                if (Condiciones(instrucciones)){ // Se cumple la condición
                    String temp = "";
                    for (int i = 4; i < instrucciones.length; i++){
                        temp += instrucciones[i];
                        temp += " ";
                    }
                    Decisiones(temp);
                }
                
                break;
            case "FOR":
                
                int rep = Integer.valueOf(instrucciones[1]);
                String temp = "";
                for (int i = 3; i < instrucciones.length; i++){
                    temp += instrucciones[i];
                    temp += " ";
                }
                
                for (int j = 0; j < rep; j++){
                    Decisiones(temp);
                }
                
                break;
            default:
                /*IMPOSIBLE*/
                System.out.println("ERROR EN LA MATRIX");
        }
    }
    
    public Boolean Condiciones(String[] inst){
        
        switch(inst[1]){
            case "LEFT":
                /*   VErificar si está en el límite izquierdo   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                break;
            case "RIGHT":
                /*   VErificar si está en el límite derecho   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                break;
            case "UPPER":
                /*   VErificar si está en el límite superior   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                break;
            case "LOWER":
                /*   VErificar si está en el límite inferior   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                break;
            case "IS":
                /*   VErificar si está en la manzana   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                break;
            case "NOT":
                /*   VErificar si no está en la manzana   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                break;
        }
        
        return true;
    }
}
