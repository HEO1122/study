package ex.stud;
/*
 * �޼ҵ� �� �޼ҵ� ȣ��
�޼ҵ� �ȿ��� �� �ٽ� �޼ҵ带 ȣ���� �� �ֽ��ϴ�.

# �޼ҵ� ȣ�� ��
threeStar();
threeStar() �޼ҵ��, ���������� oneStar()�� 3�� ȣ���մϴ�.

# �޼ҵ� ���� ��
public static void threeStar() {
  oneStar();
  oneStar();
  oneStar();
}
public static void oneStar() {
  System.out.printf("*");
}
���� ������ ���� ����� ��µ˴ϴ�.

***
����
	��� ���� ���� ���簢���� ��µǵ���, drawRectangle() �޼ҵ带 �ϼ��Ͻÿ�.

��� ��
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
	//������ �׸��� �޼ҵ�
	public void drawRow() {
		System.out.println("******");
	}
	//��ձ׸��� �޼ҵ�
	public void drawCol() {
		System.out.println("*    *");
	}
	
	//  ����(�ݺ������� �ذ��ϴ� ���)
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
