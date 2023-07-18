package Check_bit;

import java.util.Scanner;

public class Checkbit{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int A = scanner.nextInt();
		System.out.println("Enter the number");
		int B = scanner.nextInt();
		scanner.close();
		System.out.println(setorunset(A,B));
	}
	public static int setorunset(int A,int B) {
		if((A&1<<B)==0) {
			return 0;
		}
		else {
			return 1;
		}
	}
}