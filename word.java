package For2;

public class word {
	public static void main(String[] args) {
	  String word="onesoft";	
	  char[] result=word.toCharArray();
	  String reverse="";
	 /* for(int i=result.length-1;i>=0;i--) {
		  reverse=reverse+result[i];
		  
	  }
	   System.out.println(reverse);*/
	   for(int i=result.length-1;i>=0;i--) {
		   reverse=reverse+result[i];
		   System.out.println(reverse);
	   }
	   for(int i=result.length-1;i>=0;i--) {
		   System.out.println(result[i]);
	   }
	  
		
	}

}
