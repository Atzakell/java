package Semana06P;

import java.util.ArrayList;

public class Algoritm {

    public static void radixSort(int[] arr) {
        int digit = getMaxDigit(arr); // obtiene el número máximo de dígitos
        for (int i = 0; i < digit; i++) {
            bucketSort(arr, i); // ordena bucketSort por dígitos veces
        }
    }

    public static int getMaxDigit(int[] arr) {
        int digit = 1; // el valor predeterminado es solo un dígito
        int base = 10; // Cada dígito adicional en decimal significa que su valor es 10 veces mayor
        for (int i : arr) {
            while (i > base) {
                digit++;
                base *= 10;
            }
        }
        return digit;
    }

    public static void bucketSort(int[] arr, int digit) {
        int base = (int) Math.pow(10, digit);
        // init buckets
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++) {// Solo hay diez números del 0 al 9, así que prepara diez cubos
            buckets.add(new ArrayList<Integer>());
        }
        // sort
        for (int i : arr) {
            int index = i / base % 10;
            buckets.get(index).add(i);
        }
        // output: copy back to arr
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int i : bucket) {
                arr[index++] = i;
            }
        }
    }
}
