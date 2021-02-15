public class NumeroUnicornio{
    public String verificar(int numero){
        String res = "";
        int cantDig = cantidadDigitos(numero);
        int cont;
        if(cantDig % 2 == 0){
            cont = (cantDig/2)-1;
        }else{
            cont = (cantDig/2);
        }
        for(int i=0; i<cont; i++){
            numero = numero/10;
        }
        int corazon;
        if(cantDig % 2 == 0){
            corazon = numero%100;
        }else{
            corazon = numero%10;
        }        
        if(corazon%3 == 0){
            res = "SI es un Numero Unicornio";
        }else{
            res = "NO es un Numero Unicornio";
        }
        return res;
    }
    private int cantidadDigitos(int num){
        int res = 0;
        while(num>0){
            res++;
            num = num/10;
        }
        return res;
    }
}
