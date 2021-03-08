package ex.stud;
/*
 * 메소드 속 메소드 호출
메소드 안에서 또 다시 메소드를 호출할 수 있습니다.

# 메소드 호출 예
threeStar();
threeStar() 메소드는, 내부적으로 oneStar()를 3번 호출합니다.

# 메소드 정의 예
public static void threeStar() {
  oneStar();
  oneStar();
  oneStar();
}
public static void oneStar() {
  System.out.printf("*");
}
따라서 다음과 같은 결과가 출력됩니다.

***
문제
	출력 예와 같은 직사각형이 출력되도록, drawRectangle() 메소드를 완성하시오.

출력 예
* * * * * *
*         *
* * * * * *
 */
public class ControlFlow {

	public ControlFlow() {
		/*
		drawRow();
		drawCol();
		drawRow();
		*/
		drawRectangle();
	}

	public static void main(String[] args) {
		new ControlFlow();

	}
	//직선을 그리는 메소드
	public void drawRow() {
		System.out.println("******");
	}
	//기둥그리는 메소드
	public void drawCol() {
		System.out.println("*    *");
	}
	
	//  참고(반복문으로 해결하는 방법)
	public void drawRectangle() {
		for(int i = 0 ; i < 3 ; i++ ) {
			for(int j = 0 ; j < 6; j++) {
				if(i % 2 == 0) {
					System.out.print("*");
				} else {
					if(j == 0 || j == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
