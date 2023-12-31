package ConceptCodes;

import java.util.*;

public class Variables {
    public static void main(String[] args) {
        // Variables

        String name = "Parul Rathva";
        int a = 25;
        int b = 10;
        double pencil_price = 25.25;

        // Constants
        final float PI = 3.14F;

        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(pencil_price);
        System.out.println(PI);

        name = "Parul";
        a = 20;

        System.out.println(a);
        System.out.println(name);

        a = 10;
        b = 25;
        int sum = a + b;

        System.out.println(sum);

        int diff = b - a;
        System.out.println(diff);

        // Get input from the User using Scanner function of Java

        // This will only pring first tocken of the Input
        try (Scanner sc = new Scanner(System.in)) {
            String Name = sc.next();
            System.out.println(Name);
        }
        // This will print whole Input
        try (Scanner fullname_sc = new Scanner(System.in)) {
            String Fullname = fullname_sc.nextLine();
            System.out.println(Fullname);
        }

        // Note: Other next utilities are nextInt(), nextFloat(), etc.

        // Q1. Calculate A*B and A-B then devide it. Here A = 10, B = 5

        int A = 10;
        int B = 5;
        int ans = (A * B) / (A - B);

        System.out.println("Answer: " + ans);

        // Q2. Take 2 variables 'c' & 'd' and print their sum.

        try (Scanner int_sc = new Scanner(System.in)) {
            int c = int_sc.nextInt();
            int d = int_sc.nextInt();
            int int_sum = c + d;

            System.out.println(int_sum);
        }
    }

}
