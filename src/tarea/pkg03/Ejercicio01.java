//condicional simple
//Crea un programa que te permita ingresa el numero de dado, cuando termina debe de mostrar puedes seguri juagando
package tarea.pkg03;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
System.out.println("Ingrese el numero del dado : ");
int numero=sc.nextInt();
        if (numero==6) {
            System.out.println("PUEDES SEGUIR JUGANDO");
    
        }
}
}
