/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.test;

import ico.fes.Metodo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class Pruebas {
    private Metodo object;
    public Pruebas() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new Metodo();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private static final double DELTA = 1e-15;
    @Test
    public void casoUno() {
        object.setCompra(1,2,0);
        float esperado = (float)617.5;
        assertEquals(esperado,object.calcularPrecio(),DELTA);
    }
    @Test
    public void casoDos() {
        object.setCompra(2,2,2);
        float esperado = (float)1343.2;
        assertEquals(esperado,object.calcularPrecio(),DELTA);
    }
    @Test
    public void casoTres() {
        object.setCompra(0,1,0);
        assertEquals(230,object.calcularPrecio(),DELTA);
    }
}
