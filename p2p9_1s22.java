import java.util.Scanner;

public class p2p9_1s22{
	public static void main(String[] args) {
		Scanner teclado = new scanner(System.in);
		int [] [] Ma, Mb, Mc;
		int f,c,i;
		System.out.println("Ingresa el tamaño de la matriz cuadrada");
		f = teclado.nextInt();
		if (f>0){
			c=f;
			Ma = Int[f][c];
			Mb = new Int[f][c];
			Mc = new int [f][c];
			for (i=0;i<f;i++){
			for (j=0;j<c;i++){
				System.out.println("ingresa el valor de la matriz A["+f+"]["+c+"]:");
					Ma[i][j]=tecladp.nextInt();

				}
			}
		for (i=0;i<f ; i++){
			for(j=0;j<c;j++){
				System.out.println("ingresa el valor para la matriz B["+f+"]["+c+"]:")
				Mb[i][j]=teclado.nextInt();
			}
		}
		for (i=0;i<f;i++){
			for (j=0;j<c;j++){
				System.out.println("Ingresa el valor de la matriz C["+i+"]["+j+"]:");
				Mc [i][j]=Ma[i][j];
			}
		}
		for [i=0;i<f;i++]{
		for [j=0;j<cj++]{
			System.out.println("El resultao de la matriz C ["+i"]["+j+"]: "+Mc[i][j]);
			
		}else
			System.out.println("No se puede procesar una matriz en 0 o en negativo");
		}
