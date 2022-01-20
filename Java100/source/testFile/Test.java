class Person {
    int _age;
    String _name;

    public Person(int age, String name) {
        this._age = age;
        this._name = name;
    }

    public void printAgeName() {
        System.out.printf("이름 : %s 나이 : %d", this._name, this._age);
        System.out.println();
    }

    public void working() {
        System.out.println("걸어가고 있어요.");
    }
}

class Hero extends Person {
    int _sex;
    int _power;

    public Hero(int age, String name, int sex, int power) {
        super(age, name);
        // TODO Auto-generated constructor stub
        this._sex = sex;
        this._power = power;
    }

    @Override
    public void working() {
        System.out.println("2배로 빨리 걸어가고 있어요.");
    }

}

public class Test {
    public static void main(String[] args) {

        Hero a = new Hero(20, "홍길동", 1, 100);
        Hero b = new Hero(30, "이순신", 1, 100);
        Hero c = new Hero(40, "을지문덕", 1, 100);

        a.printAgeName();
        b.printAgeName();
        c.printAgeName();
        a.working();
    }
}