package HomeWorkClass13;

public class HomeWork5 {
    public static void main(String[] args) {

        /*5) How would you check if String is palindrome or not? aba=> true
Abbc =>false

*/


        String str="This is sentence i want to reverse";

        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }

        System.out.println(reverseWord);



    }
}
