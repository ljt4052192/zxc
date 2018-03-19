package com.jk.mapper.house;


import com.jk.model.housePropertyCollection.*;
import com.jk.model.tree.HouseTree;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface HouseMapper {

    @Select("SELECT * FROM t_housetree")
    List<HouseTree> queryHouseTree();


    /**
     *  查询房屋展示页面的总条数
     * @param
     * @param
     * @return
     */
    long queryHouseCount(SellHouseResource sellHouseResource);
    /**
     *  查询房屋展示页面的每页信息数据
     * @param
     * @param
     * @return
     */
    List<SellHouseResource> queryHousePageList(@Param(value="start") int start, @Param(value="end") int end, @Param("sHouseResource")  SellHouseResource sellHouseResource);

    /**
     * 删除房屋信息
     * @param houid
     */
    void deleteHouse(@Param("houid") String houid);




    /**
     * 查询房屋的装修类型
     * @return
     */
    List<Decorate> selectDecorate();


    /**
     * 查询省
     * @return
     */
    List<XxArea> selectProvince();


    /**
     * 根据省查询下面的地级市
     * @param pid
     * @return
     */
    List<XxArea> selectArea2(@Param("pid") Integer pid);

    @Select("SELECT * FROM t_house_type")
    List<HouseType> toQueryRoomType(HouseType houseType);


    @Select("SELECT ts.id,ts.title,ts.price,ts.room,ts.hall,ts.toilet,ts.area,ts.community,ts.province,ts.city,ts.county,ts.building_time AS buildingTime,\n" +
            "ts.room_type AS roomType,ts.room_direction AS roomDirection,ts.floor,ts.decorate,ts.unit_price AS unitPrice,ts.Monthly_payments AS monthlyPayments,\n" +
            "ts.Selling_point AS sellingPoint,ts.owner_mentality AS ownerMentality,ts.community_complete AS communityComplete,ts.service_introduce AS serviceIntroduce,\n" +
            "ts.release_time AS releaseTime,ts.room_num AS roomNum\n" +
            "FROM t_sell_house_resource ts WHERE ts.id= #{id}")
    List<HashMap<String,Object>> selectAddress(String id);


    @Update("update t_sell_house_resource set\n" +
            "\t\ttitle=#{sellHouseResource.title},\n" +
            "\t\tprice=#{sellHouseResource.price},\n" +
            "\t\troom=#{sellHouseResource.room},\n" +
            "\t\thall=#{sellHouseResource.hall},\n" +
            "\t\ttoilet=#{sellHouseResource.toilet},\n" +
            "\t\tarea=#{sellHouseResource.area},\n" +
            "\t\tcommunity=#{sellHouseResource.community},\n" +
            "\t\tprovince=#{sellHouseResource.province},\n" +
            "\t\tcity=#{sellHouseResource.city},\n" +
            "\t\tcounty=#{sellHouseResource.county},\n" +
            "\t\tbuilding_time=#{sellHouseResource.buildingTime},\n" +
            "\t\troom_type=#{sellHouseResource.roomType},\n" +
            "\t\troom_direction=#{sellHouseResource.roomDirection},\n" +
            "\t\tfloor=#{sellHouseResource.floor},\n" +
            "\t\tdecorate=#{sellHouseResource.decorate},\n" +
            "\t\tunit_price=#{sellHouseResource.unitPrice},\n" +
            "\t\tMonthly_payments=#{sellHouseResource.monthlyPayments},\n" +
            "\t\tSelling_point=#{sellHouseResource.sellingPoint},\n" +
            "\t\towner_mentality=#{sellHouseResource.ownerMentality},\n" +
            "\t\tcommunity_complete=#{sellHouseResource.communityComplete},\n" +
            "\t\tservice_introduce=#{sellHouseResource.serviceIntroduce},\n" +
            "\t\trelease_time=#{sellHouseResource.releaseTime},\n" +
            "\t\troom_num=#{sellHouseResource.roomNum}\n" +
            "\t\twhere id=#{sellHouseResource.id}")
    int updateHouse(@Param("sellHouseResource") SellHouseResource sellHouseResource);


    @Select("SELECT * FROM t_decorate")
    List<Decorate> selectDecorate2();

    @Select("SELECT * FROM t_community")
    List<Community> selectCommunity();

    @Select("SELECT * FROM t_house_type")
    List<HouseType> selectRoomType();

    @Select("SELECT * FROM xx_area where parent = #{pid}")
    List<Area> selectArea(String pid);

    @Select("select * from t_sell_house_resource ts,t_sell_house_pic tsp WHERE ts.id=tsp.t_s_id AND ts.id=#{id} and tsp.type = #{type}")
    List<SellHousePic> selecthouseType(@Param("id") String id,@Param("type") String type);

    @Delete("delete from t_sell_house_pic  where t_s_id = #{id}")
    void deleteImg(String id);


}
