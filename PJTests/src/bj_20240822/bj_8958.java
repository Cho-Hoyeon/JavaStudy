package bj_20240822;

import java.util.Scanner;

class bj_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case_num = 0;
		String test_string = "";
		case_num = sc.nextInt();

		for (int i = 0; i < case_num; i++) {
			test_string = sc.next();

			int score_temp = 0;
			int score_sum = 0;

			for (int j = 0; j < test_string.length(); j++) {
				if (test_string.charAt(j) == 'O') {
					score_temp++;
					score_sum += score_temp;
				} else if (test_string.charAt(j) == 'X') {
					score_temp = 0;
				}
			}

			System.out.println(score_sum);

		}
		sc.close();
	}

}
