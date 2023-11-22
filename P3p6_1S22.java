import java.util.Scanner;

public class P3p6_1S22{

	public static int promedio(int[] a){
		int sum=0;
		for (int num : a)
			sum+=num;
		    sum=sum/(a.length);
		    return sum;
	}

	public static int[] captura(){
    	int[] numeros = new int[10];
    	Scanner teclado = new Scanner(System.in);
    	for (int a=0;a<10;a++) {
    		System.out.println("valores que tienen la posicion ["+(x+1)+"]: ");
    		numeros[a]=teclado.nextInt();
    	}
    	return numeros;
    }
    public static void main(String[] args) {
        int[] arreglo = captura();
        	System.out.println("el promedio de los numeros es " +promedio(arreglo));
        }
    }