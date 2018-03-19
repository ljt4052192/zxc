package com.jk.service.test;

import com.jk.model.housePropertyCollection.*;

import java.util.List;

public interface TestService {
    /**
     *
     * @return  测试使用
     */
    List<Area> testGetResult();

    /**
     * 添加房源
     * @param sellHouseResource
     * @return
     */
    boolean addHouse(SellHouseResource sellHouseResource);

    /**
     * 新增
     * @param pid
     * @return
     */
    List<Area> selectArea(Integer pid);

    /**
     * 查询房屋类型
     * @return
     */
    List<HouseType> selectHousetype();

    /**
     * 查询维修情况
     * @return
     */
    List<Decorate> selectDecorate();

    /**
     * 查询所在小区
     * @return
     */
    List<Community> selectCommunity();

    void inserteimg(SellHousePic sellHousePic);
}
