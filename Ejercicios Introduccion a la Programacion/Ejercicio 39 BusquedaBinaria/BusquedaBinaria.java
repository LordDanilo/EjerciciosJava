public class BusquedaBinaria{
    public int buscarPosElemento(int[] arr, int buscado){
        int res = -1;
        int li = 0;
        int ls = arr.length-1;
        int medio; 
        while(res==-1 && li<=ls){
            medio = (li+ls)/2;
            if(arr[medio] == buscado){
                res = medio;
            }else{
                if(arr[medio] < buscado){
                    li = medio+1;
                }else{
                    ls = medio-1;
                }
            }
        }
        return res;
    }
    public boolean buscarElemento2(int[] arr, int buscado){
        boolean res = false;
        int li = 0;
        int ls = arr.length-1;
        int medio; 
        while(res==false && li<=ls ){
            medio = (li+ls)/2;
            if(arr[medio] == buscado){
                res = true;
            }else{
                if(arr[medio] < buscado){
                    li = medio+1;
                }else{
                    ls = medio-1;
                }
            }
        }
        return res;
    }
}
