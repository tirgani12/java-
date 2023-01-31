package class15;

public class MPractice4 {
    /* create a method that takes two numbers as parameters and
    return the larger number

     */
    int largerNumber(int  number1,int number2) {






        if (number1>number2){
            return number1;

        }else {
            return number2;

        }





    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.largerNumber(12,13));
    }
}