package class16;

public class Task3 {
    /*
    create a method that will print whether given String is palindrome or not
    return type=>void
    name=>is palindrome
    parameters=>String inputStr

    {

    }
    example dad=>dad true
    abc=>cba false

     */
    void ispalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equals(reversedStr)){
            System.out.println(str+" is palindrome");

        }else {
            System.out.println(str + " not is palindrome");
        }
    }
    public static void main(String[] args) {
        Task3 task3=new Task3();
        task3.ispalindrome("kaya");

        }
    }

