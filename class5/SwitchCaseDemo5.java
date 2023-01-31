package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("please enter your gender");
        char gender=inp.next().charAt(0);
        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }

    }
}


