package nicrook.naspb.config;

import com.intellij.openapi.options.Configurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NintendoAllStarProgressBarConfigurable implements Configurable {

  private NintendoAllStarProgressBarSettingsComponent mySettingsComponent;

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
    mySettingsComponent = new NintendoAllStarProgressBarSettingsComponent();
    return mySettingsComponent.getPanel();
  }

  @Override
  public boolean isModified() {
    NintendoAllStarProgressBarSettingsState settings = NintendoAllStarProgressBarSettingsState.getInstance();
    boolean modified = !mySettingsComponent.getChosenCharacter().equals(settings.selectedCharacter);
    modified |= mySettingsComponent.getChosenCharacter() != settings.selectedCharacter;
    return modified;
  }

  @Override
  public void apply() {
    NintendoAllStarProgressBarSettingsState settings = NintendoAllStarProgressBarSettingsState.getInstance();
    settings.selectedCharacter = mySettingsComponent.getChosenCharacter();
  }

  @Override
  public void reset() {
    NintendoAllStarProgressBarSettingsState settings = NintendoAllStarProgressBarSettingsState.getInstance();
    mySettingsComponent.setChosenCharacter(settings.selectedCharacter);
  }

  @Override
  public void disposeUIResources() {
    mySettingsComponent = null;
  }

}