package day16.ex;
//try{} catch(){} ����ó�� ����
public class ExceptionTest {
	public void call(int j) {
		try {
			int[] i = {1,2,3};
			System.out.println("call value :"+i[j]);//�迭 i�� j��°�� �ҷ�����
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭ũ�⿡ �´� ���� �Է��ϼ���");
			e.printStackTrace();//���� ���� ���
		} finally { //Exception ���ο� ������� ����
			System.out.println("�ش� ������ ������ ����");
		}
	}


	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();// ��üȭ
		et.call(1);//call �޼ҵ� ���

		

	}

}
