package academy.arimatea.javaoneforall.javacore.Pwrappers.test;

import java.util.List;

public class WrapperTest {
    public static void main(String[] args) {
        byte byteP = 127;
        short shortP = 32767;
        int intP = 100009234;
        long longP = 1823798921344143212L;
        float floatP = 1.4312F;
        double doubleP = 12830984078.1342;
        boolean booleanP = false;
        char charP = 'A';

        Byte byteW = 127;
        Short shortW = 32767;
        Integer intW = 100009234; // autoboxing
        Long longW = 1823798921344143212L;
        Float floatW = 1.4312F;
        Double doubleW = 12830984078.12;
        Boolean booleanW = false;
        Character charW = 'A';

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("10");
        boolean trueOrFalse = Boolean.parseBoolean("tRue");
        System.out.println(trueOrFalse);

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetterOrDigit('$'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('B'));
        System.out.println(Character.toUpperCase('b'));
        System.out.println(Character.toLowerCase('B'));
        System.out.println(Character.isWhitespace('a'));

        List<Double> numbers;
    }
}
