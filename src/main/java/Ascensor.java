
public class Ascensor {
    int posAscensor=1;
    int pisoBajo=1;
    int pisoAlto=3;

    public int CrearPersona()throws  Exception{
        int aleatorio=(int)Math.random()*2+1;
        return aleatorio;
    }

    public int posInicial(boolean dia) {
        if(dia){
            posAscensor=1;
            return posAscensor;
        }else{
            return posAscensor;
        }
    }
    public String llamarAscensor(int posActAscensor, int piso){
        if(piso==posActAscensor){
            return "EL ascensor ya se encuentra en ese piso";
        }else{
            cambiarPiso(piso);
            return "EL ascensor ya va en camino";
        }
    }

    private void cambiarPiso(int piso){
        posAscensor=piso;
    }

    public String verificarDestino(int destino, int origen){
        if(destino==origen || destino<pisoBajo || destino>pisoAlto){
            return "El piso al que desea ir no es valido";
        }else{
            cambiarPiso(destino);
            return "El ascensor ya va en camino";
        }
    }

    public int getPosAscensor(){
        return posAscensor;
    }

}
