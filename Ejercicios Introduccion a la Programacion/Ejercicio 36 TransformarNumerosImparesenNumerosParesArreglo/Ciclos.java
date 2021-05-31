public class Ciclos{
    
    //Sentencias de Control Ciclicas
    //while
    //for
    //do_while
    public int contarDig(int num){
        int res = 0;
        for(int i=num; i>0; i = i/10){ //condicion(es)
            res++;
        }
        return res;
    }
    
    public void saludador(int num){
        for(int i=0; i<num ; i++){
            System.out.println("Hola");
        }
    }
}
