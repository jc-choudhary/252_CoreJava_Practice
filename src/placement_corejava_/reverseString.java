package placement_corejava_;

public class reverseString {

	public static void main(String[] args) {
		String str = "jyoti";
		String reverse = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println("Reversed String : " + reverse );
	}
}
