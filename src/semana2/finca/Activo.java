package semana2.finca;

/**
 * Interfaz sellada que define el contrato común para los activos de la finca.
 * Solo permite como subtipos a Producto, Cultivo y Animal.
 */
public sealed interface Activo permits Producto, Cultivo, Animal {
    String codigo(); // Todo activo debe poseer un código identificador
}