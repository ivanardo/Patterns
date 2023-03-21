package creational.factoryMethod;

import creational.factoryMethod.Aliens.Alien;

public abstract class Detect {
    public void meeting() {
        Alien alien = meetAlien();
        alien.sayHello();
    }

    protected abstract Alien meetAlien();
}
