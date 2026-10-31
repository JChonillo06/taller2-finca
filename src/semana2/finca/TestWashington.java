package semana2.finca;

public class TestWashington {
    public static void main(String[] args) {
        Producto urea = new Producto("PR-001", "Urea", 32.50, 40);
        double resultado = Valorador.valor(urea);
        if (resultado == 1300.0) {
            System.out.println("✅ Washington verificó: Cálculo de Valorador correcto ($" + resultado + ")");
        } else {
            System.err.println("Falló el cálculo del valorador");
        }
    }
}
