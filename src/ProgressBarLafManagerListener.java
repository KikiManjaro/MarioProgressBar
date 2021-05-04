import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ProgressBarLafManagerListener implements LafManagerListener {

    public ProgressBarLafManagerListener() {
        updateProgressBarUI();
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        updateProgressBarUI();
    }

    private static void updateProgressBarUI() {
        UIManager.put("ProgressBarUI", ProgressBarUi.class.getName());
        UIManager.getDefaults().put(ProgressBarUi.class.getName(), ProgressBarUi.class);
    }
}
