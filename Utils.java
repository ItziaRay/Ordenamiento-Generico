/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uv.fiee.iinf.paradigmas.code;

/**
 *
 * @author itzia
 */
public class Utils {

    // Método genérico estático restringido a tipos numéricos
    public static <T extends Number & Comparable<T>> T[] ordena(T[] vector) {

        // Creamos una copia para no modificar el original
        T[] copia = vector.clone();

        quickSort(copia, 0, copia.length - 1);

        return copia;
    }

    // Método QuickSort
    private static <T extends Comparable<T>> void quickSort(T[] arr, int inicio, int fin) {

        if (inicio < fin) {

            int pivoteIndex = particion(arr, inicio, fin);

            quickSort(arr, inicio, pivoteIndex - 1);
            quickSort(arr, pivoteIndex + 1, fin);
        }
    }

    // Método de partición
    private static <T extends Comparable<T>> int particion(T[] arr, int inicio, int fin) {

        T pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {

            if (arr[j].compareTo(pivote) <= 0) {
                i++;

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }

    // Método imprimir (genérico opcional)
    public static <T> void imprimir(T[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
