package com.tradepocess.publish.trades.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
@Getter
@Setter
@ToString

public class Trades {

    @Id
    private String id;
    private String tradeid;
    private String ticker;
    private String cusip;
    private BigInteger amount;
    private BigInteger quanity;
    private float price;

}
