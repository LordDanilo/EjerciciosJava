import java.util.Arrays;
public class RejolDeArena{
    public int[][] llenarDatos(int n){
        int[][] mat = new int[n][n];
        double mitad = (double) n/2;
        int x = 0;
        int dato = 1;
        for(int fila=0; fila<n; fila++){
            for(int col = x; col<n-x; col++){
                mat[fila][col] = dato;
                //dato++;
            }
            if(fila+1 < mitad){
                x++;
            }else{
                if(fila+1 > mitad){
                    x--;
                }
            }
        }
        //ver la matriz
        for(int fila=0; fila<mat.length; fila++){
            System.out.println(Arrays.toString(mat[fila]));
        }
        return mat;
    }
}
