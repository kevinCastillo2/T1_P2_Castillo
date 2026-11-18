/**
 * Nombre: Kevin Castillo
 * Fecha: 17-11-2026
 * Nrc: 37712
 */
import java.util.Scanner;
import java.util.Locale; 
public class T1_C3_Castillo {

    // CUBO
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    // CILINDRO
    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    // PRISMA RECTANGULAR
    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    static double leer(Scanner sc, String texto) {
        System.out.print(texto);
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n===== MENU DE VOLUMENES =====");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Prisma rectangular");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    double lado = leer(sc, "Ingrese el Lado: ");
                    System.out.printf("Volumen del cubo: %.2f%n", volumen(lado));
                    break;
                case 2:
                    double radio = leer(sc, "Ingrese el Radio: ");
                    double altura = leer(sc, "Ingrese la Altura: ");
                    System.out.printf("Volumen del cilindro: %.2f%n", volumen(radio, altura));
                    break;
                case 3:
                    double largo = leer(sc, "Ingrese el Largo: ");
                    double ancho = leer(sc, "Ingrese el Ancho: ");
                    double alto = leer(sc, "Ingrese la Alto: ");
                    System.out.printf("Volumen del prisma: %.2f%n", volumen(largo, ancho, alto));
                    break;
                case 4:
                    System.out.println("Gracias.hasta luego");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
        
    }
}