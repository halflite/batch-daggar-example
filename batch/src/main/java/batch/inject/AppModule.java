package batch.inject;

import java.time.ZoneId;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

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
    return ConfigFactory.load();
  }

  /** ZoneId の DI */
  @Provides
  @Singleton
  public ZoneId zoneId(Config config) {
    String zoneId = config.getString("tz");
    return ZoneId.of(zoneId);
  }
}
