package batch.inject;

import java.time.ZoneId;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;

import dagger.Module;
import dagger.Provides;
import jakarta.inject.Singleton;

/** 各種DI設定のモジュールクラス */
@Module
public class AppModule {

  /** TypesafeConfig の DI */
  @Provides
  @Singleton
  public Config config() {
    return ConfigProvider.getConfig();
  }

  /** ZoneId の DI */
  @Provides
  @Singleton
  public ZoneId zoneId(Config config) {
    String zoneId = config.getValue("tz", String.class);
    return ZoneId.of(zoneId);
  }
}
