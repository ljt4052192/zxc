package com.jk.mapper.staff;

import com.jk.model.housePropertyCollection.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
@Component
public interface StaffMapper {

    @Select("select count(1) from t_emp")
    Long getPageCount();

    @Select("SELECT id,name,weixin,photo,phonenumer,loginnumber,PASSWORD FROM t_emp\n" +
            "\t\tLIMIT #{start},#{end}")
    List<Emp> getStaffList(@Param("start") int start, @Param("end") int end);

    @Delete("delete from t_emp where  id = #{id}")
    void deleteStaff(@Param("id") String id);

    @Insert("INSERT INTO t_emp(id,name,weixin,photo,phonenumer,loginnumber,password) VALUES\n" +
            "\t\t\t  (#{id},#{name},#{weixin},#{photo},#{phonenumer},#{loginnumber},#{password})")
    void addStaff(Emp emp);

    @Update("UPDATE t_emp SET name=#{name},weixin=#{weixin},photo=#{photo},phonenumer=#{phonenumer},loginnumber=#{loginnumber},password=#{password} WHERE id=#{id}")
    void upStaff(Emp emp);
}
