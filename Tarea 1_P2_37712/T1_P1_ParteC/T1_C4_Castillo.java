/**
 * Nombre: Kevin Castillo
 * Fecha: 18-11-2026
 * Nrc: 37712
 */

import java.util.Scanner;

public class T1_C4_Castillo {

    static int contarDigitos(int n) {

        if (n == 0) {
            return 1;
        }

        int contador = 0;

        while (n > 0) {
            contador++;
            n = n / 10;
        }

        return contador;
    }

    static int potencia(int b, int e) {
        int resultado = 1;

        for (int i = 1; i <= e; i++) {
            resultado = resultado * b;
        }

        return resultado;
    }

    static boolean esArmstrong(int n) {

        if (n < 0) {
            return false;
        }

        int digitos = contarDigitos(n);
        int original = n;
        int suma = 0;

        while (n > 0) {

            int digito2 = n % 10;

            suma += potencia(digito2, digitos);

            n = n / 10;
        }

        return suma == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (esArmstrong(numero)) {
            System.out.println(numero + " es un numero Armstrong");
        } else {
            System.out.println(numero + " no es un numero Armstrong");
        }

    }
}