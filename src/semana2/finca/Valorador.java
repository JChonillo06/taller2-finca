package semana2.finca;

/**
 * Servicio encargado de valorar activos mediante Pattern Matching exhaustivo.
 */
public class Valorador {

    public static double valor(Activo activo) {
        // Al ser 'Activo' una interfaz sellada (sealed), el compilador comprueba la
        // exhaustividad de los tipos permitidos, prescindiendo de la cláusula default.
        return switch (activo) {
            case Producto p -> p.precioUnitario() * p.unidades();
            case Cultivo c  -> c.hectareas() * c.costoPorHectarea();
            case Animal a   -> a.pesoKg() * a.precioPorKg();
        };
    }
}