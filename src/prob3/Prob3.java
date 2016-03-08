package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		char[] arr = new char[str.length()];
						// 11
		for(int i=0; i<str.length(); i++){
			arr[i] = str.charAt(str.length()-(i+1));
		}
		return arr;
	}
	
	public static void printCharArray(char[] array){
		for (char c : array) {
			System.out.print(c);
		}
		System.out.println();
	}
}
