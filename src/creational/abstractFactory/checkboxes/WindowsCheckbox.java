package creational.abstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Create Windows checkbox.");
    }
}
