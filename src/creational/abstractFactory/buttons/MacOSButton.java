package creational.abstractFactory.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Make MacOS Button");
    }
}
