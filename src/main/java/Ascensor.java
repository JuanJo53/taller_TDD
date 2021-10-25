
public class Ascensor {
    int posAscensor=1;

    public int CrearPersona()throws  Exception{
        int aleatorio=(int)Math.random()*2+1;
        int aleatorio2=(int)Math.random()*2+1;

        System.out.println(aleatorio);
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
}
