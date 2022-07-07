package For2;

public class fruitnam {
	public static void main(String[] args) {
		String[] fruitNames= {"Apple","Banana","cherry","Dragonfruit"};
		String add="";
		for(int i=0;i<fruitNames.length;i++) {
	     add=add+fruitNames[i];
		}
		System.out.println(add);
		for(int i=fruitNames.length-1;i>=0;i--) {
			System.out.println(fruitNames[i]);
		}
		for(int i=(fruitNames.length/2)-1;i>=0;i--) {
			System.out.println(fruitNames[i]);
		}
		for(int i=fruitNames.length-1;i>=fruitNames.length/2;i--) {
			System.out.println(fruitNames[i]);
		}
		for(int i=0;i<=fruitNames.length-1;i++) {
			System.out.println(fruitNames[i].charAt(0));
			
		}
	}

}
