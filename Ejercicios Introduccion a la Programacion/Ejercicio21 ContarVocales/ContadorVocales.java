public class ContadorVocales{
    public int contadorVocales(String cadena){
        int res = 0;
        for(int i=0; i<cadena.length(); i++){
            char caracterActual = cadena.charAt(i);
            if(esVocal(caracterActual)){
                res++;
            }
        }
        return res;
    }
    private boolean esVocal(char letra){
        return letra=='A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u';                                                           
    }
}
