package basicspackage;

//  One class can be inherited but various interfaces can be executed
public class InterfacesCar implements InterfacesTransport, InterfacesTest {

    @Override
    public void go() {
        System.out.println("We are driving");
    }

    @Override
    public void stop() {
        System.out.println("We stopped");
    }

    @Override
    public void method1() {
        System.out.println("Test1");
    }

    @Override
    public void method2() {
        System.out.println("Test2");
    }
}
