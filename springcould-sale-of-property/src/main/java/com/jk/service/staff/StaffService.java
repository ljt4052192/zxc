package com.jk.service.staff;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.housePropertyCollection.Emp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface StaffService {


    public void HttpClientMessange(Emp emp);

    JSONObject getStaffList(@RequestParam("page")int page, @RequestParam("limit")int limit);

    void deleteStaff(@RequestParam("id")String id);

    void addStaff(@RequestParam("emp")Emp emp);

    void upStaff(@RequestParam("emp")Emp emp);

}
