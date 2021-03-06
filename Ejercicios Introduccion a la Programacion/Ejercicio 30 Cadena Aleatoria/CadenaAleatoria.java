public class CadenaAleatoria{
    public String generarCadena(int longitud){
        String res = "";
        for(int cont=1; cont<=longitud; cont++){
            int num = (int) ((Math.random()*(('z'-'a')+1))+'a');
            char letra = (char)num;
            res = res+letra;
        }
        return res;
    }
    public String generarCadenaMay(int longitud){
        String res = "";
        for(int cont=1; cont<=longitud; cont++){
            int num = (int) ((Math.random()*(('Z'-'A')+1))+'A');
            char letra = (char)num;
            res = res+letra;
        }
        return res;
    }
}
