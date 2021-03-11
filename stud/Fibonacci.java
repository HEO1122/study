package day18.ex;

public class Fibonacci {

	public Fibonacci() {
		int current =1;
		int prev=1;
		int prevprev=0;
		System.out.println(current);
		for(int i =0; i<20; i++) {
			current = prev+prevprev;
			System.out.println(current);
			prevprev =prev;
			prev=current;
		}
	}

	public static void main(String[] args) {
		new Fibonacci();

	}

}
