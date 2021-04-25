package basicspackage;

public class ClassesConstructorsStatic {    //  Alt + Insert -> Constructor
    public static void main(String[] args) {
        /*create the object of class:
        'ClassesCar' - name of class,
        'car1' - name of object,
        'new ClassesCar()' - object of 'ClassesCar' class.*/
        ClassesCar car1 = new ClassesCar(); //  Each time new object created, "public ClassesCar()" class constructor will be executed
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        ClassesCar car2 = new ClassesCar();
        car2.color = "White";
        ClassesCar car3 = new ClassesCar();
        car3.color = "Red";

        car2.drive(100);
        car2.drive(150);

        ClassesCar car4 = new ClassesCar("Black");  // During car object creation the color of new car should be specified
        System.out.println("The color of car is: " + car4.color);

        ClassesCar car5 = new ClassesCar("Red", 2100, 2000, 5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);

        System.out.println();
        System.out.println(ClassesCar.var); //  call static variable or method via class name, no need to create the object of class
        ClassesCar.var = 100;
        System.out.println(car1.var);   //  change of static variable causes the change of variable in all classes
        System.out.println(car2.var);
        System.out.println(car3.var);

        ClassesCar.method();    //  Call static method, no need to create the object of class

        String.format("New %s is string", "string");
        //Math.sqrt();    //  'sqrt' is also a static method of 'Math' class
    }
}
