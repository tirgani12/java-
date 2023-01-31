package class6;

public class WhileLoop7 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 16) {
            if (num == 5 || num == 10 || num == 15) {
            } else {

                System.out.println(num);

            }
                num++;



        }
        System.out.println("*************");
        int num1=1;
        while (num1<=16){
            if (num1%5!=0){
                System.out.println(num1);
            }
            num1++;
        }
    }
}