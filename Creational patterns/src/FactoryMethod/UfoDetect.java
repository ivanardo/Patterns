package FactoryMethod;

import FactoryMethod.Aliens.Alien;
import FactoryMethod.Aliens.Grey;

public class UfoDetect extends Detect{
    @Override
    protected Alien meetAlien() {
        return new Grey();
    }
}
