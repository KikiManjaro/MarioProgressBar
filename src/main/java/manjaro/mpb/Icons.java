package manjaro.mpb;

import javax.swing.*;
import java.util.Objects;

public interface Icons {
    ImageIcon MARIO = createIcon("/mario.gif", "Mario");
    ImageIcon LUIGI = createIcon("/luigi.gif", "Luigi");
    ImageIcon SHELL = createIcon("/shell.gif", "Shell");

    static ImageIcon createIcon(String path, String description) {
        java.net.URL url = Icons.class.getResource(path);
        Objects.requireNonNull(url, "Resource not found: " + path);
        return description != null ? new ImageIcon(url, description) : new ImageIcon(url);
    }

    static ImageIcon createIcon(String path) {
        return createIcon(path, null);
    }
}
