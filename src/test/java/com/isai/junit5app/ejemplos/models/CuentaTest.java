package com.isai.junit5app.ejemplos.models;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    //metodo a testear
    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("honatan", new BigDecimal("1000.12345"));
        String esperado = "Jhonatan";
        String real = cuenta.getPersona();
        
        assertEquals(esperado, real);
        assertTrue(real.equals("Jhonatan"));
    }
    
}
