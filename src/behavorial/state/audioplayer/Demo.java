package behavorial.state.audioplayer;

import behavorial.state.audioplayer.ui.Player;
import behavorial.state.audioplayer.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
