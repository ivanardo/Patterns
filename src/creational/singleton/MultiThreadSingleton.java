package singleton;

public final class MultiThreadSingleton {
    private static volatile MultiThreadSingleton instance;
    public String value;

    private MultiThreadSingleton(String value) {
        this.value = value;
    }

    public static MultiThreadSingleton getInstance(String value) {
        // Техника, которую мы здесь применяем называется «блокировка с двойной
        // проверкой» (Double-Checked Locking). Она применяется, чтобы
        // предотвратить создание нескольких объектов-одиночек, если метод будет
        // вызван из нескольких потоков одновременно.
        //
        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        //
        // Больше об этой проблеме можно почитать здесь:
        // https://refactoring.guru/ru/java-dcl-issue

        MultiThreadSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (MultiThreadSingleton.class) {
            if (instance == null) {
                instance = new MultiThreadSingleton(value);
            }
            return instance;
        }
    }
}

class DemoMultiThread {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new Runnable() {
            @Override
            public void run() {
                MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("Foo");
                System.out.println(singleton.value);
            }
        });
        Thread threadBar = new Thread(new Runnable() {
            @Override
            public void run() {
                MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("Bar");
                System.out.println(singleton.value);
            }
        });

        threadFoo.start();
        threadBar.start();
    }
}
