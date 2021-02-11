public class Ejercicio9{
    public String verificador(int numero1, int numero2){
        String res = "Alguno de los valores de entrada es un 1";
        if(numero1>1 && numero2>1){
            int sumDiv1 = sumarDiv(numero1);
            int sumDiv2 = sumarDiv(numero2);
            if(sumDiv1 == numero2 && sumDiv2 == numero1){
                res = "Son Amigos";
            }else{
                res = "No son Amigos";
            }
        }
        return res;
    }

    private int sumarDiv(int numero){
        int sumatoria = 0;
        for(int div = 1; div <= (numero/2); div++){
            if(numero%div  == 0){
                sumatoria = sumatoria+div;
            }
        }
        return sumatoria;
    }
}
