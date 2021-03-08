package ex.stud;

/*부족한 용돈을 채우기위해 도박에 손을 대고만 야바위 학생. 주사위를 던져 나온 눈의 수만큼 달라를 획득하는 불법 도박사이트에 접속하는데..

참가비용 18달라에 주사위를 5번 던질 수 있을 때, 돈을 얼만큼 이득(또는 손해) 보았는지 계산해주세요.

요구사항

Math.random() 메소드를 사용하여 1 과 6 사이의 숫자를 반환하는 dice() 메소드를 구현할 것.
*/
public class Dice {
	int haveMoney =18;
	int result;
	
	public Dice() {
		rNum();
		calc();
		result();
		toPrint();
	}
	
	public static void main(String[] args) {
		new Dice();
	}

// 1~6을 반환해주는 dice()함수
	public int rNum() {
		int no = (int)(Math.random()*6+1);
		return no;
	}	

//주사위를 던졌을 때 이득 or 손해 계산해주는 함수
	public /*int*/void calc() {
		int getMoney =0;
		for(int i =0; i<5; i++) {
			
			getMoney = getMoney + rNum();
		}
		result = getMoney;
	//	return result;
	}
	//주사위 결과 출력해주는 함수
	public void result() {
		System.out.println("주사위 게임 결과는 " + result);
	}

	//손익출력해주는 함수
	public void toPrint() {
		if(result>18 ) {
			System.out.println("18달러에서 "+ (result - 18)+ " 만큼 이득입니다.");
		}else {
			System.out.println("18달러에서 "+ (18-result)+ " 만큼 손해입니다.");
		}
	}

}
