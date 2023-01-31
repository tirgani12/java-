package class15;

import java.util.Scanner;

public class MPractice6 {
    /* create a method that does not take any parameters and returns a S

     */
    String createEmail( String firstName, String lastName,String emailType) {
        String completeEmail;

            return firstName+lastName+"@"+emailType+".com";

        }

    public static void main(String[] args) {
        MPractice6 mp=new MPractice6();

        System.out.println(mp.createEmail("John","Snow","gmail"));

    }
}