package academy.arimatea.javaoneforall.introduction;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5,6,7};
        int[] numbers3 = new int[] {80,12,10,40};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        for (int num : numbers3) {
            System.out.println(num);
        }
    }
}
