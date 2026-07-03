package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create Logger object
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        LOGGER.info("Application Started");

        LOGGER.warn("This is a Warning Message");

        LOGGER.error("This is an Error Message");

        LOGGER.info("Application Finished");
    }
}