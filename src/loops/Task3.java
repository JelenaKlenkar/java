package src.loops;

public class Task3 {
	public static void main(String[] args) {
		 // increment, decrement
		
		int t=4,k=2;
		t=--k; // t = 1 k= 1
		k-=--t; // k= 1 t = 0
		k--;t++; // k= 0 t=1
		k=t++ + k; // k = 1 t=2
		System.out.println(k++ + ","+ t--);
		
	}

}
