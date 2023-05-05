package com.codegym.cms.controller;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class Test {

    public static void main(String[] args) {
        CurrencyUnit usd = Monetary.getCurrency("USD");
        System.out.println(usd);
//        System.out.println(usd.getCurrencyCode());//"USD"
//        System.out.println(usd.getNumericCode());//840
//        System.out.println(usd.getDefaultFractionDigits());//2
    }
}
