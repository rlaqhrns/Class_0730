package student_score_manager;

import java.util.Scanner;

public class Student_main {
	public static String classtest(Score[] score) {
		String result;
		Scanner sc_ = new Scanner(System.in);
		System.out.println("알고싶은 학생 입력 : ");
		int N = (sc_.nextInt() - 1);
		if (N >= score.length) {

			return "그런 학생은 없습네당";
		}
		result = N + 1 + "번째 학생은 평균이 " + score[N].getAvg() + " 이므로 " + grade(score[N].getAvg()) + "를 받았다";

		return result;
	}

	public static float avg(int kor, int eng, int math) {
		int total = kor + eng + math;
		return ((int) ((total / 3.0f) * 100)) / 100.0f;
	}

	public static String grade(float avg) {
		String result = "";
		if (avg >= 90)
			result = "수";
		else if (avg >= 80)
			result = "우";
		else if (avg >= 70)
			result = "미";
		else if (avg >= 60)
			result = "양";
		else
			result = "낙제";
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력하세요 : ");
		int N = sc.nextInt();
		String[] gradePrint = new String[N];
		Score[] score = new Score[N];

		for (int i = 0; i < score.length; i++) {
			score[i] = new Score();
			System.out.print(i + 1 + "번째 학생 국 영 수 입력 : ");
			score[i].setKor(sc.nextInt());
			score[i].setEng(sc.nextInt());
			score[i].setMath(sc.nextInt());
		}
		for (int i = 0; i < score.length; i++) {
			score[i].setAvg(avg(score[i].getKor(), score[i].getEng(), score[i].getMath()));

		}
		for (int i = 0; i < score.length; i++) {
			gradePrint[i] = grade(score[i].getAvg());
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println("================학생 " + (i + 1) + "================");
			System.out.println("국어 : " + score[i].getKor());
			System.out.println("영어 : " + score[i].getEng());
			System.out.println("수학 : " + score[i].getMath());
			System.out.println("평균 : " + score[i].getAvg());
			System.out.println("등급 : " + gradePrint[i]);

		}
		System.out.println(classtest(score));

	}

}
