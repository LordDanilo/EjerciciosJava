public class CifradorCesarESP{
    final String ALPHMAY = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    final String ALPHMIN = "abcdefghijklmnñopqrstuvwxyz";
    public String cifrar(String mensaje, int desp){
        String res = "";
        desp = desp%27;
        for(int pos=0; pos<mensaje.length(); pos++){
            char actual = mensaje.charAt(pos);

            if(esMayuscula(actual)){
                int posActual = ALPHMAY.indexOf(actual+"");
                posActual = posActual+desp;    
                if(posActual > 26){
                    posActual = posActual - 27;
                }
                actual = ALPHMAY.charAt(posActual);
            }else{
                if(esMinuscula(actual)){
                    int posActual = ALPHMIN.indexOf(actual+"");
                    posActual = posActual+desp;    
                    if(posActual > 26){
                        posActual = posActual - 27;
                    }
                    actual = ALPHMIN.charAt(posActual);
                }
            }
            res = res+actual;
        }
        return res;
    }

    private boolean esMayuscula(char letra){
        return letra>='A' && letra<='Z' || letra == 'Ñ';
    }

    private boolean esMinuscula(char letra){
        return letra>='a' && letra<='z' || letra == 'ñ';
    }
}
