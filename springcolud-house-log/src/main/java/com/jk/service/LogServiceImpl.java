package com.jk.service;

import com.jk.dao.LogDao;
import com.jk.model.LogBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public void insertLog(LogBean logBean) {
        logDao.insertLog( logBean);
    }

    @Override
    public Integer selectLogCont(Integer page, Integer rows) {
       /* Integer skip = (page - 1) * rows;
        Integer limit = rows;*/
        return logDao.selectLogCont();
    }

    @Override
    public List<LogBean> selectLog(Integer page, Integer rows) {
        Integer skip = (page - 1) * rows;
        Integer limit = rows;
        return logDao.selectLog(skip, limit);
    }


}
