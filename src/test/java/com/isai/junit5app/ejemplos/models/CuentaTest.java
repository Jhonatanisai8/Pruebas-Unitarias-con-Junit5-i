package com.isai.junit5app.ejemplos.models;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    //metodo a testear
    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Jhonatan", new BigDecimal("1000.12345"));
        String esperado = "Jhonatan";
        String real = cuenta.getPersona();

        assertEquals(esperado, real);
        assertTrue(real.equals("Jhonatan"));
    }

    @Test
    void testSaldoCuenta() {

        Cuenta cuenta = new Cuenta("Jhonatan", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
        
    }
}
