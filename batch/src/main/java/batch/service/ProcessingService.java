package batch.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import batch.helper.DateHelper;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ProcessingService {
  /** logger */
  private final static Logger LOG = LoggerFactory.getLogger(ProcessingService.class);

  /** 日時ヘルパー */
  private DateHelper dateHelper;

  /** 実行 */
  public void execute() {
    Date now = this.dateHelper.now();
    LOG.info("now: {}", now);
  }

  @Inject
  public ProcessingService(DateHelper dateHelper) {
    this.dateHelper = dateHelper;
  }
}
