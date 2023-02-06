import FactoryMethod.Aliens.Alien;
import FactoryMethod.Aliens.Grey;
import FactoryMethod.Aliens.Xenomorph;

import java.time.LocalDate;

public class Main {
    private static Alien alien;
    public static void main(String[] args) {
        detection();
        meetAlien();
    }

    private static void detection() {
        if(LocalDate.now().getDayOfMonth() % 2 == 0) {
            alien = new Grey();
        } else {
            alien = new Xenomorph();
        }
    }

    private static void meetAlien() {
        alien.sayHello();
    }
}