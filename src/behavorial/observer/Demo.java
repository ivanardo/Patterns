package behavorial.observer;


import behavorial.observer.editor.Editor;
import behavorial.observer.listeners.EmailNotificationListener;
import behavorial.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        editor.openFile("text.txt");
        try {
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
