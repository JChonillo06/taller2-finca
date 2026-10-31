package semana2.finca;

/**
 * Registro inmutable para insumos o productos almacenados.
 */
public record Producto(String codigo, String nombre, double precioUnitario, int unidades)
        implements Activo {

    // Constructor compacto con validación de valores no negativos
    public Producto {
        if (precioUnitario < 0 || unidades < 0) {
            throw new IllegalArgumentException("El precio unitario y las unidades no pueden ser negativos");
        }
    }
}