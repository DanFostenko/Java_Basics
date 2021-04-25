package basicspackage;

public class ClassesCar {

    static int var = 10;    //  static modifier allows to store single method and variable in class
    final static int var2 = 10; //  variable or method cannot be changed

    static void method() {
        System.out.println("Static method.");
    }

    public ClassesCar() {
        /*Class constructor.
        Constructor is the method which is called during creating of object of class
        The name of constructor is the the same as the name of class
        Parameters which are taken to create an object are specified in brackets*/
        System.out.println("New car created");
    }

    public ClassesCar(String color) {   //  Class constructor is reloaded
        this.color = color; //  color var will be assigned by default when new object of ClassesCar created
    }

    public ClassesCar(String color, int height, int width, int length) {   //  when method is called with color, height, width, length parameters
        this.color = color; //  color var will be assigned by default when new object of ClassesCar created
        this.height = height;
        this.width = width;
        this.length = length;
    }

    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight) { //  method can't be static because of 'this' pointer
        this.weight += weight;    //  point on var by 'this'
        System.out.println("New weight: " + this.weight);
    }

    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("Car is driving");
        } else {
            System.out.println("Cannot drive");
        }

    }
}
