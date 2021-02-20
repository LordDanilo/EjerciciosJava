public class Conversor{
    public int convertirDecimalABinario(int numero){
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
