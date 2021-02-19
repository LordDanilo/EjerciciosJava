public class NumeroFeliz{
    public String verificar(int numero){
        String res = "";
        int original = numero;
        boolean bandera = true;
        while(bandera==true){
            int sumaCuadrados = sumarCuadrados(numero);
            if(sumaCuadrados == 1){
                res = "SI es un numero Feliz";
                bandera = false;
            }else{
                if(sumaCuadrados == original){
                    res = "NO es un numero Feliz";
                    bandera = false;
                }else{
                    if(sumaCuadrados<10 && sumaCuadrados!=7){
                        res = "NO es un numero Feliz";
                        bandera = false;
                    }else{
                        numero = sumaCuadrados;
                    }
                }
            }      
        }
        return res;
    }
    private int sumarCuadrados(int num){
        int res = 0;
        while(num>0){
            int dig = num%10;
            res = res+(dig*dig);
            num = num/10;
        }
        return res;
    }
}
