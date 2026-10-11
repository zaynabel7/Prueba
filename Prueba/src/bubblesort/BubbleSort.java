package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numeros = {5, 2, 8, 1, 3};

        // Ordenamos el array
        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    // Intercambiamos los elementos
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        // Mostramos el array ordenado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
