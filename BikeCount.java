package For2;

public class BikeCount {
	public static void main(String[] args) {
		int[] cc= {250,200,100,125,150,160,180,220,390,690,900};
		int count=0;
       // for(int i=0;i<cc.length/2;i++) {
        //  count=count+1;
		//}
       // System.out.println(count);
		for(int i=cc.length/2;i<cc.length;i++) {
			count=count+1;
		}
		System.out.println(count);
        
	}
}