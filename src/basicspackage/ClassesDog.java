package basicspackage;

public class ClassesDog extends ClassesAnimal {    //  Inheritance from Animal class

    private int weight = 2; //  Private access modifier, variable is available inside the class

    public int getWeight() {    //  Getter method Alt+Insert -> Getter
        return weight;
    }

    public void setWeight(int weight) { //  Getter method Alt + Insert -> Setter
        this.weight = weight;
    }

    public void sit() {
        System.out.println("I'm sitting");
        var = 20;   //  public variable is available in inherited class
        //var2 = 20;   //  public variable isn't available in inherited class
        var3 = 20;   //  protected variable is available in inherited class
        var4 = 20;   //  protected variable is available in inherited class
    }

    public void lay() {
        System.out.println("I'm laying");
    }
}
