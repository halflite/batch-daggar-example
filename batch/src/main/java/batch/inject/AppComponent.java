package batch.inject;

import batch.service.ProcessingService;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {

  public ProcessingService processingService();
}