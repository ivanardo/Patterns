package factoryMethod;

import factoryMethod.Aliens.Alien;
import factoryMethod.Aliens.Grey;

public class UfoDetect extends Detect{
    @Override
    protected Alien meetAlien() {
        return new Grey();
    }
}
