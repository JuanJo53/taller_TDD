import org.junit.Test;

import static org.junit.Assert.*;

public class AscensorTest {
    @Test
    public void siInicioDia()throws Exception{
        //1. Preparacion de la prueba
        Ascensor asc = new Ascensor();
        //2. Logica de la prueba
        int resultado = asc.posInicial(true);
        //3. Verificacion o assert
        assertEquals(1,resultado);
    }

//    @Test
//    public void siNoInicioDia()throws Exception{
//        //1. Preparacion de la prueba
//        Ascensor asc = new Ascensor();
//        //2. Logica de la prueba
//        int resultado = asc.posInicial(false);
//        //3. Verificacion o assert
//        assertTrue(resultado!=1);
//    }

    @Test
    public void crearPersona()throws Exception{
        //1. Preparacion de la prueba
        Ascensor asc = new Ascensor();
        //2. Logica de la prueba
        int resultado = asc.CrearPersona();
        //3. Verificacion o assert
        assertTrue(resultado>=1&&resultado<4);
    }

}