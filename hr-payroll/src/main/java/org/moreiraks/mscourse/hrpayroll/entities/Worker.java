package org.moreiraks.mscourse.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable{
  private static final long serialVersionUID=1l;
  private Long id;
  private String name; 
  private Double dailyIncome;


  public Worker() {
  }
  
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Double getDailyIncome() {
    return dailyIncome;
  }
  public void setDailyIncome(Double dailyIncome) {
    this.dailyIncome = dailyIncome;
  } 
}
