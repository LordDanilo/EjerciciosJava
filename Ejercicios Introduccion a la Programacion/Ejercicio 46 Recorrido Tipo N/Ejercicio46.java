import java.util.Arrays;
public class Ejercicio46{
    public String recorrerMatriz(int[][] mat){
        String res = "";
        
        for(int fila=mat.length-1; fila>=0; fila--){
            int elemento = mat[fila][0];
            res = res+elemento+" ";
        }
        
        for(int i=1; i<mat.length; i++){
            int elemento = mat[i][i];
            res = res+elemento+" ";
        }
        
        for(int fila=mat.length-2; fila>=0; fila--){
            int elemento = mat[fila][mat.length-1];
            res = res+elemento+" ";
        }
        
        int col = mat.length-2;
        for(int fila = 1; fila<mat.length-1; fila++, col--){
            int elemento = mat[fila][col];
            res = res+elemento+" ";
        }
        
        return res;
    }
    public int[][] generarMatriz(int tam){
        int[][] mat = new int[tam][tam];
        int valor = 1;
        
        for(int fila=mat.length-1; fila>=0; fila--){
            mat[fila][0] = valor;
            valor++;
        }
        
        for(int i=1; i<mat.length; i++){
            mat[i][i] = valor;
            valor++;
        }
        
        for(int fila=mat.length-2; fila>=0; fila--){
            mat[fila][mat.length-1] = valor;
            valor++;
        }
        
        int col = mat.length-2;
        for(int fila = 1; fila<mat.length-1; fila++, col--){
            mat[fila][col] = valor;
            valor++;
        }
        
         //Ver la representacion de la matriz
        for(int fila=0; fila<mat.length; fila++){
            System.out.println(Arrays.toString(mat[fila]));
        }
        return mat;
    }
}
