package class19;

public class ConstructorChain {
    ConstructorChain(){
        System.out.println(" I am non argument constructor");
    }
    ConstructorChain(String str){
        this();// making a call to non argument constructor
               //this always must be on the first line
        System.out.println(str);
    }
    ConstructorChain(int number){
        this("hello");
        System.out.println("This is constructor with int parameter");
    }

    public static void main(String[] args) {
       ConstructorChain obj =new ConstructorChain(10);
        System.out.println("---End of the code----");
    }
}
