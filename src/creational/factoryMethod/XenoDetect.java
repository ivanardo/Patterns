package creational.factoryMethod;

import creational.factoryMethod.Aliens.Alien;
import creational.factoryMethod.Aliens.Xenomorph;

public class XenoDetect extends Detect{
    @Override
    protected Alien meetAlien() {
        return new Xenomorph();
    }
}
