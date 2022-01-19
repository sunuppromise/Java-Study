// 사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오.
// 이때, 중첩 반복문을 사용하여 출력도 같이 해보시오.
// 이 문제는 배열 생성시 사용자로 부터 입력을 받아서 2차원 배열을 만들 수 있는지를 묻는 문제이다.

import java.util.Arrays;
import java.util.Scanner;

public class Java100_array_TwoArrayUserInput {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("행의 갯수를 입력하세요.");
		int rowCount = scan.nextInt();
		System.out.print("열의 갯수를 입력하세요.");
		int columnCount = scan.nextInt();

		String[] strArray = new String[columnCount];
		char[][] charArray = new char[rowCount][columnCount];

		for (int i = 0; i < charArray.length; i++) {
			System.out.printf("%d번째 행에 입력할 문자%d개를 이어서 입력하세요. :", i + 1, columnCount);
			strArray[i] = scan.next();
			for (int j = 0; j < charArray[0].length; j++) {
				charArray[i][j] = strArray[i].charAt(j);
			}
		}

		// for (int i = 0; i < array.length; i++) {
		// for (int j = 0; j < array[i].length; j++) {
		// System.out.printf("%d행 %d열에 값을 입력해주세요 :", i + 1, j + 1);
		// array[i][j] = scan.nextInt();
		// }
		// }

		for (int i = 0; i < charArray.length; i++) {
			System.out.println(Arrays.toString(charArray[i]));
		}
		scan.close();
	}
}