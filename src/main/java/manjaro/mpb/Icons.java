package manjaro.mpb;

public interface Icons {
    ScaledGifIcon MARIO = new ScaledGifIcon(Icons.class.getResource("/mario.gif"), "Mario");

    ScaledGifIcon LUIGI = new ScaledGifIcon(Icons.class.getResource("/luigi.gif"), "Luigi");

    ScaledGifIcon SHELL = new ScaledGifIcon(Icons.class.getResource("/shell.gif"), "Shell");
}
