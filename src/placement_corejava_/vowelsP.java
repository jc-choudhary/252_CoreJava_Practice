package placement_corejava_;

public class vowelsP {
static void Vowels(char y) {
	if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u') {
		System.out.println("They are vowels");
	}else {
		System.out.println("Not Vowels");
	}
}
	public static void main(String[] args) {
		Vowels('b');
		Vowels('u');
	}
}
