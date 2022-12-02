package vetores;
import java.util.Scanner;
public class Inverso {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		final int TAM = 10;
			int i,v,a[],b[];
			a = new int[TAM];
			b = new int[TAM];
			v=9;
			
			for(i=0;i<TAM;i++) {
				System.out.println("Digite o "+(i+1)+" elemento do vetor");
				a[i] = in.nextInt();
				b[v]=a[i];
				v--;
			}
			System.out.print("A=[ ");
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print("] ");
			
			System.out.print(" B=[ ");
			for(i=0;i<TAM;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.print("]");
	}

}
