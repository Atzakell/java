package Semana06;

public class Optimizacion {

    public static void ordBurbuja(int a[]) {
        int i, j;
        int n = a.length;
        // bucle externo controla la cantidad de pasadas
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // elementos desordenados, se intercambian
                    intercambiar(a, j, j + 1);
                }
            }
        }
    }

    public static void ordSeleccion(int a[]) {
        int indiceMenor, i, j, n;
        n = a.length;
        // ordenar a[0]..a[n-2] y a[n-1] en cada pasada
        for (i = 0; i < n - 1; i++) {
            // comienzo de la exploración en índice i
            indiceMenor = i;
            // j explora la sublista a[i+1]..a[n-1]
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // sitúa el elemento mas pequeño en a[i]
            if (i != indiceMenor) {
                intercambiar(a, i, indiceMenor);
            }
        }
    }

    public static void ordInsercion(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {
            /*
             * indice j es para explorar la sublista a[i-1]..a[0]
             * buscando la posicion correcta del elemento destino
             */
            j = i;
            aux = a[i];
            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {
                // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }

    public static void heapsort(int a[]) {
        insertamonticulo(a);
        eliminamonticulo(a);
    }

    public static void insertamonticulo(int[] a) {
        int i, j;
        int aux;
        boolean band;
        for (i = 1; i <= a.length - 1; i++) {
            j = i;
            band = true;
            while (j > 0 && band == true) {
                band = false;
                if (a[j] > a[j / 2]) {
                    aux = a[j / 2];
                    a[j / 2] = a[j];
                    a[j] = aux;
                    j = j / 2;
                    band = true;
                }
            }
        }

    }

    public static void eliminamonticulo(int[] a) {
        int i, j;
        int aux, izq, der, ap, mayor;
        boolean bool;
        for (i = a.length - 1; i > 0; i--) {
            aux = a[i];
            a[i] = a[0];
            izq = 1;
            der = 2;
            j = 0;
            bool = true;
            while ((izq < i) && (bool == true)) {
                mayor = a[izq];
                ap = izq;
                if (mayor < a[der] && der != i) {
                    mayor = a[der];
                    ap = der;
                }
                if (aux < mayor) {
                    a[j] = a[ap];
                    j = ap;
                } else {
                    bool = false;
                }
                izq = j * 2;
                der = izq + 1;
            }
            a[j] = aux;
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void quicksort(int a[]) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int a[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quicksort(a, primero, j); // mismo proceso con sublista izqda
        }
        if (i < ultimo) {
            quicksort(a, i, ultimo); // mismo proceso con sublista drcha
        }
    }

    public static void mergesort(int a[]) {
        mergesort(a, 0, a.length - 1);
    }

    public static void mergesort(int[] a, int primero, int ultimo) {
        int central;
        if (primero < ultimo) {
            central = (primero + ultimo) / 2;
            mergesort(a, primero, central);
            mergesort(a, central + 1, ultimo);
            mezcla(a, primero, central, ultimo);
        }
    }
    // mezcla de dos sublistas ordenadas

    public static void mezcla(int[] a, int izda, int medio, int drcha) {
        int[] tmp = new int[a.length];
        int i, k, z;
        i = z = izda;
        k = medio + 1;
        // bucle para la mezcla, utiliza tmp[] como array auxiliar
        while (i <= medio && k <= drcha) {
            if (a[i] <= a[k]) {
                tmp[z++] = a[i++];
            } else {
                tmp[z++] = a[k++];
            }
        }
        // se mueven elementos no mezclados de sublistas
        while (i <= medio) {
            tmp[z++] = a[i++];
        }
        while (k <= drcha) {
            tmp[z++] = a[k++];
        }
        // Copia de elementos de tmp[] al array a[]
        System.arraycopy(tmp, izda, a, izda, drcha - izda + 1);
    }

    public static void ordenacionShell(int a[]) {
        int intervalo, i, j, k;
        int n = a.length;

        intervalo = n / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < n; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (a[j] <= a[k]) {
                        j = -1; // par de elementos ordenado
                    } else {
                        intercambiar(a, j, j + 1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

}