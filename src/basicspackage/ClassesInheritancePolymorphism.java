package basicspackage;

public class ClassesInheritancePolymorphism {
    public static void main(String[] args) {
        ClassesCat cat = new ClassesCat();
        ClassesDog dog = new ClassesDog();

        cat.name = "Vasya";
        dog.name = "Barsik";

        cat.color = "White";
        dog.color = "Black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat's name is " + cat.name);
        System.out.println("Dog's name is " + dog.name);

        dog.var = 10;   //  public variable is available through object
        //dog.var2 = 10;   //  private variable isn't available through object
        dog.var3 = 10;   //  protected variable is available through object
        dog.var4 = 10;   //  protected variable is available through object

        dog.getWeight(); //  access private variable through indirect getter&setter methods

        dog.sound();    //  Polymorphism. Same method but different results
        cat.sound();    //  Method 'sound' is overridden

        ClassesIguana iguana = new ClassesIguana();

        iguana.walk("Sand");
        iguana.run();
        iguana.saySmth();
        iguana.eat();

    }
}
