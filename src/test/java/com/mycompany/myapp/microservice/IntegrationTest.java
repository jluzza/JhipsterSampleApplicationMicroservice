package com.mycompany.myapp.microservice;

import com.mycompany.myapp.microservice.JhipsterSampleApplicationMicroserviceApp;
import com.mycompany.myapp.microservice.config.AsyncSyncConfiguration;
import com.mycompany.myapp.microservice.config.EmbeddedRedis;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterSampleApplicationMicroserviceApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
