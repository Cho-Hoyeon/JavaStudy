package bj_20240818;
import java.util.Scanner;

class bj_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 1;
		int X = 1;
		
		N = sc.nextInt();
		int[] ArrA = new int [N];
		X = sc.nextInt();
		for(int i=0;i<N;i++) {
			ArrA[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			if(ArrA[i]<X) {
				System.out.print(ArrA[i]+" ");
			}
		}

		sc.close();

	}

}
