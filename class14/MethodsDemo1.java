package class14;

public class MethodsDemo1 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 45, 50};
        int sum = 0;
        for (int number : arr1) {
            sum += number;
            //System.out.println(arr1.toString(arr1));
        }
        System.out.println(sum);
        int[] arr2 = {10, 20, 30, 25, 30};
        int sum2 = 0;
        for (int number : arr2) {
            sum2+= number;
        }
        System.out.println(sum2);
    }
}