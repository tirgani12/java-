package class28;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
       /* for (String s:words){
            if (s.endsWith("a")){
                words.remove(s);
            }
        }*/
        for (int i=0;i<words.size();i++){
            if (words.get(i).endsWith("a")){
                words.remove(words.get(i));
            }
        }
        System.out.println(words);
    }
}
