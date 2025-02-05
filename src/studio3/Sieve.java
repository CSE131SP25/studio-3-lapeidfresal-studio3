package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick number: ");
		int n = scanner.nextInt();
		int[] numbers = new int[n + 1];
		int fillArray = 0;
		
		for (int i = 0; i < (n+1); i++) {
			numbers[i] = fillArray;
			fillArray++;
		}
		int a = 2;
		for (int i = 0; i <= numbers.length; i++) {
			for (int j = 2*a; j < numbers.length; j = j + a) {
				numbers[j] = 0;
			}
			a++;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
