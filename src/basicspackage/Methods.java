package basicspackage;

public class Methods {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int sum;    //  own var within main method

        sum = getSum(a, b);  //  calls getSum method and assigns the returned value
        System.out.println(sum);
        sum = getSum(10, 150);
        System.out.println(sum);
        System.out.println(getSum(2, 11));

        showSum(10, 51, 77);
        showSum(5, 12, 14);

        saySmth();

        sayHello("Petya");
        String name = "Vasya";
        sayHello(name);

        showSumToPerson("Vasya", 15, 11, 33);

        boolean result = showBooleanResult(1, 22, 333);
        System.out.println(result);

    }

    /*static method because it is called from static main method
    type int as outgoing value
    type of vars and own vars which it gets are in brackets*/
    static int getSum(int x, int y) {
        int sum;    //  var is visible within the method only
        sum = x + y;
        return sum; //  method returns sum var of int type
    }

    static void showSum(int x, int y, int z) { //  Method of void type returns nothing
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
    }

    static void saySmth() { //  brackets are empty, method takes no values
        System.out.println();
        System.out.println("This method takes and returns nothing");
    }

    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("This method takes values of string types only");
    }

    static void showSumToPerson(String name, int a, int b, int c) {
        // call methods inside the method
        System.out.println("Start");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End");
    }

    static boolean showBooleanResult(int x, int y, int z) { //  Method of void type returns nothing
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
        return true;
    }

}
