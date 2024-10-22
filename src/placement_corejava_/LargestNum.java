package placement_corejava_;

public class LargestNum {

	public static void main(String[] args) {
		int shows[] = { 11, 34, 57, 89, 76, 59, 78 };
		int MaximunNum = shows[0];
		for (int i = 0; i < shows.length; i++) {
			if (shows[i] > MaximunNum) {
				MaximunNum = shows[i];
			}
		}
		System.out.println(MaximunNum);
	}
}
