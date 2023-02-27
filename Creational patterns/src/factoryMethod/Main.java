package factoryMethod;

import factoryMethod.Aliens.Alien;
import factoryMethod.Aliens.Grey;
import factoryMethod.Aliens.Xenomorph;

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