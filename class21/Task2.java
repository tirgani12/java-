package class21;

public class Task2 {
    static void method(String str1){
        System.out.println("Method with one String");
    }
    static void method(String str1,String str2){
        System.out.println("Method with two String");
    }
    static void method(String str1,String str2,String str3){
        System.out.println("Method with tree String");
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
       task2. method("Java");
        task2.method("Python","Java");
        task2.method("Java","Python","c++");
    }
}
