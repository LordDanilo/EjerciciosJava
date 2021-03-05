public class CifradorCesarENG{
    public String cifrar(String mensaje, int desp){
        String res = "";
        desp = desp%26;
        for(int pos=0; pos<mensaje.length(); pos++){
            char actual = mensaje.charAt(pos);
            if(esMayuscula(actual)){
                actual = (char)(actual+desp);
                if(actual > 'Z'){
                    actual = (char)(actual-26);
                }
            }else{
                if(esMinuscula(actual)){
                    actual = (char)(actual+desp);
                    if(actual > 'z'){
                        actual = (char)(actual-26);
                    }
                }
            }
            res = res+actual;
        }
        return res;
    }

    private boolean esMayuscula(char letra){
        return letra>='A' && letra<='Z';
    }

    private boolean esMinuscula(char letra){
        return letra>='a' && letra<='z';
    }
}
