public class NumerosNovios{
    public String verificador(int numero1, int numero2){
        String res = "";
        if(numero1 != numero2){
            int sumDivNum1 = sumatoriaDiv(numero1);
            int sumDivNum2 = sumatoriaDiv(numero2);
            int suma = numero1+numero2+1;
            if(sumDivNum1 == sumDivNum2 && sumDivNum1==suma){
                res = "SI son numeros novios";
            }else{
                res = "NO son numeros novios";
            }
        }else{
            res = "Los numeros son iguales, no puedo verificar";
        }
        return res;
    }
    private int sumatoriaDiv(int num){
        int res = 0;
        for(int div=1; div<=num; div++){
            if(num%div == 0){
                res = res+div;
            }
        }
        return res;
    }
}
