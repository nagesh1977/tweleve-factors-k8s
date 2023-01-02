package com.tradepocess.publish.trades.controller;


import com.tradepocess.publish.trades.entity.Trades;
import com.tradepocess.publish.trades.repository.TradeRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/")
public class TradeController {
    private final Logger LOG = LogManager.getLogger(getClass());

    @Autowired
    private TradeRepository tradeRepository;

    @RequestMapping(value = "/trades", method = RequestMethod.GET)
    public List<Trades> getAllTrades() {
        LOG.info("Getting all trades.");
        return tradeRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Trades addNewTrade(@RequestBody Trades trades) {
        LOG.info("Saving Trade.");
        return tradeRepository.save(trades);
    }



}
