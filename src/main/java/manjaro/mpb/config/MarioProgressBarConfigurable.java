package manjaro.mpb.config;

import com.intellij.openapi.options.Configurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MarioProgressBarConfigurable implements Configurable {

  private MarioProgressBarSettingsComponent mySettingsComponent;

  // A default constructor with no arguments is required because this implementation
  // is registered as an applicationConfigurable EP

  @Nls(capitalization = Nls.Capitalization.Title)
  @Override
  public String getDisplayName() {
    return "Mario Progress Bar";
  }

  @Override
  public JComponent getPreferredFocusedComponent() {
    if (mySettingsComponent == null) return null;
    return mySettingsComponent.getPreferredFocusedComponent();
  }

  @Nullable
  @Override
  public JComponent createComponent() {
    mySettingsComponent = new MarioProgressBarSettingsComponent();
    return mySettingsComponent.getPanel();
  }

  @Override
  public boolean isModified() {
    if (mySettingsComponent == null) return false;
    MarioProgressBarSettingsState settings = MarioProgressBarSettingsState.getInstance();
    return mySettingsComponent.getChosenCharacter() != settings.selectedCharacter;
  }

  @Override
  public void apply() {
    if (mySettingsComponent == null) return;
    MarioProgressBarSettingsState settings = MarioProgressBarSettingsState.getInstance();
    settings.selectedCharacter = mySettingsComponent.getChosenCharacter();
  }

  @Override
  public void reset() {
    if (mySettingsComponent == null) return;
    MarioProgressBarSettingsState settings = MarioProgressBarSettingsState.getInstance();
    mySettingsComponent.setChosenCharacter(settings.selectedCharacter);
  }

  @Override
  public void disposeUIResources() {
    mySettingsComponent = null;
  }
}
