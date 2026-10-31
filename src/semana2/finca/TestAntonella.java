package semana2.finca;

public class TestAntonella {
    public static void main(String[] args) {
        try {
            new Cultivo("CU-003", "Maíz", 0.0, 950.0);
            System.err.println("Falló: no detectó las hectáreas en 0");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Antonella verificó con éxito: " + e.getMessage());
        }
    }
}
