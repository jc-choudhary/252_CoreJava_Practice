package placement_corejava_;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int n = 7;
		int first = 0, second = 1;
		System.out.println("Fibonacci sereies");
		for (int i = 1; i <= n; i++) {
			System.out.println(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}
}
