package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import static GUI.Tabla.Direccion;
import static GUI.Tabla.accion;
import java.awt.event.*;
import javax.swing.SwingUtilities;

public class Tablero extends javax.swing.JPanel{
    //posición del cuadrito rojo
    int posicion_x=15;
    int posicion_y=15;
    //posición en el tablero
    int posX=1;
    int posY=1;
    //posición del cuadrito azul
    int posi_X;
    int posi_Y;
    //posición azul en el tablero
    int posAX;
    int posAY;
    //puntuación
    static int Score;
    
    private int velocidad = 22;
    public void Aleatorios(){
            int X = (int)(Math.random()*25)+1;
            int Y = (int)(Math.random()*25)+1;
            posAX=X;
            posAY=Y;
            System.out.println(posAX+"X_Y"+posAY);
            posi_X = 15 * X;
            posi_Y = 15 * Y;
    }
    public Tablero(){
    
        this.setVisible(true);
        this.setBounds(80,0,461,612);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
        
    }
    public void paint(Graphics g){
        update(g);
    }
    public void update(Graphics g){
       Graphics2D g2 = (Graphics2D)g;
        Dimension d = this.getSize();
        Image imagenn= createImage(d.width,d.height);
        Graphics2D fondo = (Graphics2D) imagenn.getGraphics();
        Dibujar(fondo);
        g2.drawImage(imagenn,0,0,this);
    }
    public void Dibujar(Graphics g){
        
        Graphics2D G2=(Graphics2D)g;
        Graphics2D G3=(Graphics2D)g;
        Tablero tablero = new Tablero();
        int posicion_x=15;
        int posicion_y=15;
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                G2.drawRect(posicion_x, posicion_y, 15, 15);
                posicion_x+=15;
            }
            posicion_y+=15;
            posicion_x=15;
        }
        G2.setColor(Color.red);
        G2.fill3DRect(this.posicion_x,this.posicion_y,15,15,true);
        G3.setColor(Color.blue);
        G3.fill3DRect(this.posi_X,this.posi_Y,15,15,true);
        System.out.println(posi_X+"_"+posi_Y);
        
    }
    
    public void Mover(String direccion){
            String arriba="arriba";
            String abajo="abajo";
            String derecha="derecha";
            String izquierda="izquierda";
        if(direccion==null){}else{    
            if(direccion.equals(arriba)){
                System.out.println(direccion);
                if(this.posY!=1){
                    this.posicion_y-=15;
                    posY--;
                    System.out.println("Rojo:"+posX+"_"+posY);
                }
            }else if(direccion.equals(abajo)){
                System.out.println(direccion);
                if(this.posX!=25){
                    this.posicion_y+=15;
                    posY++;
                    System.out.println("Rojo:"+posX+"_"+posY);
                }
            }else if(direccion.equals(derecha)){
                System.out.println(direccion);
                if(this.posX!=25){
                    this.posicion_x+=15;
                    posX++;
                    System.out.println("Rojo:"+posX+"_"+posY);
                }
            }else if(direccion.equals(izquierda)){
                System.out.println(direccion);
                if(this.posX!=1){
                    this.posicion_x-=15;
                    posX--;
                    System.out.println("Rojo:"+posX+"_"+posY);
                }
            }
        }
    }
    
    public void Comer(){
        if(posX==posAX&&posY==posAY){
            int X = (int)(Math.random()*25)+1;
            int Y = (int)(Math.random()*25)+1;
            posAX=X;
            posAY=Y;
            System.out.println(posAX+"X_Y"+posAY);
            posi_X = 15 * X;
            posi_Y = 15 * Y;
            Score+=100;
        }
    }

}
