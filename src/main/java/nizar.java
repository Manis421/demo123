import java.util.Arrays;


public class nizar {
 public static void main(String args[]) {
	 int arr[]= {1,2,3,4,5};
	 int out[]=Arrays.stream(arr).map(y->y+1).map(x->x*x).toArray();
	 System.out.print("out: ");
	 for(int i:out) {
		 System.out.print(i + " ");
	 }
	 
 }
}
