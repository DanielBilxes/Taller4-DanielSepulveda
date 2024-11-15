package cl.ufro.dci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Kaprekar {

    @Test
    public void testKaprekarOperation1() {
        Kaprekar kaprekar = new Kaprekar();  // Instanciamos el objeto de la clase Kaprekar
        // Prueba con el número 3524 (debe devolver 3087)
        Assertions.assertEquals(3087, kaprekar.kaprekarOp(3524));
    }

    @Test
    public void testKaprekarOperation2() {
        Kaprekar kaprekar = new Kaprekar();  // Instanciamos el objeto de la clase Kaprekar
        // Prueba con el número 1000 (debe devolver 999)
        Assertions.assertEquals(999, kaprekar.kaprekarOp(1000));
    }

    @Test
    public void testKaprekarOperation3() {
        Kaprekar kaprekar = new Kaprekar();  // Instanciamos el objeto de la clase Kaprekar
        // Prueba con el número 5200 (debe devolver 5175)
        Assertions.assertEquals(5175, kaprekar.kaprekarOp(5200));
    }

    @Test
    public void testKaprekarOperation4() {
        Kaprekar kaprekar = new Kaprekar();  // Instanciamos el objeto de la clase Kaprekar
        // Prueba con el número 2111 (debe devolver 999)
        Assertions.assertEquals(999, kaprekar.kaprekarOp(2111));
    }

    @Test
    public void testIterationsToKaprekarConstant1() {
        Kaprekar kaprekar = new Kaprekar();  // Instanciamos el objeto de la clase Kaprekar
        // Prueba con el número 3524 (llega a 6174 en 3 iteraciones)
        Assertions.assertEquals(3, kaprekar.itKaprekar(3524));
    }

    @Test
    public void testIterationsToKaprekarConstant2() {
        Kaprekar kaprekar = new Kaprekar();  // Instanciamos el objeto de la clase Kaprekar
        // Prueba con el número 5200 (llega a 6174 en 7 iteraciones)
        Assertions.assertEquals(7, kaprekar.itKaprekar(5200));
    }
}
