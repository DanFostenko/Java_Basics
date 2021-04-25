package basicspackage;

public class Exceptions {
    public static void main(String[] args) {
        divide(10, 2);
        divide(10, 0);


        try {   //  Ctrl+Alt+T - Surround with try / catch / finally
            divideThrow(10, 2);
            divideThrow(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println();
        }

        divideThrow(10, 0);
    }

    public static void divide(int a, int b) {
        try {
            System.out.println("Result is: " + a / b);
        } catch (ArithmeticException e) { //  catches arithmetic exception
            //  e.printStackTrace();    //  shows exception and halts program execution
            System.out.println("Problem occurred");
        } catch (ArrayIndexOutOfBoundsException e) { //  catches index exception
            System.out.println("Problem with index occurred");
        } finally {   //  code which will be executed anyway
            System.out.println("Finish");
        }
    }

    public static void divideThrow(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result is: " + a / b);
    }
}
