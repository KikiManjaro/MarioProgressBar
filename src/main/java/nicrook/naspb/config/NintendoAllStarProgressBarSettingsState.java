package nicrook.naspb.config;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import nicrook.naspb.MBCharacter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static nicrook.naspb.MBCharacter.MARIO;


@State(
        name = "nicrook.naspb.config.NintendoAllStarProgressBarSettingsState",
        storages = @Storage("NintendoAllStarProgressBarPluginSettings.xml")
)
public class NintendoAllStarProgressBarSettingsState implements PersistentStateComponent<NintendoAllStarProgressBarSettingsState> {

  public MBCharacter selectedCharacter = MARIO;

  public static NintendoAllStarProgressBarSettingsState getInstance() {
    return ApplicationManager.getApplication().getService(NintendoAllStarProgressBarSettingsState.class);
  }

  @Nullable
  @Override
  public NintendoAllStarProgressBarSettingsState getState() {
    return this;
  }

  @Override
  public void loadState(@NotNull NintendoAllStarProgressBarSettingsState state) {
    XmlSerializerUtil.copyBean(state, this);
  }

}