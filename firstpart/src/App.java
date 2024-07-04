import java.util.Scanner;
package com.company;

public class App {
    public static void main(String[] args) throws Exception {
        // write your code here
        // System.out.println("The result is: ");
        // int num1 = 10;
        // int num2 = 20;
        // int num3 = 30;
        // int res = num1+num2+num3;
        // System.out.println(res);
        // byte age = 34;
        // int age2 = 56;
        // short age3 = 87;
        // long ageDino = 5666666666666L;
        // char ch = 'A';
        // float f1 = 5.6f;
        // double d1 = 4.66;

        // boolean a = true;
        // System.out.print(age);
        // String str = "Harry";
        // System.out.println(str);
        // ---------scanner---------------------------//
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter first No: ");
        // int a =sc.nextInt();
        // System.out.println("Enter Second No: ");
        // int b =sc.nextInt();
        // System.out.println("Result is: ");
        // int c;
        // c=a+b;
        // System.out.println(c);
        // Scanner sc = new Scanner(System.in);
        // float total =500;
        // System.out.println("Enter marks for 5 subjects: ");
        // System.out.println("English: ");
        // float a = sc.nextFloat();
        // System.out.println("Mathematics: ");
        // float b = sc.nextFloat();
        // System.out.println("Physics: ");
        // float c = sc.nextFloat();
        // System.out.println("Chemistry: ");
        // float d = sc.nextFloat();
        // System.out.println("C++: ");
        // float e = sc.nextFloat();

        // float sum = a+b+c+d+e;
        // System.out.println("your total marks is: ");
        // System.out.println(sum);
        
        // float percentage = (sum/total)*100;
        // System.out.println("Marks Percentage is: ");
        // System.out.print(percentage);
        // int i =40;
        // System.out.println(++i);
        //----------------------Increment && Decrement ------------------//

public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        //  int k = x * y/2;

        int b = 0;
        int c = 0;
        int a = 10;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

    }
}
    
    }
}
