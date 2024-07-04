public class main2 {

    static void tellJocks() {
        System.out.println("Abhik Patra");
    }

    // when something is not return use "VOID"
    static void changeInt(int x) {
        x = 98;
    }

    static void changeInt2(int[] arr) {
        arr[0] = 98;
    }

    static void changeInt3() {
        System.out.println("Abhik");
    }

    static void changeInt3(int a) {
        System.out.println("Abhik" + a);
    }

    // arags
    static int sum(int x,int... arags) {
        int result = 0;
        for (int a : arags) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        // tellJocks();
        // case1:
        // int a = 40;
        // changeInt(a);
        // System.out.println(a);
        int[] marks = { 10, 20, 30, 40 };
        changeInt2(marks);
        System.out.println(marks[0]);
        changeInt3(12);
        System.out.println("Result is" + sum(1, 4, 5));
    }
}
