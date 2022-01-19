// 기본형 타입의 값을 초기화한 아래의 코드에서 틀린 곳을 찾아 수정하시오.
// 이 문제는 기본형 타입의 값을 초기화하는 방법에 대해서 알고 있는지를 묻는 문제이다.


public class Java100_variable_DataType2 {
	public static void main(String[] args) {
		
		// [1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 7000000000L;
		float f = 9.8F;
		double d = 3.14;	
		char c = 'A';		
		boolean bl = false;

		// [2] : 출력
		System.out.println( b + " byte 최댓값 --> " + Byte.MAX_VALUE );
		System.out.println( s + " short 최댓값 --> " + Short.MAX_VALUE );
		System.out.println( i + " int 최댓값 --> " + Integer.MAX_VALUE );
		System.out.println( l );
		System.out.println( f );
		System.out.println( d );
		System.out.println( c );
		System.out.println( bl );
		
	}
}