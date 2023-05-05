package com.codegym.cms.controller;

import com.codegym.cms.dto.Sandwich;
import com.codegym.cms.service.SandWishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


@Controller
public class SandWishController {

    @Autowired
    public SandWishService service;

    @GetMapping("/home")
    public String Form(){
        return "index";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestParam("condiment") String[] condiments){
        Sandwich sandwich = new Sandwich();
        sandwich.setCondiments(Arrays.asList(condiments));
        service.save(sandwich);
        return "redirect:/sandwiches";
    }
}
