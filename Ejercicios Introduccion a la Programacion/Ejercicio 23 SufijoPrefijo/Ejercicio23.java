public class Ejercicio23{
    public String verificador2(String palabra, String subCadena){
        String res = "";
        palabra = palabra.toLowerCase();
        if(palabra.startsWith(subCadena)){
            res = "La subcadena es Prefijo de la palabra ";
        }
        if(palabra.endsWith(subCadena)){
            res = res+"La subcadena es Sufijo de la palabra";
        }
        if(res.length()==0){
            res = "La subcadena no es ni prefijo ni sufijo de la palabra";
        }
        return res;
    }
    public String verificador(String palabra, String subCadena){
        String res = "";
        palabra = palabra.toLowerCase();
        if(esPrefijo(palabra, subCadena)){
            res = "La subcadena es Prefijo de la palabra ";
        }
        if(esSufijo(palabra, subCadena)){
            res = res+"La subcadena es Sufijo de la palabra";
        }
        if(res.length()==0){
            res = "La subcadena no es ni prefijo ni sufijo de la palabra";
        }
        return res;
    }
    private boolean esPrefijo(String palabra, String subCadena){
        boolean res = true;
        for(int pos=0; pos<subCadena.length() && res==true; pos++){
            char actualPalabra   = palabra.charAt(pos);
            char actualSubCadena = subCadena.charAt(pos);
            if(actualPalabra != actualSubCadena){
                res = false;
            }
        }
        return res;
    }
    private boolean esSufijo(String palabra, String subCadena){
        boolean res = true;
        int last = palabra.length()-1;
        for(int pos=subCadena.length()-1; pos>=0 && res==true; pos--, last--){
            char actualPalabra   = palabra.charAt(last);
            char actualSubCadena = subCadena.charAt(pos);
            if(actualPalabra != actualSubCadena){
                res = false;
            }
        }
        return res;
    }
}
