package basicspackage;

public class Variables {
    public static void main(String[] args) {
        int a;
        a = 10;
        a = 20;
        System.out.println(a);

        int b = a;
        System.out.println(b);

        int c, d;
        c = d = b;

        System.out.println(c + " " + d);

        a = 13;
        b = 5;
        System.out.println();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        double e = 15;
        double f = 7;
        System.out.println();
        System.out.println(e / f);
        System.out.println(a % b);  // remainder of the division 13 % 5 == 3, two whole and three fifths

        a = b + c * d;
        System.out.println(a);

        a = (b + c) * d;
        System.out.println(a);

        a = 15;
        b = 10;
        System.out.println();
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a - 5 >= b);
        System.out.println(a - 5 <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a + 10 <= b + 15);   //  True
        System.out.println(!(a + 10 <= b + 15));    //  Negation operation. Not True, False
        System.out.println(!(false));
        int i = 0;
        i++;    //  Postfix increment. i = i + 1
        System.out.println(i);
        i--;    //  Postfix increment. i = i - 1
        System.out.println(i);

        i = 5;
        System.out.println(i);
        System.out.println(i++);    //  Print 5, then make the postfix operation
        System.out.println(i);

        i = 3;
        a = i++;
        System.out.println(a);

        i = 3;
        a = ++i;    //  Postfix notation
        System.out.println(a);

        a = 10;
        b = 20;
        System.out.println();
        System.out.println(a > b || a < b); //  OR logical operation. Returns true if at least one expression is true
        System.out.println(a > b || b > 30);    //  returns false
        System.out.println(a > b && a < b);    //  AND operation. Returns true if all expressions are true
        System.out.println(a > 9 && b == 20);   // True

        System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b)); // !(True || (True && True))
        System.out.println(!((a + 10 > 15 || b - 5 > 10) && a < b)); // !((True || True) && True))

        a = 9;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 3));

        a = 10;
        a = a + 5;
        System.out.println();
        System.out.println(a);

        a = 10;
        a += 5; //  a = a + 5
        System.out.println(a);
        a -= 5; //  a = a - 5
        System.out.println(a);
        a *= 2; //  a = a * 2
        System.out.println(a);
        a /= 2; //  a = a / 2
        System.out.println(a);
        a %= 3; //  a = a % 3
        System.out.println(a);

    }
}
