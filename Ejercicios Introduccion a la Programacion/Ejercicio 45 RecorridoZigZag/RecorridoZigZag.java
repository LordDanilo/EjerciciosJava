/**
 * Danilo Ernesto Jimenez Guzman
 * v 1.1
 */
public class RecorridoZigZag{
    private int[][] matriz;
    private int n, m;   
    public RecorridoZigZag(int n, int m){
        matriz = new int[n][m];
        this.n = n;
        this.m = m;
        llenar();
    }

    private void llenar(){
        int dato;
        dato = 1;
        for(int f = 0; f < n; f++){
            for(int c = 0; c < m; c++){
                matriz[f][c] = dato;
                dato++;
            }
        }
    }

    public void mostrar(){
        int dato;
        dato = 1;
        for(int f = 0; f < n; f++){
            for(int c = 0; c < m; c++){
                System.out.print(matriz[f][c]+"\t");
            }
            System.out.println();
        }
    }

    public String diagonal(){
        String res = "";
        int fila = n-1;
        int col = 0;
        int aux = 1;
        while(col<m){
            for(int i=fila; i<n && col<m; i++, col++){
                res = res+matriz[i][col]+" ";
            }
            fila--;
            if(fila<0){
                fila = 0;
                col = aux;
                aux++;
            }else{
                col = 0;
            }
        }
        return res;
    }

    public void llenardiagonal(){
        int fila = n-1;
        int col = 0;
        int aux = 1;
        int val = 1;
        while(col<m){
            for(int i=fila; i<n && col<m; i++, col++){
                matriz[i][col]=val++;
            }
            fila--;
            if(fila<0){
                fila = 0;
                col = aux;
                aux++;
            }else{
                col = 0;
            }
        }
        mostrar();
    }
}