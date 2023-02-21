package class27;

public class Demo1 {
    public static void main(String[] args) {


        String name = "Zafar";
        String name1 = "hyki";
        String name3 = "hju";
        String[] names = {"ytu", "oiuy", "jkiu", "bhyghj"};
        displayName(names);
        display(name,name1,name3);
    }
    public static void displayName(String[]names){
        for (String name:names){
            System.out.println(name);
        }
    }
    public static void display(String name,String name1,String name3){
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name3);

    }
}
