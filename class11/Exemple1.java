package class11;

public class Exemple1 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}};
        //write a loop to print all the elements from this 2d array
        //matrix.length tells us how many 1d arrays are present in this 2d array
        for (int i = 0; i < matrix.length; i++) {
            //matrix[i].length the size of each 1d array

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0)
                    System.out.print(matrix[i][j] + " ");
            }
            // foreach loop to print all the numbers from a 2d array
            for (int[] arr : matrix) {
                for (int number : arr) {

                        System.out.println(number + " ");
                    }

                }
                System.out.println();
            }
        }
    }
