package HomeWorkClass13;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

        /*5) How would you check if String is palindrome or not? aba=> true
Abbc =>false

*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scan.next();
        String str2=str;
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (str2.equals(rev)){
            System.out.println(str2+"is palindrome string");
        }else{
            System.out.println(str2+"is not palindrome string");


        }




        }




    }

