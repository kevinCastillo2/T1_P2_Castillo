/**
 * Nombre: Kevin Castillo
 * Fecha: 18-11-2026
 * Nrc:37712
 */

import java.util.Scanner;
import java.util.Locale;

public class T1_C2_Castillo {

    static double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static String estado(double nota) {

        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    static double necesitaEnSupletorio(double nota) {
        return 28 - nota;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;
        double prom;

        do {
            System.out.print("Ingrese la primera nota: ");
            n1 = sc.nextDouble();
        } while (n1 < 0 || n1 > 20);  //VALIDACION QUE LA NOTA SOLO SEA DE 0 A 20

        do {
            System.out.print("Ingrese la segunda nota: ");
            n2 = sc.nextDouble();
        } while (n2 < 0 || n2 > 20); //VALIDACION QUE LA NOTA SOLO SEA DE 0 A 20

        do {
            System.out.print("Ingrese la tercera nota: ");
            n3 = sc.nextDouble();
        } while (n3 < 0 || n3 > 20); //VALIDACION QUE LA NOTA SOLO SEA DE 0 A 20

        prom = promedio(n1, n2, n3);

        System.out.println("\n====== RESULTADO ACADEMICO =====");
        System.out.printf("Promedio: %.2f%n", prom);
        System.out.println("Estado: " + estado(prom));

        if (prom >= 9 && prom < 14) {
            System.out.printf(
                "Nota minima del supletorio: %.2f%n",
                necesitaEnSupletorio(prom)
            );

        }
    }
}
