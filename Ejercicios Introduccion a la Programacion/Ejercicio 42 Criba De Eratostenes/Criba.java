public class Criba{
    public String encontrarNumerosPrimos(int n){
        String res="";
        boolean[] criba = new boolean[n+1];
        int limite = (int)Math.sqrt(n); 
        criba[0] = true;
        criba[1] = true;
        for(int i=2; i<=limite; i++){
            int numActual = i;
            if(criba[i] == false){
                int multi = 2;
                while(numActual*multi < criba.length){
                    int pos = numActual*multi;
                    criba[pos] = true;
                    multi++;
                }
            }
        }
        res = generarRespuesta(criba);
        return res;
    }
    private String generarRespuesta(boolean[] criba){
        String res = "Los Numeros primos en este rango son: ";
        for(int i=0; i<criba.length; i++){
            if(criba[i] == false){
                res = res+i+" ";
            }
        }
        return res;
    }
}
