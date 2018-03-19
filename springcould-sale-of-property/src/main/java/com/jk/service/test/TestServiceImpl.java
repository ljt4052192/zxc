package com.jk.service.test;


import com.jk.mapper.test.TestMapper;
import com.jk.model.housePropertyCollection.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements  TestService {


    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Area> testGetResult() {
        return testMapper.testGetResult();
    }

    @Override
    public boolean addHouse(SellHouseResource sellHouseResource) {
        return testMapper.addHouse(sellHouseResource);
    }

    @Override
    public List<Area> selectArea(Integer pid) {
        return testMapper.selectArea(pid);
    }

    @Override
    public List<HouseType> selectHousetype() {
        return testMapper.selectHousetype();
    }

    @Override
    public List<Decorate> selectDecorate() {
        return testMapper.selectDecorate();
    }

    @Override
    public List<Community> selectCommunity() {
        return testMapper.selectCommunity();
    }

    @Override
    public void inserteimg(SellHousePic sellHousePic) {
        testMapper.inserteimg(sellHousePic);
    }
}
