package com.jk.controller.house;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.model.housePropertyCollection.*;
import com.jk.model.tree.HouseTree;
import com.jk.service.house.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 展示房源操作树tree
 * houseQueryTree
 *
 * 周晓辉  注释
 */
@RestController
@RequestMapping(value = "house")
public class HouseController {

        @Autowired
        private HouseService houseService;


    /**
     * house 树
     */
    @RequestMapping(value = "queryHouseTree")
    @ResponseBody
    public List<HouseTree> queryHouseTree(){
        List<HouseTree> list = houseService.queryHouseTree();
       return list;
    }



    @RequestMapping(value="queryHouseList")
    @ResponseBody
    public  Object  queryHouseList(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("sj") String sj) {


        SellHouseResource sellHouseResource = JSON.parseObject(sj, SellHouseResource.class);
        JSONObject json = houseService.queryHouseList(page, limit, sellHouseResource);
        return json;

    }
    /**
     * 删除房屋信息
     */
    @RequestMapping(value="deleteHouse")
    @ResponseBody
    public void deleteHouse(@RequestParam("houid") String houid ){

        houseService.deleteHouse(houid);

    }

    /**
     *查询房屋装修类型
     * @param
     * @param
     * @param
     * @return
     */
    @RequestMapping(value="selectDecorate2")
    @ResponseBody
    public List<Decorate> selectDecorate2(){
        List<Decorate> list=houseService.selectDecorate2();
        System.out.println(list);
        return list ;
    }



    /**
     *查询三级联动的省
     * @return
     */
    @RequestMapping(value = "selectProvince")
    @ResponseBody
    public List<XxArea> selectProvince(){
        List<XxArea> list=houseService.selectProvince();
        return list;
    }



    /**
     * 根据父级id查询出对应的子集
     */
    @RequestMapping(value = "selectArea2")
    @ResponseBody
    public List<XxArea> selectArea2(@RequestParam("pid")Integer pid){

        return houseService.selectArea2(pid);
    }

    /**
     * 修改回显
     * @param
     * @return
     */
    @RequestMapping("toQueryList")
    @ResponseBody
    public HashMap<String, Object> toQueryList(String id){

        //查询到房源的
        List<HashMap<String, Object>> listAddress = houseService.selectAddress(id);

        //总容器
        HashMap<String, Object> hashMap = new HashMap<>();

        String type = "1";
        List<SellHousePic> imgList1 = houseService.selecthouseType(id, type);
        type = "2";
        List<SellHousePic> imgList2 = houseService.selecthouseType(id, type);
        type = "3";
        List<SellHousePic> imgList3 = houseService.selecthouseType(id, type);

        String imgListString1 = "";
        for (int i = 0; i < imgList1.size(); i++) {
            imgListString1+= "<img src='"+imgList1.get(i).getUrl()+"'>";
        }
        String imgListString2 = "";
        for (int i = 0; i < imgList2.size(); i++) {
            imgListString2+= "<img src='"+imgList2.get(i).getUrl()+"'>";
        }
        String imgListString3 = "";
        for (int i = 0; i < imgList3.size(); i++) {
            imgListString3+= "<img src='"+imgList3.get(i).getUrl()+"'>";
        }


        hashMap.put("list",listAddress);
        hashMap.put("imgListString1",imgListString1);
        hashMap.put("imgListString2",imgListString2);
        hashMap.put("imgListString3",imgListString3);
        return hashMap;
    }

    /**
     *回显装修程度
     */
    @RequestMapping("selectDecorate")
    @ResponseBody
    public Object selectDecorate(){

        List<Decorate> decorateList = houseService.selectDecorate();
        return decorateList;
    }


    /**
     * 所在小区
     */
    @RequestMapping("selectCommunity")
    @ResponseBody
    public Object selectCommunity(){

        List<Community> communityList = houseService.selectCommunity();
        return communityList;
    }

    /**
     * 房屋类型
     */
    @RequestMapping("selectRoomType")
    @ResponseBody
    public Object selectRoomType(){
        List<HouseType> houseTypeList = houseService.selectRoomType();
        return houseTypeList;
    }

    /**
     * 省市县
     */
    @RequestMapping("selectArea")
    @ResponseBody
    public List<Area> selectArea(String pid){

        List<Area> areaList = houseService.selectArea(pid);
        return areaList;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "updateHouse")
    @ResponseBody
    public Map updateHouse(String sellHouseResource){
        Map map = new HashMap();
        SellHouseResource sellHouseResource2 = JSON.parseObject(sellHouseResource, SellHouseResource.class);
        int i = houseService.updateHouse(sellHouseResource2);
        if(i>0){
            map.put("msg", "修改成功");
        }else{
            map.put("msg","修改失败");
        }
        return map;
    }


    @RequestMapping("deleteImg")
    public void deleteImg(String id){

        houseService.deleteImg(id);
    }

}
