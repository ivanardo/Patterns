package creational.factoryMethod.Aliens;

public class Xenomorph implements Alien{
    @Override
    public void action() {
        System.out.println("OMOMOM");
    }

    @Override
    public void sayHello() {
        System.out.println("KTRRR TRRRRR");
        action();
    }
}
