package ex.stud;
/*
 * 문제
주어진 코드는 주사위 A와 B의 눈의 값을 출력한다.
클라우드스터딩-자바-API-주사위의-눈-Math-Random

주사위 A와 B를 동시에 100회 던진 결과의 합을 토대로, 출력 예와 같은 결과를 만드시오.

출력 예
아래의 합계 별 출력 횟수는 그때 그때 다름!

 2 => #
 3 => #####
 4 => ##########
 5 => ############
 6 => ###########
 7 => ####################
 8 => ################
 9 => ###########
10 => #####
11 => #######
12 => ##
힌트
배열에 값을 기록
반복문을 통한 출력
 */
import java.lang.Math;
import java.util.Random;

public class RandomTest {
	String[] sumarray;
	int diceA ,diceB, sum;
	public RandomTest() {
		
	}

	public static void main(String[] args) {
		new RandomTest();
	}
	
	//주사위 던져서 숫자 얻기
	public void drawDice() {
		 diceA = (int)(Math.random()*6+1);
		 diceB =(int)(Math.random()*6+1);
	}
	//주사위 합계 구하는 함수
	public int addDice() {
		return sum=diceA+diceB;
	}
	//주사위 합계를 배열에 입력하는 함수
	public int[] inArray() {
		for(int i=0;i<100;i++) { //100회 반복
			for(int j=0;j<i;j++) {
				sumarray[sum-2]= {"#"};
			}
		}
		
	}
}
