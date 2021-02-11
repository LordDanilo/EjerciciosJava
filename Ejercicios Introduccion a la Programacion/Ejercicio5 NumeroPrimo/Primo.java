public class Primo{
    public boolean verificador(int numero){
        boolean res = false;
        if(numero>1){
            res = true;
            for(int div = 2; div<=(numero/2) && res==true; div++){
                if(numero%div == 0){
                    res = false;
                }
            }
        }
        return res;
    }
}
