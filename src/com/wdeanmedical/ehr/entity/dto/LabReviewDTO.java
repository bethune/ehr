package com.wdeanmedical.ehr.entity.dto;

import java.util.Date;

public class LabReviewDTO {

  private Date date;
  private String name;
  private String value;

  public LabReviewDTO() {
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "LabReviewDTO [date=" + date + ", name=" + name + ", value=" + value + "]";
  }

}
