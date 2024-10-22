package placement_corejava_;

public class SmallestNo {

	public static void main(String[] args) {
		int marks[]= {23,45,18,56,98};
		int MinimumNum = marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<MinimumNum) {
				MinimumNum = marks[i];
			}
		}
        System.out.println(MinimumNum);
	}
}
