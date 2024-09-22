package tarea.semana6;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        // Convertir a minúsculas para evitar errores
        String frase = lectura.nextLine().toLowerCase();
        int i = 0;
        int contadorVocales = 0;
         // Recorrer toda la frase
        while (i < frase.length()) {
             // Obtener el carácter en la posición i
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                // Incrementar el contador si es una vocal
                contadorVocales++; 
            }
             // Avanzar al siguiente carácter
            i++;
        }
        
        System.out.println("La frase contiene " + contadorVocales + " vocales.");
    }
}