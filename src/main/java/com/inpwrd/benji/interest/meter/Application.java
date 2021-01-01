package com.inpwrd.benji.interest.meter;

import com.inpwrd.benji.interest.meter.config.AppConfiguration;
import com.inpwrd.benji.interest.meter.config.AsyncConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AppConfiguration.class, AsyncConfiguration.class})
public class Application {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(Application.class, args);
        LOG.info("APPLICATION FINISHED");
    }

}
