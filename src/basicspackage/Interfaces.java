package basicspackage;

public class Interfaces {
    public static void main(String[] args) {
        InterfacesCar car = new InterfacesCar();
        InterfacesPlane plane = new InterfacesPlane();

        car.go();   //  Method from InterfacesTransport interface, InterfacesTest
        car.stop(); //  Method from InterfacesTransport interface
        car.method1();  //  Method from InterfacesTest interface
        car.method2();  //  Method from InterfacesTest interface

        plane.go();
        plane.stop();
        plane.setSpeed(500);
    }
}
