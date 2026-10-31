package semana2.finca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestEthan {
    @Test
    void testConversionUnidadMedida() {
        assertEquals(453.6, UnidadMedida.QUINTAL.aKilos(10.0), 0.01,
                "Ethan verificó: 10 quintales equivalen a 453.6 kg");
    }
}