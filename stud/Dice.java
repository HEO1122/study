package ex.stud;

/*������ �뵷�� ä������� ���ڿ� ���� ��� �߹��� �л�. �ֻ����� ���� ���� ���� ����ŭ �޶� ȹ���ϴ� �ҹ� ���ڻ���Ʈ�� �����ϴµ�..

������� 18�޶� �ֻ����� 5�� ���� �� ���� ��, ���� ��ŭ �̵�(�Ǵ� ����) ���Ҵ��� ������ּ���.

�䱸����

Math.random() �޼ҵ带 ����Ͽ� 1 �� 6 ������ ���ڸ� ��ȯ�ϴ� dice() �޼ҵ带 ������ ��.
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

// 1~6�� ��ȯ���ִ� dice()�Լ�
	public int rNum() {
		int no = (int)(Math.random()*6+1);
		return no;
	}	

//�ֻ����� ������ �� �̵� or ���� ������ִ� �Լ�
	public /*int*/void calc() {
		int getMoney =0;
		for(int i =0; i<5; i++) {
			
			getMoney = getMoney + rNum();
		}
		result = getMoney;
	//	return result;
	}
	//�ֻ��� ��� ������ִ� �Լ�
	public void result() {
		System.out.println("�ֻ��� ���� ����� " + result);
	}

	//����������ִ� �Լ�
	public void toPrint() {
		if(result>18 ) {
			System.out.println("18�޷����� "+ (result - 18)+ " ��ŭ �̵��Դϴ�.");
		}else {
			System.out.println("18�޷����� "+ (18-result)+ " ��ŭ �����Դϴ�.");
		}
	}

}
