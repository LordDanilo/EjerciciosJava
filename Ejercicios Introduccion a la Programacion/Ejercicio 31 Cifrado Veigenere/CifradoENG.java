public class CifradoENG{
    public String cifrarTexto(String texto){
        String res = "";
        String clave = generarCadenaMay(texto.length());
        for(int pos=0; pos<texto.length(); pos++){
            char letraTexto = texto.charAt(pos);
            char letraClave = clave.charAt(pos);
            if(esMinuscula(letraTexto)){
                letraClave = clave.toLowerCase().charAt(pos);
                int valor  = (((letraTexto-'a')+(letraClave-'a'))%26)+'a';
                char letra = (char) valor;
                res = res+letra;
            }else{
                if(esMayuscula(letraTexto)){
                    int valor  = (((letraTexto-'A')+(letraClave-'A'))%26)+'A';
                    char letra = (char) valor;
                    res = res+letra;
                }else{
                    res = res+letraTexto;
                }
            }
        }
        return res;
    }
    private boolean esMinuscula(char simbolo){
        return simbolo>='a' && simbolo<='z';
    }
    private boolean esMayuscula(char simbolo){
        return simbolo>='A' && simbolo<='Z';
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
