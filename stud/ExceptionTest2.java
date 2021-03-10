package day16.ex;
//throws 예외처리
public class ExceptionTest2 {
	
	public void call(int j) throws ArrayIndexOutOfBoundsException{//throws는 호출한 곳에서 예외처리
		int[] i = {1,2,3};//int 타입의 배열 i초기화
		System.out.println("call value : "+ i[j]);//배열 i의 j번째 값 불러오기
	}

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();//객체화
		try {
			et.call(1);//call 메소드 호출
		}catch(ArrayIndexOutOfBoundsException e) {//에러 발생 시 수행
			System.out.println("배열 크기에 맞는 값을 입력하세요");
			e.printStackTrace();//에러내용 출력
		}finally { //Exception여부와 상관없이 수행
			System.out.println("해당 문장은 무조건 수행");
		}
	}

}
