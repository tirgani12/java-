package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("ghy");
        names.add("bhy");
        names.add("chy");
        names.add("hhy");
        names.add("ihy");
        System.out.println(names.contains("bhy"));
        System.out.println(names);
        names.remove("hhy");
        System.out.println(names);
        names.set(2,"hhh");
        System.out.println(names);
        System.out.println(names.indexOf("ihy"));

    }
}
