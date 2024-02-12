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
        name = "manjaro.mpb.config.MarioProgressBarSettingsState",
        storages = @Storage("MarioProgressBarPluginSettings.xml")
)
public class MarioProgressBarSettingsState implements PersistentStateComponent<MarioProgressBarSettingsState> {

  public MBCharacter selectedCharacter = MARIO;

  public static MarioProgressBarSettingsState getInstance() {
    return ApplicationManager.getApplication().getService(MarioProgressBarSettingsState.class);
  }

  @Nullable
  @Override
  public MarioProgressBarSettingsState getState() {
    return this;
  }

  @Override
  public void loadState(@NotNull MarioProgressBarSettingsState state) {
    XmlSerializerUtil.copyBean(state, this);
  }

}