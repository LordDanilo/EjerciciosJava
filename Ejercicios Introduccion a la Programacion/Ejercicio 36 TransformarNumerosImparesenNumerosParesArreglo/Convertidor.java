public class Convertidor{
    
    public int[] transformador(int[] arr){
        for(int i=0; i<arr.length; i++){
            int ac = arr[i];
            if(ac%2 != 0){ 
                ac++;
                arr[i] = ac;
            }
        }
        return arr;
    }
}
