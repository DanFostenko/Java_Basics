package basicspackage;

public class MethodsOverloading {
    public static void main(String[] args) {    //  Methods overloading allows to use one method for variety of parameters

        int result;
        result = getSum(1, 10);
        System.out.println(result);
        result = getSum(5, 100, 66);
        System.out.println(result);

        sayHello("Petya");
        sayHello("Vasya", "Vanya");
        sayHello();

        int[] array = {1, 22, 52, 34, 16};
        int sum = getSum(array, "Oleg"); //  returned sum from method will be stored in this var
        System.out.println(sum + 100);

    }

    static int getSum(int x, int y) {
        int sum;    //  var is visible within the method only
        sum = x + y;
        return sum; //  method returns sum var of int type
    }

    static int getSum(int x, int y, int z) {    //  method with the same name can get more parameters, even of another types
        int sum;    //  var is visible within the method only
        sum = x + y + z;
        return sum; //  method returns sum var of int type
    }

    static int getSum(int[] array, String name) {    //  method gets array of values and string
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Hi " + name);
        System.out.println("Sum is: " + sum);
        return sum;
    }

    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("This method takes values of string types only");
    }

    static void sayHello(String name1, String name2) {  //  Overloaded method which takes 2 params
        System.out.println();
        System.out.println("Hello " + name1 + " and " + name2 + "!");
        System.out.println("This method is overloaded and it takes two values");
    }

    static void sayHello() { //  Overloaded method which takes no params
        System.out.println();
        System.out.println("Hello!");
        System.out.println("This method is overloaded and it takes no values");
    }
}
