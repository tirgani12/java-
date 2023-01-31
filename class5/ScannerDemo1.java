package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*System.out.println();
        System.out.println("please enter your age");
        int age= scan.nextInt();
        System.out.println("you are  "+age+" years old");
        System.out.println("please enter your weight");
        double weight= scan.nextDouble();
        System.out.println("your weight is "+weight+" kgs");
        System.out.println("are you hungry");
        boolean hungry=scan.hasNextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("please enter your gender");
        char gender=scan.next().charAt(0);*/
        System.out.println("please enter your name");
        String name=scan.next();
        System.out.println("yor name is "+name);
        scan.nextLine();
        System.out.println("please enter your full name");
        String fullName= scan.nextLine();
        System.out.println("your full name is"+fullName);
    }
}

