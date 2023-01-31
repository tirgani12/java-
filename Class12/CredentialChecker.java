package Class12;

import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your username");
        String userName=scan.next();
        System.out.println("please enter your password");
        String password= scan.next();
        System.out.println("please enter your password again");
        String confirmpassword=scan.next();
        if (userName.isEmpty()|| password.isEmpty()) {
            System.out.println("Username or password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("password to short");
        } else if (password.contains(userName)) {
            System.out.println("password can not contain username");
        } else if (!password.equals(confirmpassword)) {
            System.out.println("password do not match");
        }else {
            System.out.println("Your username and password has been created");

        }

    }

    }










