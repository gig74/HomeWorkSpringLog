package com.example.homeworkspringlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ClassForLog {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassForLog.class);

    public void writeSampleMessageInLog()  {
        System.out.println("Hello log!");
        for (int i = 0; i < 5; i++) {
            LOGGER.debug("Test 1 - debug level");
            LOGGER.warn("Test 2 - warning level");
            LOGGER.info("Test 3 - info level");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                LOGGER.error("InterruptedException: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }
}
