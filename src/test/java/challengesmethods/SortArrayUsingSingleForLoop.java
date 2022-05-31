package challengesmethods;

import java.util.Arrays;

public class SortArrayUsingSingleForLoop {
    public static void main(String[] args) {
        int[] arr = {9, 40, 30, 16, 80, 22};
        for (int i = 0; i < arr.length - 1; i++) {
            // if index 0 > then index +1 then swap the numbers
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                // if the index is greater and swapped compare the whole array again
                i = -1;
            }
        }
        System.out.print( Arrays.toString(arr));
    }
//    public static void main(String[] args) {
////        int[] arr = {9, 40, 30, 16, 80, 22};
//        int[] arr = {6, 5, 4, 3, 2, 1};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int sortArray : arr) {
//            System.out.println(sortArray);
//        }
//    }
}
