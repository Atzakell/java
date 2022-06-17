package Semana06P;

import java.util.*;

class GFG {

    static void countSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Driver code
    public static void main(String[] args) {
        Random random = new Random();
        // the number of elements to be randomly generate
        final int N = 10000000;
        long k1, k2;
        // creating an array of randomly generated numbers (N)
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            // generates random numbers within specified range i.e. 40
            array[i] = Math.abs(random.nextInt(5000));

        System.out.println("\nSorted Array: ");
        // prints sorted array
        k1 = System.currentTimeMillis();
        countSort(array);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación CountingSort: "
                + (k2 - k1));
    }
}
