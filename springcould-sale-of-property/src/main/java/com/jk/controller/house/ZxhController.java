package com.jk.controller.house;


import com.jk.service.house.SellHouseResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 周晓辉
 * house房源模块
 * 功能：删除   条件查询
 */
@RestController
@RequestMapping(value = "deleteHouse")
public class ZxhController {
    @Autowired
    private SellHouseResourceService sellHouseResourceService;




    /**
     * 周晓辉
     * house 删除
     * @param id
     */
    @RequestMapping(value = "deleteHouseById")
    @ResponseBody
    public void deleteHouseById(String id){
        sellHouseResourceService.deleteHouseById(id);
    }

}
