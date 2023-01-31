package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter two numbers starting point and ending point");
        int start= scan.nextInt();
        int end=scan.nextInt();
        System.out.println("start "+start+" end "+end);
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <=end; i++) {


            if (i % 2 == 0) {
                evenSum+=i;
            }else {
                oddSum+=i;
            }

            }
        System.out.println("Sum of all the even numbers "+evenSum);
        System.out.println("Sum of all the odd numbers "+oddSum);
        }


    }
