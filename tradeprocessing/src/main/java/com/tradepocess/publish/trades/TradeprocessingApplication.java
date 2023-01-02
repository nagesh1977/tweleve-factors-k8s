package com.tradepocess.publish.trades;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeprocessingApplication {

    private static final Logger LOGGER = LogManager.getLogger(TradeprocessingApplication.class);

    public static void main(String[] args) {
        LOGGER.info("testing");
        SpringApplication.run(TradeprocessingApplication.class, args);
        LOGGER.debug("testing 3");
    }

}
