package academy.arimatea.maratonajava.introduction;

public class Aula08MultidimensionalArrays02 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        int[][] arrayInt = new int[4][0];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = array;
        arrayInt[3] = new int[5];

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] baseArray : arrayInt2) {
            System.out.println("\n--------");
            for (int num : baseArray) {
                System.out.print(num + "  ");
            }
        }
    }
}
