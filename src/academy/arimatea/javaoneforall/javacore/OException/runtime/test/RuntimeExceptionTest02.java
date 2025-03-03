package academy.arimatea.javaoneforall.javacore.OException.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            int divResult = division(20, 0);
            System.out.println("Resultado da divisão: " + divResult);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Código executado, pós tratamento de exception");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException
     */

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido, um número não pode ser dividido por zero");
        }

        return a / b;
    }
}
