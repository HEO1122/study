package ex.stud;
/* 
 * �Ѱ����� ���� ������ 0.02kcal�� �Ҹ�ȴ�. �Ϸ絿�� 5000���� �ɾ��ٰ� �� �� �̸� ����
 * �Ҹ�� Į�θ����� �޼ҵ�� ������ּ���
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
	//�Ϸ絿�� �Ҹ�� Į�θ� ����ؼ� ������ִ� �Լ�
	public void calc() {
		System.out.println(walk*dayWalk+"kcal");
	}
}
