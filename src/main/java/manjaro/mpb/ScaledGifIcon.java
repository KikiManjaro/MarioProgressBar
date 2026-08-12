package manjaro.mpb;

import com.intellij.ui.scale.JBUIScale;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.net.URL;

/**
 * An animated GIF painted at the current IDE zoom level.
 * <p>
 * {@link ImageIcon} always paints its raster at the natural size, while everything else in
 * {@link ProgressBarUi} is laid out through {@link JBUIScale}. With the IDE zoomed to 150% the bar
 * grew to 30px but Mario stayed 21px tall, so he only covered two thirds of it. Painting through
 * the width/height overload of {@code drawImage} keeps the GIF animating (the raster is still a
 * multi-frame image driven by the {@code ImageObserver}) while following the zoom level.
 * <p>
 * The size is resolved on every paint on purpose: the IDE zoom can be changed while running.
 */
public class ScaledGifIcon implements Icon {

    private final ImageIcon delegate;

    public ScaledGifIcon(URL resource, String description) {
        this.delegate = new ImageIcon(resource, description);
    }

    public String getDescription() {
        return delegate.getDescription();
    }

    @Override
    public int getIconWidth() {
        return JBUIScale.scale(delegate.getIconWidth());
    }

    @Override
    public int getIconHeight() {
        return JBUIScale.scale(delegate.getIconHeight());
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g.create();
        try {
            // the characters are pixel art: smoothing them while enlarging turns them into a smudge
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
            g2.drawImage(delegate.getImage(), x, y, getIconWidth(), getIconHeight(), c);
        } finally {
            g2.dispose();
        }
    }
}
