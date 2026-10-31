package semana2.finca;

/**
 * Registro inmutable que representa áreas sembradas.
 */
public record Cultivo(String codigo, String nombre, double hectareas, double costoPorHectarea)
        implements Activo {

    // Constructor compacto
    public Cultivo {
        if (hectareas <= 0) {
            throw new IllegalArgumentException("Las hectáreas deben ser estrictamente positivas");
        }
        if (costoPorHectarea < 0) {
            throw new IllegalArgumentException("El costo por hectárea no puede ser negativo");
        }
    }
}