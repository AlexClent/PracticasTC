/*
Ejercicio 5. Un número primo es aquel que es divisible solo por 1 y por sí mismo.
Para calcular si un número es primo es necesario verificar que el número a calcular
no sea divisible por todos los números menores a él. Implemente un algoritmo que
calcule si un número es primo.

Alexis Hernández Fragoso.
*/

// Importar la clase para poder leer de teclado
 import java.util.Scanner;

 public class Ejercicio5{
    public static void main(String[] args){
        
        // Se crea el objeto "Scanner" para poder leer la entrada del teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero a verificar si es primo: ");
        // Lee el valor y lo almacena en la variable "numero"
        int numero = sc.nextInt();
        
        // Al inicializar la variable en "0" ayudará a contar los divisores del número ingresado
        int suma = 0;

        for(int i = 1; i<=numero; i++){
            // Calcular el residuo de dividir el número entre "i"
            int auxiliar = numero%i;

            // Si el residuo es "0", significa que "i" es un divisor del número ingresado por el usuario
            if(auxiliar == 0){
                // Se incrementa el contador de los divisores
                suma = suma + 1;
            }
        }

        // Si la suma es de 2 o menos, el número es primo
        if(suma <= 2){
            System.out.println("\nEl numero " + numero + " es primo");
        // Si la suma es mayor que 2 el número no es primo
        } else {
            System.out.println("\nEl numero " + numero + " no es primo");
        }
    }
 }

/*
Nota: Si el número se puede divir más de dos veces entre los números anteriores a este, es decir,
los números inferiores a él y entre él mismo, no es un número primo.

Pero si el número solamente se puede dividir dos veces entre los números inferiores a él y entre sí mismo,
es decir, es un número primo.
*/