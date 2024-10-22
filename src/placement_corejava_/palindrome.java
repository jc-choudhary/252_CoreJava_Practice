package placement_corejava_;

public class palindrome {

	public static void main(String[] args) {
		int n=454;
		int reverseNum=0,temp=n;
		while(temp>0) {
			int reminder = temp%10;
			reverseNum = reverseNum*10+reminder;
			temp = temp/10;
		}
		if(n==reverseNum) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}
}
