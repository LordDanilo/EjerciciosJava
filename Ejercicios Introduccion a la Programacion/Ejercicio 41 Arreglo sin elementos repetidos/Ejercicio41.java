public class Ejercicio41{
    public int[] evaluarArray(int[] arr){
        int tam = obtenerTam(arr);
        int[] res = new int[tam];
        int puntero = 0;
        for(int pos=0; pos<arr.length; pos++){
            int actual = arr[pos];
            boolean bb = true;
            for(int j=pos+1; j<arr.length && bb==true; j++){
                int aux = arr[j];
                if(actual==aux){
                    bb = false;
                }
            }
            if(bb == true){
                res[puntero] = actual;
                puntero++;
            }
        }
        return res;
    }
    private int obtenerTam(int[] arr){
        int res=0;
        for(int pos=0; pos<arr.length; pos++){
            int actual = arr[pos];
            boolean bb = true;
            for(int j=pos+1; j<arr.length && bb==true; j++){
                int aux = arr[j];
                if(actual==aux){
                    bb = false;
                }
            }
            if(bb == true){
                res++;
            }
        }
        return res;
    }
}
