package vetores;
import java.util.Scanner;
public class MaiMenVetor {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			final int TAM = 5;
			int i,a[],b[],maior,menor;
			a = new int [TAM];
			b = new int [TAM];
			maior = 0;
			menor = 200;
			
			for(i=0;i<TAM;i++) {
				System.out.println("Digite o "+(i+1)+" valor do vetor:");
				a[i] = in.nextInt();
				
				if ( maior <= a[i] ){
					maior = a[i] ;
				}if ( menor >= a[i] ) {
					menor = a[i] ;
				}
			}
			
			System.out.println(" O maior valor e:"+maior);
			System.out.println("O menor valor e:"+menor);
			
			System.out.print(" A=[ ");
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print("]");

	}

}
