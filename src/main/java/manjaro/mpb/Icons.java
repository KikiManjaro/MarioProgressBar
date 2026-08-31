package manjaro.mpb;

import javax.swing.*;
import java.net.URL;
import java.util.Objects;

public interface Icons {
    ImageIcon MARIO = createIcon("/mario.gif", "Mario");
    ImageIcon LUIGI = createIcon("/luigi.gif", "Luigi");
    ImageIcon SHELL = createIcon("/shell.gif", "Shell");

    static ImageIcon createIcon(String path, String description) {
        URL resource = Icons.class.getResource(path);
        Objects.requireNonNull(resource, "Missing resource: " + path);
        return new ImageIcon(resource, description);
    }
}
