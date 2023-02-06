package FactoryMethod;

import FactoryMethod.Aliens.Alien;
import FactoryMethod.Aliens.Xenomorph;

public class XenoDetect extends Detect{
    @Override
    protected Alien meetAlien() {
        return new Xenomorph();
    }
}
