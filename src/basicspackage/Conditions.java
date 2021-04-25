package basicspackage;

public class Conditions {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("Start of program 1");

        if (i > 5) {
            System.out.println("i > 5");
            i++;
            System.out.println(i);
        } else {
            System.out.println("i <= 5");
            i--;
            System.out.println(i);
        }

        System.out.println("End of program 1");

        i = 7;
        System.out.println("Start of program 2");

        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        } else if (i < 10 && i > 5) {

            System.out.println("i < 10 AND i > 5");
            i--;
            System.out.println(i);
        } else {
            System.out.println("Nothing");
        }

        System.out.println("End of program 2");

        System.out.println("Star of program 3");
        i = 100;
        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90) {
                System.out.println("i > 90");
            } else {
                System.out.println("i <= 90");
            }
        } else {
            System.out.println("i <= 50");
        }

        System.out.println("End of program 3");

        System.out.println("Start of program 4");
        i = 3;
        switch (i) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:    //  optional operator, like else
                System.out.println("Number is not identified");
        }
        System.out.println("End of program 4");
    }
}
