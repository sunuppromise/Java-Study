package source;

public class Test {
    public static void main(String[] args) {
        String str = UpperString("korea");
        System.out.printf("입력한 소문자에 대문자는 = %s", str);
    }

    public static String UpperString(String str) {
        String result = str.toUpperCase();
        return result;
    }
}
