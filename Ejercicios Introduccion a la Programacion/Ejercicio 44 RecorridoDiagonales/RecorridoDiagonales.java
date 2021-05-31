/**
 * Danilo Ernesto Jimenez Guzman
 * v 1.1
 */
public class RecorridoDiagonales{
    private int[][] matriz;
    private int n, m;   
    public RecorridoDiagonales(int n, int m){
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

    public String zigzagDigonales(){
        String res = "";
        int fila = 0;
        int col = 0;
        boolean turno = true;
        while(fila<n && fila>=0 && col<m && col>=0){
            if(turno==true){ //diag arriba-abajo
                int i;
                for(i = fila; i<n && col>=0; i++, col--){
                    res = res+matriz[i][col]+" ";
                }
                if(i==n){
                    fila = i-1;
                    col = col+2;
                }else{
                    fila = i;
                    col = col+1;
                }
            }else{
                int i;
                for(i = fila; i>=0 && col<m; i--, col++){
                    res = res+matriz[i][col]+" ";
                }
                if(col==m){
                    col--;
                    fila = i+2;
                }else{
                    fila = i+1;
                }
            }
            turno = !turno;
        }
        return res;
    }

    public void llenarzigzagDigonales(){
        String res = "";
        int fila = 0;
        int col = 0;
        boolean turno = true;
        int val = 1;
        while(fila<n && fila>=0 && col<m && col>=0){
            if(turno==true){ //diag arriba-abajo
                int i;
                for(i = fila; i<n && col>=0; i++, col--){
                    matriz[i][col] = val++;
                }
                if(i==n){
                    fila = i-1;
                    col = col+2;
                }else{
                    fila = i;
                    col = col+1;
                }
            }else{
                int i;
                for(i = fila; i>=0 && col<m; i--, col++){
                    matriz[i][col] = val++;
                }
                if(col==m){
                    col--;
                    fila = i+2;
                }else{
                    fila = i+1;
                }
            }
            turno = !turno;
        }
        mostrar();
    }
}

