package rud3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PruebaRUD3Test {

    private static PruebaRUD3 app = null;

    @BeforeAll
    public static void init() {
        app = new PruebaRUD3();

    }
    
    @AfterAll
    public static void end(){
        app= null;
    }

    @Test
    void testCamino1() {
        int resultado = app.prueba(0, 0);
        assertEquals(0, resultado);
    }

    @Test
    void testCamino2() {
        int resultado = app.prueba(1, 0);
        assertEquals(0, resultado);
    }
    @Test
    void testCamino3() {
        int resultado = app.prueba(1, 1);
        assertEquals(1, resultado);
    }
}
