public class Palindromo{
    public boolean verificadorPalindromo(String palabra){
        String palabraN = palabra.toLowerCase();
        String invertido = invertirPalabra(palabraN);
        return palabraN.equals(invertido);
    }
    public boolean verificadorPalindromo2(String palabra){
        boolean res = true;
        String palabraN = palabra.toLowerCase();
        int fin = palabraN.length()-1;
        for(int inicio=0; inicio<=fin && res==true; inicio++,fin--){
            char ini = palabraN.charAt(inicio);
            char end = palabraN.charAt(fin);
            if(ini != end){
                res = false;
            }
        }
        return res;
    }
    private String invertirPalabra(String cad){
        String res = "";
        for(int pos=cad.length()-1; pos>=0; pos--){
            char actual = cad.charAt(pos);
            res = res+actual;
        }
        return res;
    }
}
