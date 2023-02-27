package factoryMethod2.factory;

import factoryMethod2.buttons.Button;
import factoryMethod2.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
