package first;

import java.util.Scanner;

public class Ex01_ArrayStudent {

	public static void main(String[] args) {
		int num = 0;// 메뉴 번호
		Scanner scan = new Scanner(System.in);
		boolean run = true;// 반복 실행 변수
		int[] stu = null;// 학생수
		int score = 0;// 학생 점수
		int max = 0; // 학생점수 최고값
		int aver = 0; // 학생점수 평균값
		int temp = 0; // 내림차순
		int sum = 0;// 학생점수 총합
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			num = scan.nextInt();

			if (num == 1) {
				System.out.print("학생수 >");
				int size = scan.nextInt();
				stu = new int[size];
			} else if (num == 2) {// 배열에 데이터 저장
				for (int i = 0; i <= stu.length; i++) {
					System.out.print((i+1) + "번 째 학생점수 : ");
					score = scan.nextInt();
					stu[i] = score;

				}
			} else if (num == 3) {//배열에 저장된 데이터 출력
				for (int i = 0; i <= stu.length; i++) {
					System.out.println((i+1) + "번 째 학생점수 :" + stu[i]);
				}
				;

			} else if (num == 4) {// 최고값 , 평균값, 내림차순 정렬
				for (int i = 0; i < stu.length; i++) {
					if (stu[i] > max) {
						max = stu[i];
					}
					sum += stu[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + sum / stu.length);
				for (int i = 0; i < stu.length; i++) {
					for (int j = i + 1; j < stu.length; j++) {
						if (stu[i] < stu[j]) {
							temp = stu[i];
							stu[i] = stu[j];// 내림차순 모르겠다
							stu[j] = temp;
						}
					}
					System.out.println(stu[i]);
				}
			} else {
				System.out.println("종료");
				run = false;
			}
		}
		;

	}

}
