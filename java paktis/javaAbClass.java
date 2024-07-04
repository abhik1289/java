
abstract class Base {
    public Base() {
        System.out.println("I am base contructor");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();

}

class Base2 extends Base {
    @Override
    public void greet() {
        System.out.println("Gd Mornging");
    }
    @Override
    public void greet2() {
        System.out.println("Gd Night");
    }
}

public class javaAbClass {
    public static void main(String[] args) {

    }
}