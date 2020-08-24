package com.marceloserpa.redis.facetedsearch;

public class Ticket {

  private String sku;
  private String name;
  private Boolean disabledAccess;
  private String type;
  private String city;
  private String category;

  public String getSku() {
    return sku;
  }

  public String getName() {
    return name;
  }

  public Boolean getDisabledAccess() {
    return disabledAccess;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCategory() {
    return category;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDisabledAccess(Boolean disabledAccess) {
    this.disabledAccess = disabledAccess;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
