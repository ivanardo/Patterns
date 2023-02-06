package FactoryMethod;

import FactoryMethod.Aliens.Alien;

public abstract class Detect {
    public void meeting() {
        Alien alien = meetAlien();
        alien.sayHello();
    }

    protected abstract Alien meetAlien();
}
