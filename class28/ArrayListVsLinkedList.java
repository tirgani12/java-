package class28;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        LinkedList<String> numbers=new LinkedList<>();
        //ArrayList<String> numbers=new ArrayList<>();
        for (int i=0;i<100000000;i++) {
            numbers.add(0, "Test Data");
        }
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime);
        }
    }

