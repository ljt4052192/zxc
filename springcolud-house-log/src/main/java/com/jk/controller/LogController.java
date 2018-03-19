package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.LogBean;
import com.jk.model.ResultBean;
import com.jk.service.LogService;
import com.jk.utils.constant.ConstantConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("log")
public class LogController {

    @Autowired
    private LogService logService;



    @RequestMapping("insertLog")
    public Boolean insertLog( String log){

        try {
            LogBean logBean = JSON.parseObject(log, LogBean.class);
            logService.insertLog(logBean);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @RequestMapping("selectLog")
    @ResponseBody
    public ResultBean selectLog(Integer page, Integer rows){
        ResultBean resultBean = new ResultBean();
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        try {
            Integer count =  logService.selectLogCont(page, rows);
            List<LogBean> logList = logService.selectLog(page, rows);
            stringObjectHashMap.put("total",count);
            stringObjectHashMap.put("rows",logList);
            resultBean.setCode(ConstantConf.SUCCESS);
            resultBean.setMsg("成功");
            resultBean.setData(stringObjectHashMap);

        }catch (Exception e){
            resultBean.setCode(ConstantConf.ERROR);
            resultBean.setMsg(e.getMessage());

        }


        return resultBean;
    }


}
