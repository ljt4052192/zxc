package com.jk.service.house;


import com.alibaba.fastjson.JSONObject;
import com.jk.model.housePropertyCollection.*;
import com.jk.model.tree.HouseTree;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

public interface HouseService {

    /**
     * housetree
     * @return
     */
    List<HouseTree> queryHouseTree();


    /**
     * 查询房屋信息
     * @param page
     * @param limit
     * @param sellHouseResource
     * @return
     */
    JSONObject queryHouseList(@RequestParam("page")int page, @RequestParam("limit")int limit, @RequestParam("sellHouseResource") SellHouseResource sellHouseResource);

    /**
     * 删除房屋信息
     * @param houid
     */
    void deleteHouse(@RequestParam("houid") String houid );



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
     * 根据省级别的pid查询到下面的地级市
     * @param pid
     * @return
     */
    List<XxArea> selectArea2(@RequestParam("pid")Integer pid);


    List<HashMap<String,Object>> selectAddress(String id);

    List<Decorate> selectDecorate2();

    int updateHouse(SellHouseResource sellHouseResource);

    List<Community> selectCommunity();

    List<HouseType> selectRoomType();

    List<Area> selectArea(String pid);

    List<SellHousePic> selecthouseType(String id, String type);

    void deleteImg(String id);
}
