public class CifradorESP{
    final String ALPHMAY = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    final String ALPHMIN = "abcdefghijklmnñopqrstuvwxyz";
    public String cifrarTexto(String texto){
        String res = "";
        String clave = generarCadenaMay(texto.length());
        for(int pos=0; pos<texto.length(); pos++){
            char letraTexto = texto.charAt(pos);
            char letraClave = clave.charAt(pos);
            if(esMinuscula(letraTexto)){
                int posLetraTexto = ALPHMIN.indexOf(letraTexto+"");
                letraClave = clave.toLowerCase().charAt(pos);
                int posLetraClave = ALPHMIN.indexOf(letraClave+"");
                int nuevaPos      = (posLetraTexto+posLetraClave)%27;
                char letra        = ALPHMIN.charAt(nuevaPos);
                res = res+letra;
            }else{
                if(esMayuscula(letraTexto)){
                    int posLetraTexto = ALPHMAY.indexOf(letraTexto+"");
                    int posLetraClave = ALPHMAY.indexOf(letraClave+"");
                    int nuevaPos      = (posLetraTexto+posLetraClave)%27;
                    char letra        = ALPHMAY.charAt(nuevaPos);
                    res = res+letra;
                }else{
                    res = res+letraTexto;
                }
            }
        }
        return res;
    }

    private boolean esMayuscula(char letra){
        return letra>='A' && letra<='Z' || letra == 'Ñ';
    }

    private boolean esMinuscula(char letra){
        return letra>='a' && letra<='z' || letra == 'ñ';
    }

    private String generarCadenaMay(int longitud){
        String res = "";
        for(int cont=1; cont<=longitud; cont++){
            int num = (int) ((Math.random()*(('Z'-'A')+1))+'A');
            char letra = (char)num;
            res = res+letra;
        }
        return res;
    }
}
