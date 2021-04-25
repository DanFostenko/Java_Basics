package basicspackage;

//  One class can be inherited but various interfaces can be executed
public class InterfacesPlane implements InterfacesTransport {
    @Override
    public void go() {
        System.out.println("We are flying");
    }

    @Override
    public void stop() {
        System.out.println("We landed");
    }

    public void setSpeed(int speed) {   //  Own method
        System.out.println("Current speed is: " + speed);
    }
}
