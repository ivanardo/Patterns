package factoryMethod2.factory;

import factoryMethod2.buttons.Button;
import factoryMethod2.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
