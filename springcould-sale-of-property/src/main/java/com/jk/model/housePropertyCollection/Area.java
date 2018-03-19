package com.jk.model.housePropertyCollection;

import java.io.Serializable;
import java.util.Date;

//省市县
public class Area implements Serializable{

  private Integer id;
  /**
   * 名称
   */
  private String name;
  /**
   * 时间
   */
  private Date create_date;
  /**
   * 时间
   */
  private Date modify_date;
  /**
   * 未知
   */
  private Integer orders;
  /**
   * 省市县全名
   */
  private String full_anme;
  /**
   * 分割ID
   */
  private String tree_path;
  /**
   * 父id
   */
  private Integer parent;

  @Override
  public String toString() {
    return "Area{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", create_date=" + create_date +
            ", modify_date=" + modify_date +
            ", orders=" + orders +
            ", full_anme='" + full_anme + '\'' +
            ", tree_path='" + tree_path + '\'' +
            ", parent=" + parent +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreate_date() {
    return create_date;
  }

  public void setCreate_date(Date create_date) {
    this.create_date = create_date;
  }

  public Date getModify_date() {
    return modify_date;
  }

  public void setModify_date(Date modify_date) {
    this.modify_date = modify_date;
  }

  public Integer getOrders() {
    return orders;
  }

  public void setOrders(Integer orders) {
    this.orders = orders;
  }

  public String getFull_anme() {
    return full_anme;
  }

  public void setFull_anme(String full_anme) {
    this.full_anme = full_anme;
  }

  public String getTree_path() {
    return tree_path;
  }

  public void setTree_path(String tree_path) {
    this.tree_path = tree_path;
  }

  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }
}
