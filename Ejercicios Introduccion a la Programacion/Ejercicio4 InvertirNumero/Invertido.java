public class Invertido{
    public int invertir(int numero){
        int res = 0;
        while(numero>0){
            int dig = numero%10;
            res = (res*10)+dig;
            numero = numero/10;
        }
        return res;
    }
}
