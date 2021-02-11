public class ContarDigitos{
    
    public int contarDigs2(int num){
        int res = (int)(Math.log10(num)+1);
        return res;
    }
    
    public int contarDigs(int num){
        int res = 0;  
        while(num>0){
            res = res+1; //res++;
            num = num/10;
        }
        return res;
    }
}
