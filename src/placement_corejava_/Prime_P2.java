package placement_corejava_;

public class Prime_P2 {

	public static void main(String[] args) {
		int n=7;
		int primeN =0;
		for(int i=1;i<=n;n++) {
			if(n%2==0) {
				primeN=n;
				System.out.println("Number is prime");
			}else {
				System.out.println("Not prime");
			}
		}
		System.out.println(primeN);
	}

}
