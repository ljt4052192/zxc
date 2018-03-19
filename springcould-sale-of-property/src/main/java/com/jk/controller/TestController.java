package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.housePropertyCollection.*;
import com.jk.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("Test2")
    @ResponseBody
    public List<Area> Test(){
        List<Area> list =  testService.testGetResult();

        return list;
    }

    /**
     * 新增房源
     * @param s
     * @return
     */
    @RequestMapping("addHouse")
    @ResponseBody
    public Object addHouse(String s){
        SellHouseResource sellHouseResource = JSON.parseObject(s, SellHouseResource.class);
        boolean n=testService.addHouse(sellHouseResource);


        return n;
    }

    /**
     * 查询地区
     * @param pid
     * @return
     */
    @RequestMapping("selectArea")
    public Object selectArea(Integer pid){
        List<Area> areas=testService.selectArea(pid);
        return areas;
    }


    /**
     * 查询房屋类型
     * @return
     */
    @RequestMapping("selectHousetype")
    @ResponseBody
    public Object selectHousetype(){
        List<HouseType> typelist=testService.selectHousetype();
        return typelist;
    }

    @RequestMapping("selectDecorate")
    @ResponseBody
    public Object selectDecorate(){
        List<Decorate> Decoratelist=testService.selectDecorate();
        return Decoratelist;
    }

    @RequestMapping("selectCommunity")
    @ResponseBody
    public Object selectCommunity(){
        List<Community> Communitylist=testService.selectCommunity();
        return Communitylist;
    }


    @RequestMapping("inserteimg")
    @ResponseBody
    public void inserteimg(String s){

        SellHousePic sellHousePic = JSON.parseObject(s, SellHousePic.class);
        testService.inserteimg(sellHousePic);

    }

}
