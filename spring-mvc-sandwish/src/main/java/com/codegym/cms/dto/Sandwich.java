package com.codegym.cms.dto;


import java.util.List;

public class Sandwich {
   private List<String> condiments;

   public Sandwich() {
   }

   public List<String> getCondiments() {
      return condiments;
   }

   public void setCondiments(List<String> condiments) {
      this.condiments = condiments;
   }
}


