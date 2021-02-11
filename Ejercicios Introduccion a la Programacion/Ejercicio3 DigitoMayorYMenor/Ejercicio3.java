public class Ejercicio3{
    public String mayorMenor(int numero){
        String res = "";
        int contMay = 1;
        int contMen = 1;
        int mayor; 
        int menor;
        //879
        if(numero>0){
            mayor = numero%10;
            menor = numero%10;
            numero = numero/10;
            while(numero>0){
                int dig = numero%10;
                if(dig > mayor){
                    mayor = dig;
                    contMay = 1;
                }else{
                    if(dig < menor){
                        menor = dig;
                        contMen = 1;
                    }else{
                        if(dig == mayor){
                            contMay++;
                        }else{
                            if(dig == menor){
                                contMen++;
                            }
                        }
                    }
                }
                numero = numero/10;
            }
            res = "El Mayor es "+mayor+" y se repite "+contMay+" veces"+"\n";
            res = res+"El Menor es "+menor+" y se repite "+contMen+"veces";
        }else{
            res = "Dato de entrada no valido";
        }
        return res;
    }
}
