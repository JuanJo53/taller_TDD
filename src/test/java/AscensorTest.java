import org.junit.Test;

import static org.junit.Assert.*;

public class AscensorTest {
    @Test
    public void siInicioDia()throws Exception{
        Ascensor asc = new Ascensor();
        int resultado = asc.posInicial(true);
        assertEquals(1,resultado);
    }

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
    public void siDestinoNoEsValido()throws Exception{
        Ascensor asc = new Ascensor();
        assertEquals("El piso al que desea ir no es valido",asc.verificarDestino(1,1));
        assertEquals("El piso al que desea ir no es valido",asc.verificarDestino(2,2));
        assertEquals("El piso al que desea ir no es valido",asc.verificarDestino(3,3));
    }

    @Test
    public void siDestinoEsValido()throws Exception{
        Ascensor asc = new Ascensor();
        assertEquals("El ascensor ya va en camino",asc.verificarDestino(1,3));
        assertEquals("El ascensor ya va en camino",asc.verificarDestino(2,3));
        assertEquals("El ascensor ya va en camino",asc.verificarDestino(3,1));
        assertEquals("El ascensor ya va en camino",asc.verificarDestino(3,2));
        assertEquals("El ascensor ya va en camino",asc.verificarDestino(2,1));
        assertEquals("El ascensor ya va en camino",asc.verificarDestino(1,2));
    }

}