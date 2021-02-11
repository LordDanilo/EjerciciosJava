public class NumeroRaro{
    public int transformar(int numero){
        int res=0;
        if(numero<10){
            res = numero;
        }else{
            int lastDig = numero%10;
            while(numero>=10){
                numero = numero/10;
            }
            res = (numero*10)+lastDig;
        }
        return res;
    }
}
