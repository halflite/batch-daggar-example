package batch.helper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import batch.inject.AppModule;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class DateHelper {
  /** logger */
  private final static Logger LOG = LoggerFactory.getLogger(AppModule.class);

  /** ZoneId */
  private final ZoneId zoneId;

  /** 現在時刻を返します */
  public Date now() {
    Instant instant = LocalDateTime.now().atZone(this.zoneId).toInstant();
    return Date.from(instant);
  }

  @Inject
  public DateHelper(ZoneId zoneId) {
    LOG.debug("zone id: {}", zoneId);
    this.zoneId = zoneId;
  }
}
