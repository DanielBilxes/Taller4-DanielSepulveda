package cl.ufro.dci;

import java.util.Arrays;

public class Kaprekar {

    /**
     * Realiza una operación de Kaprekar con un número de 4 dígitos.
     * Ordena los dígitos en orden descendente y ascendente y devuelve la resta.
     *
     * @param number Número de 4 dígitos a procesar.
     * @return Resultado de la operación de Kaprekar.
     */
    public int kaprekarOp(int number) {
        // Convertir a string y asegurar que tenga 4 dígitos (rellenar con ceros si es necesario)
        String numStr = String.format("%04d", number);

        // Convertir a un arreglo de caracteres para ordenar
        char[] digits = numStr.toCharArray();

        // Ordenar en orden ascendente
        Arrays.sort(digits);
        String ascending = new String(digits);

        // Ordenar en orden descendente
        String descending = new StringBuilder(ascending).reverse().toString();

        // Convertir a enteros y realizar la resta
        return Integer.parseInt(descending) - Integer.parseInt(ascending);
    }

    /**
     * Calcula el número de iteraciones necesarias para llegar a la constante de Kaprekar (6174).
     *
     * @param number Número de 4 dígitos a procesar.
     * @return Número de iteraciones hasta llegar a la constante 6174.
     */
    public int itKaprekar(int number) {
        int count = 0;

        // Asegurarse de que el número tenga 4 dígitos y no sea un número con todos los dígitos iguales (como 1111)
        if (number == 0 || number == 1111 || number == 2222 || number == 3333 || number == 4444 || number == 5555 ||
                number == 6666 || number == 7777 || number == 8888 || number == 9999) {
            return 0;
        }

        // Continuar realizando la operación de Kaprekar hasta llegar a 6174
        while (number != 6174) {
            number = kaprekarOp(number);
            count++;
        }
        return count;
    }
}
