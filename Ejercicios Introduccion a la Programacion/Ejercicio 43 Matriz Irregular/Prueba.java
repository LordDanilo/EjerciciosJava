public class Prueba{
    public int[][] generarMatriz(){
        int fila = 4;
        int[][] mat = new int[4][];
        
        int[] arr;
        arr = new int[]{1,2,3};
        
        mat[0] = new int[]{1,2,3,4};
        mat[1] = new int[]{5,6};
        mat[2] = new int[]{7,8,9,10,11,12};
        mat[3] = new int[]{13};
        return mat;
    }
    public int[][] generarMatriz2(){
        int fila = 4;
        int[][] mat = new int[4][];
        
        mat[0] = new int[4];
        mat[1] = new int[6];
        mat[2] = new int[2];
        mat[3] = new int[1];
        
        return mat;
    }
    public int[][] generarMatriz3(){
        int[][] mat = {{1,2,3,4,5},
                       {6,7},
                       {8,9,10}};
        
        return mat;
    }
    public void recorrerMatriz(int[][] mat){
        for(int fila=0; fila<mat.length; fila++){
            for(int col=0; col<mat[fila].length; col++){
                System.out.print(mat[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
