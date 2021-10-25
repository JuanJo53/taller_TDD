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
    //check
    @Test
    public void siNoInicioDia()throws Exception{
        //1. Preparacion de la prueba
        Ascensor asc = new Ascensor();
        //2. Logica de la prueba
        int resultado = asc.posInicial(false);
        //3. Verificacion o assert
        assertEquals(2,resultado);
    }

}