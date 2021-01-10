package lessons;

import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {


//      //Задание 1
        int[] array = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
            System.out.print(array[i] + " ");
        }
        System.out.println("\r\n");

        //Задание 2
        int[] arr2 = new int[8];
        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        for (int a : arr2) System.out.print(a + " ");
        System.out.println("\r\n");

        //Задание 3
        int[]array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] = array3[i]*2;
            System.out.print(array3[i] + " ");
        }

        System.out.println("\r\n");


        //Задание 4
        int[][] array4 = new int[5][5];
        for (int i = 0; i < array4.length; i++) {
            for (int x = 0, j2 = array4[i].length; x < array4[i].length; x++, j2--) {
                if (i == x || i == (j2 - 1)) array4[i][x] = 1;
                System.out.print(array4[i][x] + " ");
            }

            System.out.println("\r\n");
        }

        // Задание 5
        int[] array5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = array5[0], max = array5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > max) {
                max = array5[i];
                indMax = i;
            }
            if (array5[i] < min) {
                min = array5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится под индексом " + indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент находится под индексом " + indMin + " со значением  = " + min);

    }

    // Задание 7
    private static boolean checkBalance(int[] arrParam) {
        int lSum, rSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }

            if (lSum == rSum) return true;
        }
        return false;
    }

}







