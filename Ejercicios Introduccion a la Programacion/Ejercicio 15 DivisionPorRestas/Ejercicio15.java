public class Ejercicio15{
    public int dividir(int dividendo, int divisor){
        int res=0;
        while(dividendo>=divisor){
            dividendo = dividendo-divisor;
            res++;
        }
        return res;
    }
}
