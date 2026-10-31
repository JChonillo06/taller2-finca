package semana2.finca;

/**
 * Enumeración con estado y comportamiento para conversiones de peso.
 */
public enum UnidadMedida {
    KILOGRAMO("kg", 1.0),
    QUINTAL("qq", 45.36),
    TONELADA("t", 1000.0);

    private final String simbolo;
    private final double factorAKilos;

    UnidadMedida(String simbolo, double factorAKilos) {
        this.simbolo = simbolo;
        this.factorAKilos = factorAKilos;
    }

    public double aKilos(double cantidad) {
        return cantidad * factorAKilos;
    }

    public String simbolo() {
        return simbolo;
    }
}