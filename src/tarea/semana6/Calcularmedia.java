package tarea.semana6;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class Calcularmedia {
    public static void main(String[] args) {
        //declarar variables
        int suma,contador,numero;
        Scanner lectura = new Scanner(System.in);
        suma = 0;
        contador = 0;
        
        System.out.print("Ingresa un número (0 para terminar): ");
        numero = lectura.nextInt();
        
        while (numero != 0) {
            // Sumar el número
            suma += numero;
            // Contar la cantidad de números ingresados
            contador++;
            System.out.print("Ingresa otro número (0 para terminar): ");
            numero = lectura.nextInt();
        }
        
        if (contador != 0) {
             // Calcular la media
            double media = (double) suma / contador;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No ingresaste ningún número.");
        }
    }
}