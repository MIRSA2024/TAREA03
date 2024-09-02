//condicionales doble 
//Determinar si un número es múltiplo de 10
package tarea.pkg03;

import java.util.Scanner;


public class Ejercicio02 {
     public static void main(String[] args) {
        int numero=0;
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero=entrada.nextInt();

        if(numero%10==0){
            System.out.println("Es multiplo de 10");
        }
        else{
            System.out.println("No es multiplo de 10");
        }
    }

}

