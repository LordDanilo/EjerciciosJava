public class Main {

  public static int convertir(int[]arreglo){
	  int res = 0;
	  for(int i=0; i<arreglo.length; i++){
	      int numActual = arreglo[i];
	      res = (res*10)+numActual;
	  }
	  return res;
  }
  
  public static void main(String [] args){
    //5
    System.out.println("Salida de la funcion convertir: " + convertir(new int[]{2,0,4,9}));
  }
}