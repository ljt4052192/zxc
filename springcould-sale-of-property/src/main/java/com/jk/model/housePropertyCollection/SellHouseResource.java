package com.jk.model.housePropertyCollection;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SellHouseResource implements Serializable {
    private String id;

    private String teid;

    private String title;

    private Integer price;

    private Integer room;

    private Integer hall;

    private Integer toilet;

    private Double area;

    private String community;

    private Long province;

    private Long city;

    private Long county;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date buildingTime;

    private String roomType;

    private String roomDirection;

    private String floor;

    private String decorate;

    private Double unitPrice;

    private Double monthlyPayments;

    private String sellingPoint;

    private String ownerMentality;

    private String communityComplete;

    private String serviceIntroduce;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releaseTime;

    private String roomNum;

    // 业务管理字段

    //最小面积
    private Double startArea;

    //最大面积
    private Double endArea;

    /*和地区管理*/
    private String areaprovince;

    private String areacity;

    private String areacounty;
    /*和小区名字关联*/
    private String name;
    /*和房屋装修类型关联*/
    private String decoratename;
    /*和用户关联*/
    private String username;
    /*和房屋类型关联*/
    private String housertypename;
    /*和房屋图片关联*/
    private String url;
    /*和房屋图片类型关联*/
    private Integer type;

    /*时间用到的业务字段*/
    /*开始时间*/
    private  String  starttime;
    /*结束时间*/
    private  String  endtime;

    /*省市县业务字段*/
    private  String fullname ;


    public Double getStartArea() {
        return startArea;
    }

    public void setStartArea(Double startArea) {
        this.startArea = startArea;
    }

    public Double getEndArea() {
        return endArea;
    }

    public void setEndArea(Double endArea) {
        this.endArea = endArea;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getAreaprovince() {
        return areaprovince;
    }

    public void setAreaprovince(String areaprovince) {
        this.areaprovince = areaprovince;
    }

    public String getAreacity() {
        return areacity;
    }

    public void setAreacity(String areacity) {
        this.areacity = areacity;
    }

    public String getAreacounty() {
        return areacounty;
    }

    public void setAreacounty(String areacounty) {
        this.areacounty = areacounty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecoratename() {
        return decoratename;
    }

    public void setDecoratename(String decoratename) {
        this.decoratename = decoratename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHousertypename() {
        return housertypename;
    }

    public void setHousertypename(String housertypename) {
        this.housertypename = housertypename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSellingPoint() {
        return sellingPoint;
    }

    public void setSellingPoint(String sellingPoint) {
        this.sellingPoint = sellingPoint == null ? null : sellingPoint.trim();
    }

    public String getOwnerMentality() {
        return ownerMentality;
    }

    public void setOwnerMentality(String ownerMentality) {
        this.ownerMentality = ownerMentality == null ? null : ownerMentality.trim();
    }

    public String getCommunityComplete() {
        return communityComplete;
    }

    public void setCommunityComplete(String communityComplete) {
        this.communityComplete = communityComplete == null ? null : communityComplete.trim();
    }

    public String getServiceIntroduce() {
        return serviceIntroduce;
    }

    public void setServiceIntroduce(String serviceIntroduce) {
        this.serviceIntroduce = serviceIntroduce == null ? null : serviceIntroduce.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTeid() {
        return teid;
    }

    public void setTeid(String teid) {
        this.teid = teid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getHall() {
        return hall;
    }

    public void setHall(Integer hall) {
        this.hall = hall;
    }

    public Integer getToilet() {
        return toilet;
    }

    public void setToilet(Integer toilet) {
        this.toilet = toilet;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getCounty() {
        return county;
    }

    public void setCounty(Long county) {
        this.county = county;
    }

    public String getBuildingTime() {

        if(buildingTime==null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(buildingTime);
    }

    public void setBuildingTime(Date buildingTime) {
        this.buildingTime = buildingTime;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRoomDirection() {
        return roomDirection;
    }

    public void setRoomDirection(String roomDirection) {
        this.roomDirection = roomDirection == null ? null : roomDirection.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate == null ? null : decorate.trim();
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getMonthlyPayments() {
        return monthlyPayments;
    }

    public void setMonthlyPayments(Double monthlyPayments) {
        this.monthlyPayments = monthlyPayments;
    }

    public String getReleaseTime() {
        if(releaseTime==null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(releaseTime);
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum == null ? null : roomNum.trim();
    }
}