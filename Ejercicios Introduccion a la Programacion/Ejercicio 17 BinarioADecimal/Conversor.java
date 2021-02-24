public class Conversor{
    public int convertir(int binario){
        int numero = 0;
        int base = 2;
        int exp = 0;
        while(binario>0){
            int dig = binario%10;
            numero = numero + (dig*(int)Math.pow(base,exp));
            exp++;
            binario = binario/10;
        }
        return numero;
    }
}
