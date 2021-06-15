package com.sorting;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 25, 35, 15, 7, 55, 10, 22, -5 };

        for (int j = intArray.length - 1; j > 0;
             j--) {
            for (int i = 0; i < j; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "\t");
        }

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
