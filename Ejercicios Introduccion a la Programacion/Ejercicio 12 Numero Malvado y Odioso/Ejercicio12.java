public class Ejercicio12{
    public String verificar(int numero){
        String res = "";
        int numBinario = convertirDecimalABinario(numero);
        int contador = 0;
        while(numBinario>0){
            int dig = numBinario%10;
            if(dig==1){
                contador++;
            }
            numBinario = numBinario/10;
        }
        if(contador%2 == 0){
            res = "Es un Numero Malvado";
        }else{
            res = "Es un Numero Odioso";
        }
        return res;
    }
    private int convertirDecimalABinario(int numero){
        int binario = 0;
        int base = 10;
        int exp = 0;
        while(numero>0){
            int digBin = numero%2;
            binario = (digBin*(int)Math.pow(base,exp))+binario;
            exp++;
            numero = numero/2;
        }
        return binario;
    }
}
