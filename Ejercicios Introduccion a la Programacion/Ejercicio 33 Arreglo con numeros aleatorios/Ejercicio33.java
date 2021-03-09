public class Ejercicio33{
    public int[] llenarArreglo(int tam){
        int[] arr = new int[tam];
        for(int pos=0; pos<arr.length; pos++){
            int numero = (int)((Math.random()*100)+1);
            arr[pos] = numero; 
        }
        return arr;
    }
    public int[] llenarArreglo2(int tam){
        int[] arr = new int[tam];
        for(int pos=arr.length-1; pos>=0; pos--){
            int numero = (int)((Math.random()*100)+1);
            arr[pos] = numero; 
        }
        return arr;
    }
}
