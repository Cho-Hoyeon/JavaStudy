import java.util.Scanner;

class bj_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 1;
		int B = 1;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		//3
		System.out.println(A*(B%10));
		//4
		System.out.println(A*((B%100)/10));
		//5
		System.out.println(A*(B/100));
		//6
		System.out.println(A*B);
		sc.close();

	}

}
