public class NumeroNarcisista{
    public String verificador(int numero){
        int cantDig = contarDig(numero);
        int copiaOriginal = numero;
        int suma = 0;
        String res = "";
        while(numero>0){
            int digito = numero%10;
            int valor = (int)Math.pow(digito,cantDig);
            suma = suma+valor;
            numero = numero/10;
        }
        if(suma == copiaOriginal){
            res = "El numero Si es Narcisista";
        }else{
            res = "El numero No es Narcisista";
        }
        return res;
    }
    
    
    private int contarDig(int num){
        int res = 0;
        while(num>0){
            res++;
            num = num/10;
        }
        return res;
    }
}
