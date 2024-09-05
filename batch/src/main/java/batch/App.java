package batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import batch.inject.DaggerAppComponent;
import batch.service.ProcessingService;

/** Main App */
public class App {
  /** Logger */
  private static Logger LOG = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    LOG.info("started.");

    // ビジネスロジック取得
    ProcessingService service = DaggerAppComponent.create().processingService();

    // ビジネスロジック実行
    service.execute();

    LOG.info("completed.");
  }
}
