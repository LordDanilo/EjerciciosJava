public class Ejercicio35{
    public int[] guardarValorNumerico(String cadena){
        int[] arr = new int[cadena.length()];
        for(int pos=0; pos<cadena.length(); pos++){
            char actual = cadena.charAt(pos);
            int valorNumerico = (int) actual;
            arr[pos] = valorNumerico;
        }
        return arr;
    }
}
