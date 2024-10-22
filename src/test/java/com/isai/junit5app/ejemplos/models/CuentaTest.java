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
    
    @Test
    void testReferenciaCuenta(){
        Cuenta c1 = new Cuenta("Jhonatan Isai", new BigDecimal("8900.9997"));
        Cuenta c2 = new Cuenta("Jhonatan Isai", new BigDecimal("8900.9997"));
        
        //assertNotEquals(c2, c1);
        assertEquals(c2, c1);
        
        
    }
}
