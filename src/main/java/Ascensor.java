
public class Ascensor {
    int posAscensor=1;
    public int CrearPersona()throws  Exception{
        int aleatorio=(int)Math.random()*2+1;
        return aleatorio;
    }
    public int DestinoPersona(int aleatorio)throws  Exception{
        int aleatorio2=(int)Math.random()*2+1;
        if(aleatorio2==aleatorio){aleatorio2=(int)Math.random()*2+1;}
        return aleatorio2;
    }
    public int posInicial(boolean dia) {
        if(dia){
            posAscensor=1;
            return posAscensor;
        }else{
            return posAscensor;
        }
    }
    public String llamarAscensor(int piso){
        if(piso==posAscensor){
            return "EL ascensor ya se encuentra en ese piso";
        }else{
            posAscensor=piso;
            return "El ascensor ya va en camino";
        }
    }
    public String verificarDestino(int piso){
        if(piso==posAscensor || piso<1 || piso>3){
            return "El piso al que desea ir no es valido";
        }else{
            posAscensor=piso;
            return "El ascensor ya va en camino";
        }
    }

}
