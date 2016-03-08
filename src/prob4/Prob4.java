package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = in.nextInt();
			sum += intArray[i];
		}

		/* 출력 */
		System.out.println("평균은 "+sum/intArray.length+" 입니다.");
	}

}
