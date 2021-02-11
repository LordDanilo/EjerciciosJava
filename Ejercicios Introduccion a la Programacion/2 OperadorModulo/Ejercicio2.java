public class Ejercicio2{
    public int verificador(int numero){
        int res = -1;
        int last = numero%100;
        if( last%4 == 0 ){
            res = last;
        }
        return res;
    }
}
