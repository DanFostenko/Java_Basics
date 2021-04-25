package basicspackage;
/*https://coursehunter.net/course/selenium-webdriver-java-dlya-nachinayushchih
install JDK, Maven, IntelliJ IDEA Community Edition, system environment variables*/

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //  sout+Tab
        System.out.print("Same ");
        System.out.println("line.");

        byte a = 5; //  -128..127
        short b = -100; //  -32768..32767
        int c;  //  -2147483648..2147483647
        c = 10000000;
        long d = -122335544;    //  -9223372036854775808..9223372036854775807

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("integer c: " + c);
        System.out.println("long d: " + d);

        double double1 = 133.155;
        System.out.println();
        System.out.println("double double1: " + double1);
        float float1 = 150.32f;
        System.out.println("float float1: " + float1);

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println("boolean boolean1: " + boolean1);
        System.out.println("boolean boolean2: " + boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println("boolean boolean3: " + boolean3);
        System.out.println("boolean boolean4: " + boolean4);

        String str = "Hello";
        String str2 = "World!";
        String str3 = str + " " + str2;
        System.out.println();
        System.out.println(str3);

        char char1 = 'a';
        System.out.println(char1);

        String personalname;
        int age;

    }
}
