public class PalabraInvertida{
    public String invertirPalabra1(String cad){
        String res = "";
        for(int pos=cad.length()-1; pos>=0; pos--){
            char actual = cad.charAt(pos);
            res = res+actual;
        }
        return res;
    }
    public String invertirPalabra2(String cad){
        String res = "";
        for(int pos=0; pos<cad.length(); pos++){
            char actual = cad.charAt(pos);
            res = actual+res;
        }
        return res;
    }
    public String invertirPalabra3(String cad){
        StringBuilder palabra = new StringBuilder(cad);
        palabra = palabra.reverse();
        return palabra.toString();
    }
}
