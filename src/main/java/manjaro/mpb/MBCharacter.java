package manjaro.mpb;

import javax.swing.*;

public enum MBCharacter {

    MARIO(Icons.MARIO),
    LUIGI(Icons.LUIGI);

    private final ImageIcon icon;

    MBCharacter(ImageIcon icon) {
        this.icon = icon;
    }

    public String getDisplayName() {
        return icon.getDescription();
    }
    public ImageIcon getIcon() {
        return icon;
    }

}