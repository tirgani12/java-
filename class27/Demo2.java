package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name="Savo";
        String[]names={"bht","hyt","iuo","kjh"};
        System.out.println(contains(name,names));

    }

    public static boolean contains(String nameToBeSearched,String[]names){
       for (String name:names){
          if (nameToBeSearched.equals(name)){
              return true;
          }
    }
       return false;
}
}