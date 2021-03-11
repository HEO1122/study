package day18.ex;

public class FizzBuzz {

	public FizzBuzz() {
	for(int i=1;i<=100;i++) {
		
		if((i%5==0)&&(1%7==0)) {
			System.out.println("FizzBuzz");
		}else  if(i%5==0) {
			System.out.println("Fizz");
		}else if(i%7==0){
			System.out.println("Buzz");
		}else {
			System.out.println(i);
			
		}
	}
	}

	public static void main(String[] args) {
		new FizzBuzz();

	}

}
