public class Ejercicio27{
    public int contarOcurrencias(String cadena, String subCadena){
        int res = 0;
        String aux = "";
        int longSubCad = subCadena.length();
        for(int pos=0; pos<=cadena.length()-longSubCad; pos++){
            for(int i=pos; i<pos+longSubCad; i++){
                aux = aux+cadena.charAt(i);
            }
            if(subCadena.equals(aux)){
                res++;
            }
            aux = "";
        }
        return res;
    }
    public int contarOcurrencias2(String cadena, String subCadena){
        int res = 0;
        String aux = "";
        int longSubCad = subCadena.length();
        for(int pos=0; pos<=cadena.length()-longSubCad; pos++){
            aux = cadena.substring(pos,pos+longSubCad);
            if(subCadena.equals(aux)){
                res++;
            }
            aux = "";
        }
        return res;
    }
}
