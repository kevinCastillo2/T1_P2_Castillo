/*Nombre: Kevin Castillo 
Fecha: 18-11-2026
Nrc: 37712
*/ 
import java.util.Scanner; 
import java.util.Locale; 

public class T1_C1_Castillo {
    static final double cargo_fijo = 2.50;
    static final double limite_m3 = 15;
    static final double tarifa_base = 0.40;
    static final double tarifa_exceso = 0.75;

    static double leerConsumo(Scanner sc) {
        double m3;
        do {
            System.out.print("Consumo del mes (m3): ");
            m3 = sc.nextDouble();
            if (m3 < 0) {
                System.out.println("Error: el consumo del mes no puede ser negativo");
            }
        } while (m3 < 0);
        return m3;
    }

    static double calcularValor(double m3) {
        double base = Math.min(m3, limite_m3) * tarifa_base;
        double exceso = Math.max(m3 - limite_m3, 0) * tarifa_exceso;
        return cargo_fijo + base + exceso;
    }

    static void mostrarPlanilla(double m3, double valor) {
        System.out.println("\n====== PLANILLA DE AGUA ======");
        System.out.printf("Consumo:      %.2f m3%n", m3);
        System.out.printf("Cargo fijo:   $%.2f%n", cargo_fijo);
        System.out.printf("TOTAL A PAGAR: $%.2f%n", valor);
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

        double m3 = leerConsumo(sc);
        double valor = calcularValor(m3);
        mostrarPlanilla(m3, valor);
    }
  }

