package Lexico;
import java_cup.runtime.*;
import java.util.LinkedList;
import Config.TError;
import Sintactico.Simbolos;

%%
%public
%class AnalizadorLexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

%{  // Codigo agregado al jflex

    public static LinkedList<TError> TablaEL = new LinkedList<TError>();

    public int linea(){
        return yyline;
    }
    public int columna(){
        return yycolumn;
    }

%}

%%

/*     BASICO     */
"inicio" {      System.out.print("In : Inicio \t"); 
        return new Symbol(Simbolos.Inicio, columna(), linea(), yytext());
}
"fin" {         System.out.print("In : Fin\t"); 
        return new Symbol(Simbolos.Fin, columna(), linea(), yytext());
}
";" {           System.out.print("In : PyC\n"); 
        return new Symbol(Simbolos.PyC, columna(), linea(), yytext());
}

/*     ACCIONES     */
"mover" {       System.out.print("In : Mover\t"); 
        return new Symbol(Simbolos.Mover, columna(), linea(), yytext());
}
"comer" {       System.out.print("In : Comer\t"); 
        return new Symbol(Simbolos.Comer, columna(), linea(), yytext());
}

/*     CONDICIONES     */
"si" {          System.out.print("In : Si\t"); 
        return new Symbol(Simbolos.If, columna(), linea(), yytext());
}
"entonces" {          System.out.print("In : Entonces\t"); 
        return new Symbol(Simbolos.Entonces, columna(), linea(), yytext());
}
"repite" {    System.out.print("In : Repetir\t"); 
        return new Symbol(Simbolos.Repite, columna(), linea(), yytext());
}
"veces" {          System.out.print("In : Veces\t"); 
        return new Symbol(Simbolos.Veces , columna(), linea(), yytext());
}

"hay" {         System.out.print("In : Si_Hay\t"); 
        return new Symbol(Simbolos.Hay, columna(), linea(), yytext());
}
"no" {          System.out.print("In : No_Hay\t"); 
        return new Symbol(Simbolos.No_Hay, columna(), linea(), yytext());
}
"limite" {      System.out.print("In : Limite\t"); 
        return new Symbol(Simbolos.Limite, columna(), linea(), yytext());
}

/*     PARAMETROS     */
[:digit:]+ {        System.out.print("In : Cantidad " + yytext() + "\t"); 
        return new Symbol(Simbolos.Num, columna(), linea(), Integer.parseInt(yytext()));
}
"manzana" {     System.out.print("In : Manzana\t"); 
        return new Symbol(Simbolos.Manzana, columna(), linea(), yytext());
}

/*   DIRECCIONES   */
"izquierda" {   System.out.print("In : Izquierda\t"); 
        return new Symbol(Simbolos.Izq, columna(), linea(), "IZQ");
}
"derecha" {     System.out.print("In : Derecha\t"); 
        return new Symbol(Simbolos.Der, columna(), linea(), "DER");
}
"arriba" {      System.out.print("In : Arriba\t"); 
        return new Symbol(Simbolos.Arr, columna(), linea(), "ARR");
}
"abajo" {       System.out.print("In : Abajo\t"); 
        return new Symbol(Simbolos.Aba, columna(), linea(), "ABA");
}

/*     OTROS     */
[ \t\r\n\f] {/*  Ignoramos  */}

. {/*  Error  */ System.out.println("Error en linea:" + linea()); 
        TError datos = new TError(yytext(),linea(),columna(),"Error Lexico","Simbolo no existe en el lenguaje");
        TablaEL.add(datos);
}