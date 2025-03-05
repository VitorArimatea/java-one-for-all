package academy.arimatea.javaoneforall.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            System.out.println("Success");
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void maybeThrowException() throws SQLException, FileNotFoundException {

    }
}
