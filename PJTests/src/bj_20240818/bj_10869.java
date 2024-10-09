package bj_20240818;
import java.util.Scanner;

class bj_10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 1;
		int B = 1;
		
		A = sc.nextInt();
		B = sc.nextInt();
		// Scanner 씹힘 대응책?
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		sc.close();

	}

}
