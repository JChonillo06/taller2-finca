package semana2.finca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FincaTest {

    // Prueba 1: Asignada a Juan
    @Test
    void testJuan_ValidacionProductoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("PR-002", "Fertilizante", -10.0, 5);
        }, "Revisado por Juan: El precio unitario no puede ser negativo");
    }

    // Prueba 2: Asignada a Antonella
    @Test
    void testAntonella_ValidacionHectareasCultivo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cultivo("CU-003", "Maíz", 0.0, 950.0);
        }, "Revisado por Antonella: Las hectáreas deben ser mayores a cero");
    }

    // Prueba 3: Asignada a Ronaldo
    @Test
    void testRonaldo_ValidacionPesoAnimal() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Animal("AN-003", "Porcino", -50.0, 2.10);
        }, "Revisado por Ronaldo: El peso del animal debe ser positivo");
    }

    // Prueba 4: Asignada a Washington
    @Test
    void testWashington_CalculoValorador() {
        Producto urea = new Producto("PR-001", "Urea", 32.50, 40);
        assertEquals(1300.00, Valorador.valor(urea), 0.01,
                "Revisado por Washington: Cálculo correcto del valorador");
    }

    // Prueba 5: Asignada a Ethan
    @Test
    void testEthan_ConversionUnidadMedida() {
        assertEquals(453.6, UnidadMedida.QUINTAL.aKilos(10.0), 0.01,
                "Revisado por Ethan: Conversión exacta de quintales a kilos");
    }
}