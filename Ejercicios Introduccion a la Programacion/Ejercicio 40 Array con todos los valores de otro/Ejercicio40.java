public class Ejercicio40{
    public String verificar(int[] arr1, int[] arr2){
        String res = "";
        boolean bandera = true;
        for(int pos=0; pos<arr1.length && bandera==true; pos++){
            int dato = arr1[pos];
            if(existe(dato, arr2) == false){
                bandera = false;
            }
        }
        if(bandera==true){
            res = "El Arreglo B SI, contiene todos los valores del arreglo A";
        }else{
            res = "El Arreglo B NO, contiene todos los valores del arreglo A";
        }
        return res;
    }
    private boolean existe(int dato, int[] arr2){
        boolean res = false;
        for(int pos=0; pos<arr2.length; pos++){
            int datoActual = arr2[pos];
            if(datoActual == dato){
                res = true;
            }
        }
        return res;
    }
}
