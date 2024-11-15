package cl.ufro.dci;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Kaprekar {

    public int kaprekarOp(int number) {
        // Convertir a string y extraer los dígitos
        char[] digits = String.valueOf(number).toCharArray();

        // Ordenar en orden ascendente
        Arrays.sort(digits);
        String ascending = new String(digits);

        // Ordenar en orden descendente
        String descending = new StringBuilder(ascending).reverse().toString();

        // Convertir a enteros y realizar la resta
        return Integer.parseInt(descending) - Integer.parseInt(ascending);
    }
}

