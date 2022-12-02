package vetores;
import java.util.Scanner;
public class Raiz {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int i;
		double a[],b[];
		a = new double[TAM];
		b = new double[TAM];
		
		for(i=0;i<3;i++){
			System.out.println("digite o "+(i+1)+" valor do vetor A");
				a[i]=in.nextInt();
		}
		System.out.print(" A=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+"- ");
		}
		System.out.print("]");
		
		//fim da apresentação do a
		
		for(i=0;i<TAM;i++) {
			b[i] = Math.sqrt(a[i]);
			
		}
		System.out.print(" B=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+"- ");
		}
		System.out.print("]");
		
		
	}


}
