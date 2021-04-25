package basicspackage;

public class ClassesCat extends ClassesAnimal {

    public void feed(String feed) {
        System.out.println("I like: " + feed);
    }

    @Override   //  override the method from general class
    public void sound() {
        System.out.println("Mew mew mew!");
    }
}
