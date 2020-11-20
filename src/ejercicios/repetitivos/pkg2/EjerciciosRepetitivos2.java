/*
 Escribe un programa que visualice la suma de los 50 
primeros números impares.
 */
package ejercicios.repetitivos.pkg2;

/**
 *
 * @author Iván Martínez Albalá
 */
public class EjerciciosRepetitivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short numero;
        int suma;
        short contador;
        numero = 1;
        suma = 0;
        contador = 0;

        while (contador != 50) {
            suma = suma + numero;
            contador = (short) (contador + 1);
            numero = (short) (numero + 2);
        }
        System.out.println("Primer cambio Rama Master");
        System.out.println("Cambio en la Rama Master");
    }
}