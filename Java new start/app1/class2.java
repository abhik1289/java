
class Employee {
    int sallary;
    String name;

    public int getSallary() {
        return sallary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Ring");
    }

    public void vibrate() {
        System.out.println("vibrate");
    }

    public void call() {
        System.out.println("call");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class class2 {
    public static void main(String[] args) {
        Employee avik = new Employee();
        avik.setName("Abhik Patra");
        avik.sallary = 555;
        System.out.println(avik.getName());
        System.out.println(avik.getSallary());



        CellPhone mi =new CellPhone();
        mi.ring();


        Square ground =new Square();
        ground.side = 10;
   System.out.println(ground.area()+ground.perimeter());
    }

   
}
