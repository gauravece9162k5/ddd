package com.tw.ddd_workshop.domainservice;

import com.tw.ddd_workshop.domain.Price;

import java.util.HashMap;
import java.util.Map;

public class CompetitorPricingStrategy {

    static Map<String, Price> competitorProducts = new HashMap();

    static {
        competitorProducts.put("Apple Pencil",new Price(10D));
    }

    public static Price getDiscountPrice(String productName, Double amount) {
        if(competitorProducts.containsKey(productName)) {
            return competitorProducts.get(productName).ReduceToPercent(90);
        }
        return new Price(amount);
    }
}
