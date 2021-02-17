public class Ejercicio13{
    public String intercambiar(int numA, int numB){
        String res = "El valor original de numA es: "+numA;
        res = res+"\n"+"El valor original de numB es:"+numB;
        
        numA = numA+numB;
        numB = numA-numB;
        numA = numA-numB;
        
        res = res+"\n"+"El valor actual de numA es:"+numA;
        res = res+"\n"+"El valor actual de numB es:"+numB;
        return res;
    }
}
