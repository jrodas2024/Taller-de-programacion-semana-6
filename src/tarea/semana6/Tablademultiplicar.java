package tarea.semana6;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class Tablademultiplicar {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int numero = lectura.nextInt();
         // Contador para la multiplicación
        int i = 1;
         // Se repite hasta multiplicar por 10
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
             // Incrementa el contador
            i++;
        }
    }
}
