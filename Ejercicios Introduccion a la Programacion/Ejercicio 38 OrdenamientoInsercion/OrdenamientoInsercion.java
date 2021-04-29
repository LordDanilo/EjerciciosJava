public class OrdenamientoInsercion{
    public int[] ordenar(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=1+i; j>0 && arr[j]<arr[j-1]; j--){
                int aux = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = aux;
            }
        }
        return arr;
    }
}
