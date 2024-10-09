import java.util.Scanner;

public class Practices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Q1
//		System.out.print("Q1 - 원화를 입력하세요 : ");
//		int case1 = sc.nextInt();
//		System.out.println("입력된 원화는 " + case1 / 1100 + " 달러입니다.");

		// Q2
//		System.out.print("Q2 - 2자리수 정수를 입력하세요 : ");
//		int case2 = sc.nextInt();
//		if (case2 < 10 || case2 > 99) {
//			System.out.println("2자리수 정수가 아닙니다.");
//		} else if (case2 / 10 == case2 % 10) {
//			System.out.println("10의 자리와 1의 자리의 수가 같습니다.");
//		} else {
//			System.out.println("10의 자리와 1의 자리의 수가 다릅니다.");
//		}
		
		//Q3
		System.out.print("Q3 - 원화를 입력하세요 : ");
		int case3 = sc.nextInt();
		
		int coin_500 = case3 / 500;
		int coin_100 = case3 % 500 / 100;
		int coin_50 = case3 % 100 / 50;
		int coin_10 = case3 % 50 / 10;
		int coin_1 = case3 % 10;
		
		System.out.println("500원 동전 :" + coin_500 + "개");
		System.out.println("100원 동전 :" + coin_100 + "개");
		System.out.println("50원 동전 :" + coin_50 + "개");
		System.out.println("10원 동전 :" + coin_10 + "개");
		System.out.println("1원 동전 :" + coin_1 + "개");
		
		//Q4
		System.out.print("Q4 - 정수 3개를 입력하세요");
	}
}