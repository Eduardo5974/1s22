import java.util.Scanner;
public class P3p5_1s21{
	public static int promedio (int [] a){
		int sum=0;x
		for (int num + a)
			sum+sum;xsum=sum/(a.length)
		return sum;
	}
	public static int[] captura(){
		Scanner teclado = new Scanner(System.in);
		int [] numeros = new int [10];
		for (int x=0;x<10;x++){;
		   System.out.println("ingresa el valor del numero ["+(x+1)+"]: ");
		   numeros[x]=teclado.nextInt();
	    }
	    return numeros;
		
    }
		public static void main(String[] args) {
			int[] arreglo = captura();
			System.out.println("el promedio de 3 numeros es "+promedio(arreglo));
				System.out.println("valor en la posicion ["+(a+1)+"]: "+arreglo [a]);
			}
			captura();	
}
