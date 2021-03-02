public class Ejercicio26{
    public int contarPalabras(String texto){
        int res = 0;
        texto = texto+" ";
        String aux = "";
        for(int pos=0; pos<texto.length(); pos++){
            char actual = texto.charAt(pos);
            if(actual == ' '){
                if(esPalabra(aux)){
                    res++;
                }
                aux = "";
            }else{
                aux = aux+actual;
            }
            
        }
        return res;
    }
    private boolean esPalabra(String cad){
        boolean res = true;
        if(cad.equals("-")){
            res = false;
        }
        return res;
    }
}
