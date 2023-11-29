package replitnew;

import java.util.Scanner;

public class SumWithAdditionalLogics26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		double sumOfNumber = sumnumbers(num1, num2, num3);
		System.out.println(sumOfNumber);
		
		
	}
	
	
	public static int sumnumbers(int num1, int num2, int num3) {
		int sum = 0;

        if (num1 != 10) {
            sum += num1;
        }

        if (num2 != 10) {
            sum += num2;
        }

        if (num3 != 10) {
            sum += num3;
        }

        return sum;
    }
}
