package singleton;

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Foo");
        Singleton anotherSingleton = Singleton.getInstance("Bar");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}