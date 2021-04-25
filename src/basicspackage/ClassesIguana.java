package basicspackage;

//  run methods in ClassesInheritancePolymorphism class
public class ClassesIguana extends ClassesAbstract {
    @Override
    public void saySmth() {
        System.out.println("Hello");
    }

    @Override
    public void eat() {
        System.out.println("Eat an egg");
    }

    public void run() { //  Own method
        System.out.println("Running mode");
    }
}
