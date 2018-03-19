package com.jk.mapper.test;

import com.jk.model.housePropertyCollection.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import com.jk.model.housePropertyCollection.Area;

import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TestMapper {


    @Select("SELECT * FROM t_area")
    List<Area> testGetResult();

    @Insert("insert into t_sell_house_resource \n" +
            "(id,t_e_id,title,price,room,hall,toilet,area,community,\n" +
            "province,city,county,building_time,room_type,room_direction,\n" +
            "floor,decorate,unit_price,Monthly_payments,Selling_point,\n" +
            "owner_mentality,community_complete,service_introduce,\n" +
            "release_time,room_num)\n" +
            "values\n" +
            "(#{id},#{teid},#{title},#{price},#{room},#{hall},#{toilet},\n" +
            "#{area},#{community},#{province},#{city},#{county},#{buildingTime},\n" +
            "#{roomType},#{roomDirection},#{floor},#{decorate},#{unitPrice},\n" +
            "#{monthlyPayments},#{sellingPoint},#{ownerMentality},#{communityComplete},#{serviceIntroduce},\n" +
            "#{releaseTime},#{roomNum})")
    boolean addHouse(SellHouseResource sellHouseResource);


    /**
     * 查询地区
     * @param pid
     * @return
     */
    @Select("SELECT id,name FROM xx_area WHERE parent=#{pid}")
    List<Area> selectArea(Integer pid);


    /**
     * 查询房屋类型
     * @return
     */
    @Select("select id,name as housertypename from t_house_type")
    List<HouseType> selectHousetype();

    /**
     * 查询维修情况
     * @return
     */
    @Select("select id,name as decoratename from t_decorate")
    List<Decorate> selectDecorate();

    /**
     * 查询所在小区
     * @return
     */
    @Select("select id,name from t_community")
    List<Community> selectCommunity();

    /**
     * 添加图片
     * @param sellHousePic
     */
    @Insert("insert into t_sell_house_pic \n" +
            "(id,t_s_id,url,type)\n" +
            "values\n" +
            "(#{sellHousePic.id},#{sellHousePic.tsid},#{sellHousePic.url},#{type})")
    void inserteimg(@Param("sellHousePic") SellHousePic sellHousePic);
}
