package For2;

public class Day11 {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=8-2;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}

}
