package semana2.finca;

/**
 * Registro inmutable para el ganado o especies pecuarias/acuícolas.
 */
public record Animal(String codigo, String especie, double pesoKg, double precioPorKg)
        implements Activo {

    // Reto del grupo: validación de peso y precio
    public Animal {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0 kg");
        }
        if (precioPorKg < 0) {
            throw new IllegalArgumentException("El precio por kg no puede ser negativo");
        }
    }
}