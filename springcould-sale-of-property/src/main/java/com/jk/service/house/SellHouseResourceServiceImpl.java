package com.jk.service.house;


import com.jk.mapper.house.SellHouseResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellHouseResourceServiceImpl implements SellHouseResourceService{
    @Autowired
    private SellHouseResourceMapper sellHouseResourceMapper;

    /**
     * 周晓辉
     * house 删除
     * @param id
     */
    @Override
    public void deleteHouseById(String id) {
        sellHouseResourceMapper.deleteHouseById(id);
    }
}
