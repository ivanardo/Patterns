package creational.factoryMethod2.factory;

import creational.factoryMethod2.buttons.Button;
import creational.factoryMethod2.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
