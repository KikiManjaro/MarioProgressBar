package manjaro.mpb;

public enum MBCharacter {

    MARIO(Icons.MARIO),
    LUIGI(Icons.LUIGI);

    private final ScaledGifIcon icon;

    MBCharacter(ScaledGifIcon icon) {
        this.icon = icon;
    }

    public String getDisplayName() {
        return icon.getDescription();
    }
    public ScaledGifIcon getIcon() {
        return icon;
    }

}