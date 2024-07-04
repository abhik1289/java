
class Employees {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void setId(int n) {
        id = n;
    }

    public int DId() {
        return id;
    }

    public String Dname() {
        return name;
    }

}

public class class3 {
    public static void main(String[] args) {
        Employees avik = new Employees();
        avik.setId(10);
        avik.setName("Abhik");
        System.out.println(avik.DId());
        System.out.println(avik.Dname());

    }
}
