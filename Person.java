package For2;

public class Person {
	public static void main(String[] args) {
		int[] age=new int[3];
		age[0]=36;
		age[1]=42;
		age[2]=22;
		for(int i=age.length-1;i>=0;i--) {
			System.out.println(age[i]);
		}
	}
	

}
