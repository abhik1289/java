
// methood


//------------------1
// public class main {
//     static int logic(int x, int y) {
//         int z;
//         if (x > y) {
//             z = x + y;
//         } else {
//             z = (x + y) * 5;
//         }
//         return z;
//     }

//     public static void main(String[] args) {
//          int a =10;
//          int b =05;
//          int c = logic(a, b);
//          System.out.println(c);
//     }
// }


//------------------2

public class main {
     int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        main obj = new main();
         int a =10;
         int b =05;
         int c = obj.logic(a, b);
         System.out.println(c);
    }
}