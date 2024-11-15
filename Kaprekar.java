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
}
