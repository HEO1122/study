package day16.ex;
//try{} catch(){} 예외처리 예제
public class ExceptionTest {
	public void call(int j) {
		try {
			int[] i = {1,2,3};
			System.out.println("call value :"+i[j]);//배열 i의 j번째값 불러오기
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열크기에 맞는 값을 입력하세요");
			e.printStackTrace();//에러 내용 출력
		} finally { //Exception 여부와 상관없이 수행
			System.out.println("해당 문장은 무조건 수행");
		}
	}


	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();// 객체화
		et.call(1);//call 메소드 출력

		

	}

}
