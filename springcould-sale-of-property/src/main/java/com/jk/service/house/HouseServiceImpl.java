package com.jk.service.house;


import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.house.HouseMapper;
import com.jk.model.housePropertyCollection.*;
import com.jk.model.tree.HouseTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Override
    public List<HouseTree> queryHouseTree() {
        return houseMapper.queryHouseTree();
    }


    /**
     *  查询房屋展示页面的每页信息数据
     * @param page
     * @param
     * @return
     */

    @Override
    public JSONObject queryHouseList(@RequestParam("page")int page, @RequestParam("limit")int limit, @RequestParam("sellHouseResource") SellHouseResource sellHouseResource) {

        if(sellHouseResource!= null) {
            if ( sellHouseResource.getStarttime()!=null  &&!sellHouseResource.getStarttime().equals("-1") ){
                String time = sellHouseResource.getStarttime();
                String[] split = time.split(",");
                sellHouseResource.setStarttime(split[0].substring(0,4));
                sellHouseResource.setEndtime(split[1].substring(0,4));

            }
        }

        long pageCount = houseMapper.queryHouseCount(sellHouseResource);
        int start = (page - 1) * limit;
        int end = limit;
        List<SellHouseResource> shouselist = houseMapper.queryHousePageList(start, end,sellHouseResource);
        JSONObject json = new JSONObject();
        try {
            json.put("page", pageCount);
            json.put("limit",shouselist);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json;
    }


    /**
     * 删除房屋信息
     * @param houid
     */
    @Override
    public void deleteHouse(@RequestParam("houid") String houid) {

        houseMapper.deleteHouse(houid);
    }


    /**
     * 查询房屋的装修类型
     * @return
     */
    @Override
    public List<Decorate> selectDecorate() {
        return houseMapper.selectDecorate();
    }




    /**
     * 查询省
     * @return
     */
    @Override
    public List<XxArea> selectProvince() {
        return houseMapper.selectProvince();
    }

    /**
     * 根据省查询下面的地级市
     * @param pid
     * @return
     */
    @Override
    public List<XxArea> selectArea2(@RequestParam("pid")Integer pid) {
        return houseMapper.selectArea2(pid);
    }

    @Override
    public List<HashMap<String, Object>> selectAddress(String id) {
        return houseMapper.selectAddress(id);
    }

    //房屋修建
    @Override
    public List<Decorate> selectDecorate2() {
        return houseMapper.selectDecorate2();
    }

    @Override
    public int updateHouse(SellHouseResource sellHouseResource) {

        sellHouseResource.setId("1");
        return houseMapper.updateHouse(sellHouseResource);
    }

    //所在小区
    @Override
    public List<Community> selectCommunity() {
        return houseMapper.selectCommunity();
    }

    //房屋类型
    @Override
    public List<HouseType> selectRoomType() {
        return houseMapper.selectRoomType();
    }

    @Override
    public List<Area> selectArea(String pid) {
        return houseMapper.selectArea(pid);
    }

    @Override
    public List<SellHousePic> selecthouseType(String id, String type) {
        return houseMapper.selecthouseType(id,type);
    }

    @Override
    public void deleteImg(String id) {
        houseMapper.deleteImg(id);
    }
}
