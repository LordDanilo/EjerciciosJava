public class NumeroCurioso{
    public String verificar(int numero){
        int cuadrado = numero*numero;
        String res = "";
        boolean bandera = true;
        while(numero>0){
            int digNumero = numero%10;
            int digCuadrado = cuadrado%10;
            if(digNumero != digCuadrado){
                bandera = false;
            }
            numero = numero/10;
            cuadrado = cuadrado/10;
        }
        if(bandera==true){
            res = "SI es un numero Curioso";
        }else{
            res = "NO es un numero Curioso";
        }
        return res;
    }
}
