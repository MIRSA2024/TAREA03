//condicional con multiples condiciones
//En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes resultados:
//Si los tres dados son seis, mostrar el mensaje “Excelente”
//Si dos dados se obtienen seis, mostrar el mensaje “Muy bien”
//Si un dado se obtiene seis, mostrar el mensaje “Regular”
//Si ningún dado se obtiene seis, mostrar el mensaje “Pésimo”
package tarea.pkg03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main (String[]args) {
  int dado1=0,dado2=0,dado3=0;
Scanner entrada=new Scanner (System.in);  
//entrada
System.out.println("Ingrese numero del primer dado: ");
dado1 =entrada.nextInt();

System.out.println("ingrese numero del Segundo dado: ");
dado2=entrada.nextInt();

System.out.println("ingrese numero del Tercer dado: ");
dado3=entrada.nextInt();

//Proceso
if (dado1==6 && dado2==6 && dado3==6) {
    System.out.println("Excelente");
}
else if ((dado1==6 && dado2==6) || (dado1==6 && dado3==6) || (dado2==6 && dado3==6)){
    System.out.println("Muy bueno");
}
else if ( (dado1==6) || (dado2==6)|| ( dado3==6) ) {
    System.out.println("Regular");
}
else {
    System.out.println("Pesimo");
 }
}
    }
    