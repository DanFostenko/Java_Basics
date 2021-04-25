package basicspackage;

public class Strings {
    public static void main(String[] args) {

        String s = "Hello World!";   //  Ctrl + click on String
        // a == "String"; forbidden to compare
        System.out.println(s.equals("Hello World!"));
        System.out.println(s.equals("Hello!"));

        String s2 = "hello";
        System.out.println(s.equals(s2));
        s = "test";
        s2 = "TEXT";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(1));    //  index of character
        System.out.println(s.indexOf("Xt"));    //  index of part of string

        s = "Hello World!";
        System.out.println(s.contains("Hello"));    //  Method to verify whether the string contains part of string
        System.out.println(s.contains("text"));
        System.out.println(s.length());

        System.out.println();
        System.out.println(s.startsWith("He"));
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He"));
        System.out.println(s.endsWith("!"));

        s = "hello,world";
        System.out.println();
        String[] array = s.split(",");  //  ',' is separator to separate the string
        System.out.println(array[0] + "!" + array[1] + "!");
        System.out.println(array[0]);
        System.out.println(array[1]);

        String str = "My name is %s. I'm %d years old.";    //  Template. %s - string will be placed, %d - whole number will be placed.
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age));  //  Call method 'format' via 'String' class to insert vars
        System.out.println(String.format(str, "Vasya", 10));

        System.out.println();
        String age2 = "30";
        int a = Integer.parseInt(age2); //  convert string age2 to number and record in var a
        System.out.println(a * 3);  //  now can work with int

        s = "Hello, world!";
        System.out.printf(s.substring(1, 5));   //  Cut string from to
        System.out.println(s.substring(7)); //  Cut string from index 7 till end
        System.out.println(s.substring(7, s.length() - 2)); //  Cut string from index 7 till penultimate char

        String s1 = "Hello";
        s2 = "world";
        String s3 = "!";
        String res;
        res = s1 + s2 + s3;  //  Concatenation
        System.out.println(res);

        res = s1.concat(s2).concat(s3);  //  Faster concatenation is preferable
        System.out.println(res);

    }
}
