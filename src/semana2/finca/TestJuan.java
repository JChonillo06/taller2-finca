package semana2.finca;

public class TestJuan {
    public static void main(String[] args) {
        try {
            new Producto("PR-002", "Fertilizante", -10.0, 5);
            System.err.println("Falló: no detectó el precio negativo");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Juan verificó con éxito: " + e.getMessage());
        }
    }
}
