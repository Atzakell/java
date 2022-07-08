package Parcial_Analisis;

//!PROBLEMA 1 CORREA DE LA CRUZ YSAAC 
public class MaxNumber {

    // ? Sugerencia
    static int maximo(int Array[]) {
        return (maximo(Array, 0)); // cero es la posicion
    }

    static int maximo(int Array[], int index) {
        int res;
        if (index == Array.length - 1) // caso base: index indica el último elemento del Array
                                       // en este caso este será el máximo
            res = Array[index];
        else {
            int var;
            var = maximo(Array, index + 1); // a var se le asigna el mayor desde la posición index+1 hasta el último
                                            // elemento
            if (Array[index] > var) // si Array[index] es mayor que var
                res = Array[index]; // Array[index] será el mayor
            else
                res = var; // por contraparte var será el valor que devuelve la funcion
        }
        return (res);
    }

    public static void main(String[] args) {
        int numeros[];
        int max;

        // Declaramos un Array de 20 elementos
        numeros = new int[15];
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = (int) (Math.random() * 1000 + 1); // ciclamos con un for y asignamos valores random

        System.out.println("Elementos entre 1 y 1000 :D");
        for (int i = 0; i < numeros.length; i++) // Imprimimos mediante un for el Array
            System.out.print("[" + numeros[i] + "] ");

        max = maximo(numeros); // asignamos a max la funcion recursiva
        System.out.println("\n\nEl máximo es: " + max);// imprimimos el resultado
    }
}