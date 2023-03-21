package creational.factoryMethod2.factory;

import creational.factoryMethod2.buttons.Button;
import creational.factoryMethod2.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
