package semana2.finca;

public class TestRonaldo {
    public static void main(String[] args) {
        try {
            new Animal("AN-003", "Porcino", -50.0, 2.10);
            System.err.println("Falló: no detectó el peso negativo");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Ronaldo verificó con éxito: " + e.getMessage());
        }
    }
}
