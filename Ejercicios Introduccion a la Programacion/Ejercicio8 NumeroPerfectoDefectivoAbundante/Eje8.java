public class Eje8{
    public String verificador(int numero){
        String res = "El 1 es un caso especial";
        if(numero>1){
            int sumatoria = 0;
            for(int div = 1; div <= (numero/2); div++){
                if(numero%div  == 0){
                    sumatoria = sumatoria+div;
                }
            }
            if(sumatoria == numero){
                res = "El numero es Perfecto";
            }else{
                if(sumatoria < numero){
                    res = "El numero es Defectivo";
                }else{
                    res = "El numero es Abundante";
                }
            }
        }
        return res;
    }
}
