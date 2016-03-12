package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		System.out.print("금액:");
		
		Scanner sc = new Scanner(System.in);
		
		int cost = sc.nextInt();
		int[] price = new int[9];
		int div = 50000;
				
		for(int i=0; i<price.length; i++){
			if(i%2==0){ //짝수번째
				price[i] = cost/div;
				cost = cost - price[i]*div;
				
				if(cost>=500){
					System.out.println(div+"원 권: "+price[i]+"매");
				}else{
					System.out.println(div+"원 동전: "+price[i]+"개");
				}
				
				div = div/5;
			}else{		//홀수번째
				price[i] = cost/div;
				cost = cost - price[i]*div;
				
				if(cost>=500){
					System.out.println(div+"원 권: "+price[i]+"매");
				}else{
					System.out.println(div+"원 동전: "+price[i]+"개");
				}
				
				if(i==price.length-2){
					div = div/10;
				}else{
					div = div/2;
				}
				
			}
		}
	
	}
}

