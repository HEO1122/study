package ex.stud;
/* 
 * 한걸음을 걸을 떄마다 0.02kcal이 소모된다. 하루동안 5000걸음 걸었다고 할 때 이를 통해
 * 소모된 칼로리량을 메소드로 계산해주세요
 */
public class Walking {
double walk=0.02;
int dayWalk =5000;
	public Walking() {
	calc();
	}

	public static void main(String[] args) {
		new Walking();

	}
	//하루동안 소모된 칼로리 계산해서 출력해주는 함수
	public void calc() {
		System.out.println(walk*dayWalk+"kcal");
	}
}
