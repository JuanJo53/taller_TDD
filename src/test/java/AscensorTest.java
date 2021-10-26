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
        assertEquals(if(asc.posAscensor==1){"jdslf"}else{"hfls"},resultado);
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
        Ascensor asc = new Ascensor();
        int resultado = asc.CrearPersona();
        assertTrue(resultado>=1&&resultado<4);
    }

    @Test
    public void verificarDesdePisoUno()throws Exception{
        Ascensor asc = new Ascensor();

        if(asc.posAscensor==1){
            assertEquals("EL ascensor ya se encuentra en ese piso", asc.llamarAscensor(1));
        }else{
            assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(1));
        }
    }
    @Test
    public void verificarDesdePisoDos()throws Exception{
        Ascensor asc = new Ascensor();

        if(asc.posAscensor==2){
            assertEquals("EL ascensor ya se encuentra en ese piso", asc.llamarAscensor(2));
        }else{
            assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(2));
        }
    }
    @Test
    public void verificarDesdePisoTres()throws Exception{
        Ascensor asc = new Ascensor();

        if(asc.posAscensor==3){
            assertEquals("EL ascensor ya se encuentra en ese piso", asc.llamarAscensor(3));
        }else{
            assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(3));
        }
    }



}