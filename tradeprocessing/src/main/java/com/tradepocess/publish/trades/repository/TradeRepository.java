package com.tradepocess.publish.trades.repository;

import com.tradepocess.publish.trades.entity.Trades;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends MongoRepository<Trades, String> {
}
