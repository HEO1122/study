package ex.stud;
/*
 * ����
�־��� �ڵ�� �ֻ��� A�� B�� ���� ���� ����Ѵ�.
Ŭ���彺�͵�-�ڹ�-API-�ֻ�����-��-Math-Random

�ֻ��� A�� B�� ���ÿ� 100ȸ ���� ����� ���� ����, ��� ���� ���� ����� ����ÿ�.

��� ��
�Ʒ��� �հ� �� ��� Ƚ���� �׶� �׶� �ٸ�!

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
��Ʈ
�迭�� ���� ���
�ݺ����� ���� ���
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
	
	//�ֻ��� ������ ���� ���
	public void drawDice() {
		 diceA = (int)(Math.random()*6+1);
		 diceB =(int)(Math.random()*6+1);
	}
	//�ֻ��� �հ� ���ϴ� �Լ�
	public int addDice() {
		return sum=diceA+diceB;
	}
	//�ֻ��� �հ踦 �迭�� �Է��ϴ� �Լ�
	public int[] inArray() {
		for(int i=0;i<100;i++) { //100ȸ �ݺ�
			for(int j=0;j<i;j++) {
				sumarray[sum-2]= {"#"};
			}
		}
		
	}
}
