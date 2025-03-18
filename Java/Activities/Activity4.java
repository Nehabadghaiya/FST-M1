package fst;

import java.util.Arrays;

public class Insertionsortactivity {
    public static void main(String[] array) {
        int[] data = { 8, 6, 2, 9, 1 };

        System.out.println("Original Array : " + Arrays.toString(data));
        insertionSort(data);
        System.out.println("Final Sorted Array in Ascending Order: " + Arrays.toString(data));

    }

    public static void insertionSort(int[] test) {
        int i, arraysize=test.length;

        for (i=0; i < arraysize-1; i++) {
            int key = test[i+1];
            int j = i;

            while (j >= 0 && key < test[j]) {
                test[j+1] = test[j];
                --j;
            }
            test[j+1] = key;
            System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(test));
        }
    }

}