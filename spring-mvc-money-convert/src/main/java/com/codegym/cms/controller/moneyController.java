package com.codegym.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class moneyController {
    @GetMapping("/")
    public String showIndexPage() {
        return "index";
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("exchangeRate") BigDecimal exchangeRate,
                                  @RequestParam("usdAmount") BigDecimal usdAmount,
                                  Model model) {
        BigDecimal vndAmount = usdAmount.multiply(exchangeRate);
        model.addAttribute("usdAmount", usdAmount);
        model.addAttribute("exchangeRate", exchangeRate);
        model.addAttribute("vndAmount", vndAmount);
        return "result";
    }
}
