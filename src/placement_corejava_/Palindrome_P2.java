package placement_corejava_;

public class Palindrome_P2 {

	public static void main(String[] args) {
		int n = 123;
		int reverse = 0;
		int num = n;
		while (num > 0) {
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		if (n == reverse) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
