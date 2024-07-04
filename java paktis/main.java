
class Infomation {
    String name;
    int age;
    int dob;
    int fatherAge;
    String wish = "happy Birthday Avik";

    public void setName(String n) {
        name = n;
    }

    public void setAge(int no) {
        age = no;
    }

    public int getAge() {
        return age;
    }

    public String wishBirthDay() {
        return wish;
    }

    public void setFatherAge(int n) {
        fatherAge = n;
    }

    public int getfatherAge() {
        return fatherAge;
    }

    public int difAge(int fatherAge, int yourAge) {
        int result = fatherAge - yourAge;
        return result;
    }

}

public class main {
    static void myAge(){
            System.out.println("Hello Man");
    }
    static String getDob (String n){
        return n;
    }
    public static void main(String args[]) {

        

        Infomation avik = new Infomation();
        avik.setName("Mr Avik Patra");
        avik.setAge(17);
        avik.setFatherAge(47);
        // System.out.println(avik.getfatherAge());
        // System.out.println(avik.getAge());
        System.out.println(avik.difAge(avik.getfatherAge(),avik.getAge()));
        myAge();
       String x=  getDob("30/05/2005");
        System.out.println(x);
    }
}