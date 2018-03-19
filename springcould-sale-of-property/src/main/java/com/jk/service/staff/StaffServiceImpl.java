package com.jk.service.staff;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.staff.StaffMapper;
import com.jk.model.housePropertyCollection.Emp;
import com.jk.utils.HttpClient;
import com.jk.utils.Md5Util;
import com.jk.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class StaffServiceImpl implements StaffService {

   @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StaffMapper staffMapper;
    /**
     * 验证码接口
     *
     * @param emp
     * @return
     */
    @Override
    public void HttpClientMessange(Emp emp){

        /*生成6位随机数的验证码*/
        Random random = new Random();
        String randomsjh = "";
        for (int i = 0; i < 6; i++) {
            randomsjh += random.nextInt(10);
        }
        System.out.println("随机数------------------" + randomsjh);
        /* 获取前台传过来的手机号存储到sjnumber*/
        String sjnumber = emp.getPhonenumer();

        //发送短信的网站接口连接
        String url = "https://api.miaodiyun.com/20150822/industrySMS/sendSMS";
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("accountSid", "c4f748e76a9a49cbaf86046a1b2b5ecd");
        params.put("templateid", "196467415");
        params.put("param", randomsjh);
        params.put("to", sjnumber);
        params.put("timestamp", TimeUtil.dateTostr(new Date(), "yyyyMMddHHmmss"));
        params.put("sig", Md5Util.getMd532(params.get("accountSid").toString() + "0ec935786ab34e03ae940d41b5ec6bbc" + params.get("timestamp").toString()));
        //把前台传过来的手机号发送到网站开始给登陆用户发送验证码
        String s = HttpClient.post(url, params);

          /* 将前台穿过来的手机号和随机生成的验证码存储到redis中  为了用户用手机登陆的时候验证用户输入的手机短信验证码是否正确*/
        redisTemplate.opsForValue().set(sjnumber, randomsjh, 5, TimeUnit.MINUTES); // 存储的是用户的手机号, 验证码 和失效时间


    }

    /**
     * 分页查询员工信息
     * @param page
     * @param limit
     * @return
     */
    @Override
    public JSONObject getStaffList(@RequestParam("page")int page, @RequestParam("limit")int limit) {
        Long pageCount = staffMapper.getPageCount();
        int start = (page - 1) * limit;
        int end = limit;
        System.out.println(start + end);
        List<Emp> userlist = staffMapper.getStaffList(start, end);
        JSONObject json = new JSONObject();
        try {
            json.put("page", pageCount);
            json.put("limit", userlist);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json;
    }

    @Override
    public void deleteStaff(@RequestParam("id")String id) {
        staffMapper.deleteStaff(id);
    }

    @Override
    public void addStaff(@RequestParam("emp")Emp emp) {
        staffMapper.addStaff(emp);
    }

    @Override
    public void upStaff(Emp emp) {
        staffMapper.upStaff(emp);
    }





}
