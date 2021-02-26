public class Ejercicio23{
    public int contadorCaracter(String cadena, char caracter){
        int cantidad = 0;
        for(int pos=0; pos<cadena.length(); pos++){
            char actual = cadena.charAt(pos);
            if(actual == caracter){
                cantidad++;
            }
        }
        return cantidad;
    }
}
