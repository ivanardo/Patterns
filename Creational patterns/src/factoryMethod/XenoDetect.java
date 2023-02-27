package factoryMethod;

import factoryMethod.Aliens.Alien;
import factoryMethod.Aliens.Xenomorph;

public class XenoDetect extends Detect{
    @Override
    protected Alien meetAlien() {
        return new Xenomorph();
    }
}
