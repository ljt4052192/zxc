package com.jk.controller.staff;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.model.housePropertyCollection.Emp;
import com.jk.service.staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="staff")
public class StaffController {

@Autowired
private StaffService staffService;

    /**
     *手机验证码接口
     */

    @RequestMapping(value="HttpClientMessange")
    @ResponseBody
    public   void    HttpClientMessange(String s){
         Emp emp1 = JSON.parseObject(s, Emp.class);
        staffService.HttpClientMessange(emp1);

    }

    //增加
    @RequestMapping(value = "addStaff")
    @ResponseBody
    public void addStaff(@RequestParam("e")String e){

        Emp emp = JSON.parseObject(e, Emp.class);
        staffService.addStaff(emp);
    }
    //修改员工信息
    @RequestMapping(value = "upStaff")
    @ResponseBody
    public void upStaff(@RequestParam("e")String e){

        Emp emp = JSON.parseObject(e, Emp.class);
        staffService.upStaff(emp);
    }


    //删除员工
    @RequestMapping(value = "deleteStaff")
    @ResponseBody
    public void deleteStaff(@RequestParam("id")String id){

        staffService.deleteStaff(id);
    }
    /**
     * 查询员工
     * @param page
     * @param
     * @param
     * @return
     */
    @RequestMapping(value="getStaffList")
    @ResponseBody
    public  Object  getStaffList(@RequestParam("page")int page, @RequestParam("limit")int limit){
        Emp emp = new Emp();
        JSONObject json=staffService.getStaffList(page,limit);


        return json;

    }







}
