package day16.ex;
//throws ����ó��
public class ExceptionTest2 {
	
	public void call(int j) throws ArrayIndexOutOfBoundsException{//throws�� ȣ���� ������ ����ó��
		int[] i = {1,2,3};//int Ÿ���� �迭 i�ʱ�ȭ
		System.out.println("call value : "+ i[j]);//�迭 i�� j��° �� �ҷ�����
	}

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();//��üȭ
		try {
			et.call(1);//call �޼ҵ� ȣ��
		}catch(ArrayIndexOutOfBoundsException e) {//���� �߻� �� ����
			System.out.println("�迭 ũ�⿡ �´� ���� �Է��ϼ���");
			e.printStackTrace();//�������� ���
		}finally { //Exception���ο� ������� ����
			System.out.println("�ش� ������ ������ ����");
		}
	}

}
