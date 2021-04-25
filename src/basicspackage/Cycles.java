package basicspackage;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("Start of program 1");
        for (int i = 0; i < 5; i++) {
            System.out.println(i * 10);
        }
        System.out.println("End of program 1");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int[] array = new int[10];

        System.out.println();
        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("Element with index " + i + " is: " + array[i]);
        }

        System.out.println();
        for (int element : array) { //  enumeration of values
            System.out.println(element);
        }

        System.out.println();   //  check comes before action
        int i = 0;
        while (i < 10) {
            System.out.println("While: " + i);
            i++;
        }

        i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }

        i = 0;
        do {   //  action comes before check
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);

    }
}
