package creational.factoryMethod;

import creational.factoryMethod.Aliens.Alien;
import creational.factoryMethod.Aliens.Grey;

public class UfoDetect extends Detect{
    @Override
    protected Alien meetAlien() {
        return new Grey();
    }
}
