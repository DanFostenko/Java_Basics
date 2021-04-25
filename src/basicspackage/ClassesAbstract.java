package basicspackage;

public abstract class ClassesAbstract { //  Abstract class can't be created but can be inherited
    public abstract void saySmth();    //  Abstract methods have description but don't have a body

    public abstract void eat(); //  classes which inherited from abstract class will use its methods

    public void walk(String place) {    //  run method in ClassesInheritancePolymorphism class
        System.out.println("I'm walking here: " + place);
    }
}
