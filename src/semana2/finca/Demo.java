package semana2.finca;

import java.util.List;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        // Fijamos Locale US para mostrar punto decimal o dejar el por defecto regional
        Locale.setDefault(Locale.US);

        List<Activo> activos = List.of(
                new Producto("PR-001", "Saco de urea 50 kg", 32.50, 40),
                new Cultivo("CU-001", "Cacao CCN-51", 3.5, 1800.0),
                new Animal("AN-001", "Bovino", 420.0, 1.85),
                // Reto obligatorio: Activo propio de la provincia (Daule)
                new Cultivo("CU-002", "Arroz SFL-09 (Daule)", 4.0, 1250.0)
        );

        double total = 0;
        for (Activo a : activos) {
            double v = Valorador.valor(a);
            total += v;
            System.out.printf("%s -> USD %.2f%n", a, v);
        }

        System.out.printf("Valor total de la finca: USD %.2f%n", total);
        System.out.println("10 qq = " + UnidadMedida.QUINTAL.aKilos(10) + " kg");
    }
}