/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.SwingUtilities;
import GUI.Tablero;
import static GUI.Tablero.Score;
import Interprete.Intermedio;
import Interprete.Interprete;
import Lexico.AnalizadorLexico;
import Sintactico.analisis_sintactico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author COMPAQ
 */
public class Tabla extends javax.swing.JFrame {
    String mover = "mover";
    String comer = "comer";
    String repetir = "repetir";
    static String Direccion;
    static Boolean accion;
    static String b = new String();
    Boolean inicio, fin;
    /**
     * Creates new form Tabla
     */
    Tablero Tablero;
    public Tabla() {
        initComponents();
        Tablero = new Tablero();
        jPanel3.add(Tablero);
        Tablero.Aleatorios();
        CrearArchivo();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Introduce Instrucciones:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Puntucación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a;
        //puntaje del jugador
        String puntos = Integer.toString(Score);
        try{
        //este es el string del textfield este se puede quitar sin p2
        a = jTextField1.getText();
        //este es el string del textarea
        b = jTextArea1.getText();
        System.out.println("b:" +b);
        
        EscribirArchivo();
        
        /*      CONEXIÓN CON COMPILADOR      */
        String ruta = System.getProperty("user.dir") + "/src/Archivos/fuente.txt";
        File archivo = new File(ruta);
        
        BufferedReader br = new BufferedReader(new FileReader(archivo));
            
        AnalizadorLexico lexer = new AnalizadorLexico(br);
        analisis_sintactico sintax = new analisis_sintactico(lexer);
        Symbol parse = sintax.parse();

        Intermedio interm = new Intermedio(sintax.getInter());

        interpretar();
        
        
        Tablero.updateUI();
        jLabel3.setText(puntos);
        
        br.close();
        
        }catch (Exception e){
            System.out.println("Introduzca la Instrucción");
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }
    
    public static void CrearArchivo(){
        File archivo = new File("src/Archivos/fuente.txt");
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente\n");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void EscribirArchivo(){
        File archivo = new File("src/Archivos/fuente.txt");
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.println(b);
            salida.close();
            System.out.println("Se ha escrito correctamente en el archivo\n");
        }catch(IOException ex){
        ex.printStackTrace();
        }
    }
    
    public void interpretar(){
        String ruta = System.getProperty("user.dir") + "/src/Archivos/intermedio.fes";
        File Archivo = new File(ruta);
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(Archivo));
            String lectura = br.readLine();
            
            while(lectura != null){
                Decisiones(lectura);
                lectura = br.readLine();
            }
       
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
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
                
                int repeticiones = Integer.valueOf(instrucciones[2]);
                switch(instrucciones[1]){
                    case "LEFT":
                        for (int i = 0; i < repeticiones; i++){
                            Tablero.Mover("izquierda");
                        }
                        break;
                    case "RIGHT":
                        for (int i = 0; i < repeticiones; i++){
                            Tablero.Mover("derecha");
                        }
                        break;
                    case "UP":
                        for (int i = 0; i < repeticiones; i++){
                            Tablero.Mover("arriba");
                        }
                        break;
                    case "DOWN":
                        for (int i = 0; i < repeticiones; i++){
                            Tablero.Mover("abajo");
                        }
                        break;
                }
                
                break;
            case "EAT":
                Tablero.Comer();
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
                if(Tablero.posX==0){
                    return true;
                } else {
                    return false;
                }
            case "RIGHT":
                if(Tablero.posX==25){
                    return true;
                } else {
                    return false;
                }
            case "UPPER":
                if(Tablero.posY==25){
                    return true;
                } else {
                    return false;
                }
            case "LOWER":
                if(Tablero.posY==0){
                    return true;
                } else {
                    return false;
                }
            case "IS":
                /*   VErificar si está en la manzana   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                if(Tablero.posX==Tablero.posAX && Tablero.posY==Tablero.posAY){
                    return true;
                } else {
                    return false;
                }
            case "NOT":
                /*   VErificar si no está en la manzana   
                    Si es verdadero, return true;
                    De lo contrario, return false*/
                
                if(Tablero.posX!=Tablero.posAX || Tablero.posY!=Tablero.posAY){
                    return true;
                } else {
                    return false;
                }
        }
        
        return true;
    }
                     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
