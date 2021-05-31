import java.util.Arrays;
public class Caracol{
    public int[][] realizarRecorrido(int n, int m){
        int[][] mat = new int[n][m];
        int etiqueta = 1;
        int filaInicio = 0;
        int filaFinal = n-1;
        int colInicio = 0;
        int colFinal = m-1;

        while(filaInicio <= filaFinal && colInicio <= colFinal){
            //izquierda-derecha
            for(int col = colInicio; col<=colFinal; col++){
                mat[filaInicio][col] = etiqueta++;
            }
            //arriba-abajo
            for(int fila = filaInicio+1; fila <= filaFinal; fila++){
                mat[fila][colFinal] = etiqueta++;
            }
            //derecha-izquierda
            for(int col = colFinal-1; col >= colInicio; col--){
                mat[filaFinal][col] = etiqueta++;
            }
            //abajo-arriba
            for(int fila = filaFinal-1; fila >= filaInicio+1; fila--){
                mat[fila][colInicio] = etiqueta++;
            }

            filaInicio++;
            filaFinal--;
            colInicio++;
            colFinal--;
        }
        //ver la matriz
        for(int fila=0; fila<mat.length; fila++){
            System.out.println(Arrays.toString(mat[fila]));
        }
        return mat;
    }
}
