package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please Enter the item and the item price");

            String item = scan.next();
            double price = scan.nextDouble();


            total = total + price;

            System.out.println("your tatal is " + total);
        }
            System.out.println("enter your payment");
            double payment = scan.nextDouble();

            if (payment > total) {
                System.out.println("your change is" + (payment - total));
            } else if (payment<total) {
                System.out.println("you can not buy all the items");

            }
        System.out.println("thank you for shopping!");

            }

        }






