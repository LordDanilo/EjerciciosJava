public class Ejercicio28{
    char c;
    public boolean verificador(String cadena){
        boolean res;
        char letra = cadena.charAt(0);    
        cadena = cadena.replace(letra+"", "");
        if(cadena.length() == 0){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    public boolean verificador2(String cadena){
        boolean res;
        char letra = cadena.charAt(0);  
        int cont = 0;
        
        for(int i=0; i<cadena.length(); i++){
            char actual = cadena.charAt(i);
            if(actual == letra){
                cont++;
            }
        }
        if(cont == cadena.length()){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
}
