package factoryMethod;

import factoryMethod.Aliens.Alien;

public abstract class Detect {
    public void meeting() {
        Alien alien = meetAlien();
        alien.sayHello();
    }

    protected abstract Alien meetAlien();
}
