package vetores;
import java.util.Scanner;

public class VetorPar {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM = 5;
		int i,a[],b[],s=0,c[];
		a = new int[TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+" elemento do vetor:");
			a[i]= in.nextInt();
			if(a[i]%2==0){
				s = s+1;
				b[i]=a[i];
			}else {
			    c[i]=a[i];
			}
		}	
		System.out.println("No vetor tem "+s+" numeros pares e eles sao: ");
		System.out.print("[");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+",s");
		}
		System.out.print("]");
		

		


	}
}
