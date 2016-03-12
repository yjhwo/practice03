package prob2;

import java.util.Scanner;

public class Prob2_2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		System.out.println("금액 : "+price);
		
		final int[] PRICE_UNIT = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		for(int i=0; i<PRICE_UNIT.length; i++){
			int count = price/ PRICE_UNIT[i];
			price -= count*PRICE_UNIT[i];
			System.out.println(PRICE_UNIT[i] + "원 권:"+count+"개");
		}
		
		sc.close();
	}

}
