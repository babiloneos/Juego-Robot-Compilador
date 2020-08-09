# Juego Robot Compilador
Proyecto final de la materia _Compiladores_ de _Ingeniería en Computación_ en la _Facultad de Estudios Superiores Aragón_ perteneciente a la _Universidad Naciona Autónoma de México_ (**UNAM**).

## Creadores:
* Ballesteros López Bryan Guillermo [/babiloneos](https://github.com/babiloneos)
* Jasso Baldovinos Julio Cesar

## ¿Qué es esto?
Se trata de un **compilador** sencillo adaptado a un juego aún más sencillo. 
En la pantalla verás a la izquierda un cuadriculado con dos figuras, una es el Robot, y la otra es el objetivo a alcanzar.
Del lado derecho encontrarás un area de texto en donde, por medio de comandos, guiarás al robot para alcanzar su objetivo.

## ¿Cúales son los comandos?
Al tratarse de un compilador, buscamos que los comandos estén basados en un lenguaje de programación.

1. **Punto y Coma** ;
  Toda instrucción o comando deben terminar en punto y coma  `;` .
  Esto acostumbra al jugador a los lenguajes de programación más comunes.
  
2. **Acciones**
  En este caso contamos con las siguientes acciones que puede realizar el robót:
  * **Mover** : Sirve para hacer que el robót se mueva en la dirección y en la cantidad indicadas.
            Este comando se ingresa del siguiente modo:
            
     `mover [Cantidad] [Dirreción];`
              
    * **Cantidades**
          Cabe aclarar que en cantidad debemos ingresar una cantidad entera, a nuestro gusto (1, 2, 3, ... etc.). 
              
  * **Comer** : Sirve para que el robót ingiera la fruta, o bien, toque el objetivo. Para ello debe llegar antes a él
            y posicionarse en el mismo cuadrante. Si no se ingresa este comando, no ingiere la fruta.
            Este comando se ingresa del siguiente modo:
            
     `comer;`
              
3. **Dirrecciones**
  Al tratarse de una cuadricula bidimensional, y estar buscando un fácil entendiminto de los comandos,
  las direcciones básicas son:
  
     `izquierda`,
     `derecha`,
     `arriba`,
     `abajo`,
              
4. **Condicionales**
  Este tal vez sea el punto más dificil del juego, pues la sintaxis puede causar problemas.
  Las condiciones sirven para realizar alguna acción en caso de que un suceso especifico suceda (o no).
  La sintaxis es la siguiente:
  
    `si [Condición] entonces [acción];`
      
   Aquí lo especial son las condiciones que podemos poner, pues las acciones ya las conocemos.
  
   * Limites
       Una condicional básica sería el llegar al límite de la cuadrícula.
       para usar esta condición ingresamos lo siguiente:
       
      `si limite [Dirección] entonces [Acción];`
            
   * Fruta
       Para hacer más fácil este comando, suponemos que la fruta es una manzana. Así que usaremos esta
       condición para movernos según si hemos alcanzado la manzana. La sintaxis es:
       
      `si hay manzana entonces [Acción];`
            
       O bien puede que nos interese saber si no hay una manzana, entonces ponemos:
       
        `si no manzana entonces [Acción];`
            
5. **Repeticiones ( Ciclos )**
  Algo extremadamente útil en los lenguajes de programación son los ciclos, unos comandos que se repiten cuantas 
  veces nosotros queramos, ayudandonos a no tener que escribir el mismo comando una y otra vez.
  Para usarlo hacemos lo siguiente:
  
    `repite [Cantidad] veces [Acción]`
    
## **Ejemplo**
  Para dejar clara esta parte, incluímos el siguiente ejemplo:
  
```
   mover 15 arriba;
   comer;
   mover 12 derecha;
   si no manzana mover 1 derecha;
   si hay manzana comer;
   mover 8 abajo;
   repite 5 veces mover 2 abajo;
   comer;
   ```
 
## F.A.Q
### ¿Qué pasa si cometo un error?
 De nuevo, al tratarse de un compilador, no ejecutará el comando con error y a la vez te notificará de ello. 
 
### ¿Es mejorable?
 **SÍ**. Este proyecto lo hicimos en 2 días sin dormir (de verdad, 48 horas completas dedicadas en este proyecto),
 con el desgaste físico y mental de un final de semestre. Realmente es menos de la mitad de lo que nos hubiera
 gustado entregar y es rotundamente mejorable. Ejemplos:
 * Aspecto visual.
 * Animaciones.
 * Comandos más variados y útiles.
 * Lenguaje más solido.
 * Agregar un record de puntuación y tiempo o lineas límite para hacerlo más divertido.
 * Errores con especifícaciones más detalladas.
 * Errores con consejos o correcciones.
 
 En fin, es un proyecto incompleto, pero que sirve y como compilador, está completo.
 
### ¿Cómo lo puedo correr?
 La forma más sencilla es descargar el .zip disponible, y abrir el proyecto en NetBeans o Eclipse. 
 Desde ahí es simplemente ejecutarlo, pero recuerda, necesitar inclir el JAR de Java CUP y de JFLEX.
 
### ¿Dónde consigo los JAR necesarios?
 Están dentro de los archivos disponibles, a demás de en las siguientes páginas:
 JFLEX: https://jflex.de/download.html
 Java CUP: http://www2.cs.tum.edu/projects/cup/
 
 Cabe destacar que nosotros usamos las veriones JFLEX 1.6.1 y CUP 11b.
 
### ¿Cómo agrego los JAR?
 Dentro de NetBeans (que es el que nosotros usamos), abres el proyecto y en la ventana de Projects, vas a Libraries,
 click derecho y Add JAR/Folder. Después solo buscas los archivos JAR que quieres poner y listo.
 
### ¿Me ayudarían con mi proyecto?
 Claro, mandanos un correo: babiloneos@gmail.com
 Solo te recuerdo que no somos unos expertos en compiladores, pero te ayudaremos en todo lo posible.
 También puede interesarte el siguiente libro, que nos ayudó mucho a la hora de realizar el proyecto:
    Java a Tope: Traductores Y Compiladores Con Lex/yacc, Jflex/cup Y Javacc. Sergio Gálvez Rojas
    
----
    
**Y eso es todo. Qué lo disfruten y ojalá les sirva.**

Ballesteros López Bryan Guillermo "babiloneos"
babiloneso@gmail.com
Twitter: [@babiloneos](https://twitter.com/babiloneos)
 
 
 
 
