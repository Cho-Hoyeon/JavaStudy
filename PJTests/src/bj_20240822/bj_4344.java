package bj_20240822;

import java.util.Scanner;

class bj_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case_num = 0;

		case_num = sc.nextInt();

		for (int i = 0; i < case_num; i++) {

			int score_sum = 0;
			int student_num = 0;
			float score_avg = 0.0f;
			int avg_over = 0;
			int student_arr[] = {};
			String format_num = "";

			student_num = sc.nextInt();
			student_arr = new int[student_num];

			for (int j = 0; j < student_num; j++) {
				student_arr[j] = sc.nextInt();
			}
			for (int j = 0; j < student_arr.length; j++) {
				score_sum += student_arr[j];
			}

			score_avg = (float) score_sum / student_num;
			for (int j = 0; j < student_arr.length; j++) {
				if (student_arr[j] > score_avg) {
					avg_over++;
				}
			}
			format_num = String.format("%.3f", (float) avg_over / student_num * 100);
			System.out.println(format_num + "%");
		}
		sc.close();
	}
}
