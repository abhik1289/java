
class Info {
    int id;
    String name;
    int age;

    public void printInfo() {
        System.out.println("My id is" + id);
        System.out.println("My name is" + id);
        System.out.println("My age is" + id);
    }
}

public class firstClass {

    public static void main(String[] args) {
        Info avik = new Info();
        avik.id = 10;
        avik.name = "Avhik Patra";
        avik.age = 18;

        avik.printInfo();

    }
}