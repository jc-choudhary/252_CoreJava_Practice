package placement_corejava_;

public class Max_Even_Odd_No {

	public static void main(String[] args) {
		int marks[]= {7,18,25,36,23};
		int max = marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>max) {
				if(marks[i]%2!=0) {
					max = marks[i];
				}
			}
		}
		System.out.println(max);
	}
}
