package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Artem");//linkedList is a name that you can choose
        linkedList.add("Elvira");
        linkedList.add("Tammana");
        linkedList.add("Temmuz");
        linkedList.add("Sam");
        System.out.println(linkedList);
        for (String linkedList1:linkedList){
            System.out.println(linkedList1);
        }
    }
}
