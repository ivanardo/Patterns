package factoryMethod.Aliens;

public class Grey implements Alien{
    @Override
    public void action() {
        System.out.println("Sorry, but I need to take you to the experiments.");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, human!");
        action();
    }
}
