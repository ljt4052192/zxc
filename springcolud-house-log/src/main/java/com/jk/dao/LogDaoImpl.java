package com.jk.dao;

import com.jk.model.LogBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogDaoImpl implements LogDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insertLog(LogBean logBean) {
        mongoTemplate.insert(logBean);
    }

    @Override
    public Integer selectLogCont() {
        return (int)mongoTemplate.count(new Query(),LogBean.class);
    }

    @Override
    public List<LogBean> selectLog(Integer skip, Integer limit) {
        return mongoTemplate.find(new Query().skip(skip).limit(limit), LogBean.class);
    }
}
