package manjaro.mpb;

import javax.swing.*;

public enum MBCharacter {

    MARIO(Icons.MARIO),
    LUIGI(Icons.LUIGI);

    private final ImageIcon icon;

    MBCharacter(ImageIcon icon) {
        this.icon = icon;
    }

    public ImageIcon getIcon() {
        return icon;
    }

}