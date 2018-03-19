package com.jk.mapper.house;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface SellHouseResourceMapper {
    /**
     * 周晓辉
     * house 删除
     * @param id
     */
    @Delete("DELETE FROM t_sell_house_resource WHERE id = #{id}")
    void deleteHouseById(String id);
}
