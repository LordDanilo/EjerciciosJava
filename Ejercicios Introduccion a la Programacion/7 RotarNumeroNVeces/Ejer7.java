
public class Ejer7{
    public String rotar(int numero, int n){
        String res = "";
        int exp = cantDig(numero)-1;
        int aux = (int)Math.pow(10, exp);
        for(int i=0; i<n; i++){
            int dig = numero%10;
            numero = numero/10;
            int base = aux*dig;
            numero = numero+base;
            res = res+numero+"\n";
        }
        return res;
    }
    private int cantDig(int num){
        int res = 0;
        while(num>0){
            res++;
            num=num/10;
        }
        return res;
    }
}
