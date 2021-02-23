public class Ejercicio16{
    public int multiplicar(int primerTermino, int segundoTermino){
        int res = 0;
        for(int i=1; i<=segundoTermino; i++){
            res = res+primerTermino;
        }
        return res;
    }
    public int multiplicar2(int primerTermino, int segundoTermino){
        int res = 0;
        while(segundoTermino>0){
            res = res+primerTermino;
            segundoTermino--;
        }
        return res;
    }
}
