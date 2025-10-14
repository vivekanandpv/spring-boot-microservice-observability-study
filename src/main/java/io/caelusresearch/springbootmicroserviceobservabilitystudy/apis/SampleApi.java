package io.caelusresearch.springbootmicroserviceobservabilitystudy.apis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    private static final Logger logger = LoggerFactory.getLogger(SampleApi.class);

    @GetMapping
    public String hello(@RequestParam(defaultValue = "en") String lang) {
        logger.info("Received request for GET endpoint with lang: {}", lang);

        String response = "Greetings! in " + lang + "!";

        logger.debug("Generated response: {}", response);
        logger.info("Successfully processed GET request");

        return response;
    }

    @GetMapping("/error-demo")
    public String errorDemo() {
        logger.warn("Someone hit the error-demo endpoint - this will generate an error!");

        try {
            throw new RuntimeException("Intentional error for demo purposes");
        } catch (Exception e) {
            logger.error("Error occurred in error-demo endpoint", e);
            return "Error occurred! Check your logs.";
        }
    }
}
