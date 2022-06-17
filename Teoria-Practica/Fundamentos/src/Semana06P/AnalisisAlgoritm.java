package Semana06P;

public class AnalisisAlgoritm {
    public static void main(String[] args) {
        final int M = 10000000;
        int[] v = new int[M];
        int[] c = new int[M];
        long k1, k2;

        entrada(v);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        Algoritm.radixSort(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación RadixSort: "
                + (k2 - k1));
        // mostrarArreglo(v);
        // mostrarArreglo(c);

    }

    public static void entrada(int[] w) {
        int SUP = 9999;
        for (int i = 0; i < w.length; i++) {
            w[i] = (int) (Math.random() * SUP + 1);
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "] ");
        }
        System.out.println();

    }
}
