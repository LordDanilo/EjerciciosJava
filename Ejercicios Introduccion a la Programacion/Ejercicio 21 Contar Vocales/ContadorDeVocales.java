public class ContadorDeVocales{
    public int contarVocalesVer1(String cad){
        int res = 0;
        String cadenaNormal = normalizarCadena(cad);
        for(int pos=0; pos<cad.length(); pos++){
            char actual = cadenaNormal.charAt(pos);
            if(esVocal(actual)){
                res++;
            }
        }
        return res;
    }
    private boolean esVocal(char letra){
        return letra=='a' || letra == 'e' || letra=='i' || letra =='o' || letra =='u';
    }
    private String normalizarCadena(String cadena){
        String res = "";
        for(int pos=0; pos<cadena.length(); pos++){
            char actual = cadena.charAt(pos);
            if(actual == 'Á' || actual == 'A' || actual=='á'){
                actual = 'a';
            }else{
                if(actual == 'É'|| actual == 'E' || actual=='é'){
                    actual = 'e';
                }else{
                    if(actual == 'Í' || actual == 'I' || actual=='í'){
                        actual = 'i';
                    }else{
                        if(actual == 'Ó'|| actual == 'O' || actual=='ó'){
                            actual = 'o';
                        }else{
                            if(actual == 'Ú' || actual == 'U' || actual=='ú'){
                                actual = 'u';
                            }
                        }
                    }
                }
            }
            res = res+actual;
        }
        return res;
    }
}
