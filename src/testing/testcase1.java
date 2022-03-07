package testing;

public class testcase1 {
	// method that returns max number
	public static int findMax(int arr[]){
		int max=0;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
		return max;
	}
	//method that returns float
	public static float findMax1(float arr[]){
		float max1=0;
		for(int i=1;i<arr.length;i++){
			if(max1<arr[i])
				max1=arr[i];
		}
		System.out.println(max1);
		return max1;
	}	
	//method that returns max string
	public static int findMaxString(){
	String a = "Neha";
	String b = "Nehachoursiya";
	String c = "Sneha";
	int i = a.compareTo(b);
	int j = a.compareTo(c);
	int k = c.compareTo(a);
	System.out.println(i+ " " +j+ " "+k+" ");
	
	return i;
	}
}
	
	
	
	
	