package class4;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("are you ready for holidays");
        boolean age= input.nextBoolean();
        System.out.println("we are ready for holidays "+age);
    }
}
