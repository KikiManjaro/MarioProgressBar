package manjaro.mpb;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.intellij.openapi.application.ApplicationActivationListener;
import com.intellij.openapi.wm.IdeFrame;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ProgressBarLafManagerListener implements LafManagerListener, ApplicationActivationListener {

    public ProgressBarLafManagerListener() {
        updateProgressBarUI();
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        updateProgressBarUI();
    }

    @Override
    public void applicationActivated(@NotNull IdeFrame ideFrame) {
        updateProgressBarUI();
    }

    private static void updateProgressBarUI() {
        UIManager.put("ProgressBarUI", ProgressBarUi.class.getName());
        UIManager.getDefaults().put(ProgressBarUi.class.getName(), ProgressBarUi.class);
    }
}
