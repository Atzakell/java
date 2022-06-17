package Semana06;

public class UsoOrdenamiento {

        public static void main(String[] args) {
                final int M = 500000;
                int[] v = new int[M];
                int[] c = new int[M];
                long k1, k2;

                entrada(v);

                System.arraycopy(v, 0, c, 0, v.length);
                k1 = System.currentTimeMillis();
                Optimizacion.ordBurbuja(c);
                k2 = System.currentTimeMillis();
                System.out.println("\nTiempo ordenación Burbuja: "
                                + (k2 - k1));
                // mostrarArreglo(v);
                // mostrarArreglo(c);

                System.arraycopy(v, 0, c, 0, v.length);
                k1 = System.currentTimeMillis();
                Optimizacion.ordSeleccion(c);
                k2 = System.currentTimeMillis();
                System.out.println("\nTiempo ordenación por seleccion: "
                                + (k2 - k1));
                // mostrarArreglo(v);
                // mostrarArreglo(c);

                System.arraycopy(v, 0, c, 0, v.length);
                k1 = System.currentTimeMillis();
                Optimizacion.ordInsercion(c);
                k2 = System.currentTimeMillis();
                System.out.println("\nTiempo ordenación por inserción: "
                                + (k2 - k1));
                // mostrarArreglo(v);
                // mostrarArreglo(c);

                System.arraycopy(v, 0, c, 0, v.length);
                k1 = System.currentTimeMillis();
                Optimizacion.heapsort(c);
                k2 = System.currentTimeMillis();
                System.out.println("\nTiempo ordenación por heapsort: "
                                + (k2 - k1));
                // mostrarArreglo(v);
                // mostrarArreglo(c);

                System.arraycopy(v, 0, c, 0, v.length);
                k1 = System.currentTimeMillis();
                Optimizacion.quicksort(c);
                k2 = System.currentTimeMillis();
                System.out.println("\nTiempo ordenación quicksort: "
                                + (k2 - k1));
                // mostrarArreglo(v);
                // mostrarArreglo(c);

                System.arraycopy(v, 0, c, 0, v.length);
                k1 = System.currentTimeMillis();
                Optimizacion.mergesort(c);
                k2 = System.currentTimeMillis();
                System.out.println("\nTiempo ordenación mergesort: "
                                + (k2 - k1));
                // mostrarArreglo(v);
                // mostrarArreglo(c);

                System.arraycopy(v, 0, c, 0, v.length);
                k1 = System.currentTimeMillis();
                Optimizacion.ordenacionShell(c);
                k2 = System.currentTimeMillis();
                System.out.println("\nTiempo ordenación shell: "
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