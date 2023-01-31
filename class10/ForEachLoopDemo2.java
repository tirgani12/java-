package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        int[] arr = {10, 13, 20, 25, 45, 50};
        arr[1] = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        int[] arr1 = {10, 13, 20, 25, 45, 50};

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                arr[j] = 0;
            }
        }
        System.out.println("after replacing all odd numbers");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}