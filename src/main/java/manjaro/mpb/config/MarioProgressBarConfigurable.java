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
    MarioProgressBarSettingsState settings = MarioProgressBarSettingsState.getInstance();
    boolean modified = !mySettingsComponent.getChosenCharacter().equals(settings.selectedCharacted);
    modified |= mySettingsComponent.getChosenCharacter() != settings.selectedCharacted;
    return modified;
  }

  @Override
  public void apply() {
    MarioProgressBarSettingsState settings = MarioProgressBarSettingsState.getInstance();
    settings.selectedCharacted = mySettingsComponent.getChosenCharacter();
  }

  @Override
  public void reset() {
    MarioProgressBarSettingsState settings = MarioProgressBarSettingsState.getInstance();
    mySettingsComponent.setChosenCharacter(settings.selectedCharacted);
  }

  @Override
  public void disposeUIResources() {
    mySettingsComponent = null;
  }

}