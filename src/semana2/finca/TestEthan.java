package semana2.finca;

public class TestEthan {
    public static void main(String[] args) {
        double kilos = UnidadMedida.QUINTAL.aKilos(10.0);
        if (kilos == 453.6) {
            System.out.println("✅ Ethan verificó con éxito: 10 qq son " + kilos + " kg");
        }
    }
}
