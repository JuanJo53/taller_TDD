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
//        assertEquals(if(asc.posAscensor==1){"jdslf"}else{"hfls"},resultado);
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
    public void verificarLlamadaAscensor()throws Exception{
        Ascensor asc = new Ascensor();

        assertEquals("EL ascensor ya se encuentra en ese piso", asc.llamarAscensor(1,1));
        assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(2,1));
        assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(3,1));
        assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(1,2));
        assertEquals("EL ascensor ya se encuentra en ese piso", asc.llamarAscensor(2,2));
        assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(3,2));
        assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(1,3));
        assertEquals("EL ascensor ya va en camino", asc.llamarAscensor(2,3));
        assertEquals("EL ascensor ya se encuentra en ese piso", asc.llamarAscensor(3,3));
    }

    @Test
    public void verificarSiDestinoEsValido()throws Exception{
        //1. Preparacion de la prueba
        Ascensor asc = new Ascensor();
        //2. Logica de la prueba
//        String resultado = asc.verificarDestino(0);
        //3. Verificacion o assert
        assertEquals("El piso al que desea ir no es valido",asc.verificarDestino(0));
        assertEquals("El piso al que desea ir no es valido",asc.verificarDestino(4));
//        assertEquals(if(asc.posAscensor==1){"jdslf"}else{"hfls"},resultado);
    }

    @Test
    public void verificarSiDestinoEsElMismoPisoUno()throws Exception{
        //1. Preparacion de la prueba
        Ascensor asc = new Ascensor();
        //2. Logica de la prueba
        //3. Verificacion o assert
        if(asc.posAscensor==1){
            assertEquals("El piso al que desea ir no es valido", asc.verificarDestino(1));
        }else{
            assertEquals("El ascensor ya va en camino", asc.verificarDestino(1));
        }
    }

    @Test
    public void verificarSiDestinoEsElMismoPisoDos()throws Exception{
        //1. Preparacion de la prueba
        Ascensor asc = new Ascensor();
        //2. Logica de la prueba
        //3. Verificacion o assert
        if(asc.posAscensor==2){
            assertEquals("El piso al que desea ir no es valido", asc.verificarDestino(2));
        }else{
            assertEquals("El ascensor ya va en camino", asc.verificarDestino(2));
        }
    }

    @Test
    public void verificarSiDestinoEsElMismoPisoTres()throws Exception{
        //1. Preparacion de la prueba
        Ascensor asc = new Ascensor();
        //2. Logica de la prueba
        //3. Verificacion o assert
        if(asc.posAscensor==3){
            assertEquals("El piso al que desea ir no es valido", asc.verificarDestino(3));
        }else{
            assertEquals("El ascensor ya va en camino", asc.verificarDestino(3));
        }
    }



}