package io.caelusresearch.springbootmicroserviceobservabilitystudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroserviceObservabilityStudyApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringBootMicroserviceObservabilityStudyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceObservabilityStudyApplication.class, args);
        logger.info("Application started successfully!");
        logger.info("OpenTelemetry is configured and logs should be flowing to Loki!");
        logger.warn("This is a warning log for testing");
        logger.error("This is an error log for testing");
    }

}
