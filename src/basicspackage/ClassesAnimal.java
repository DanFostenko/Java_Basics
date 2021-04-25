package basicspackage;

public class ClassesAnimal {
    protected String name;  //  Protected modifier, variable is available inside the package
    protected String color; //  Protected modifier, variable is available inside the package

    public int var; //  Public access modifier, variable is available in all over the program
    private int var2; //  Private access modifier, variable is available inside the class
    protected int var3;    //  Protected modifier, variable is available inside the package, except external package is inherited
    int var4;   //  Package modifier, variable visibility is restricted by package

    public void walk(String place) {
        System.out.println("We are walking here: " + place);
        var = 10;   //  public variable is available inside the class
        var2 = 10;   //  private variable is available inside the class
        var3 = 10;   //  protected variable is available inside the class
    }

    public void sleep() {
        System.out.println("Zzzz");
    }

    public void sound() {
        System.out.println("Hello!");
    }
}
