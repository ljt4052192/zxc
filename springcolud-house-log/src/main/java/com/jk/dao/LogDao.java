package com.jk.dao;

import com.jk.model.LogBean;

import java.util.List;

public interface LogDao {

    /**
     *
     * @param logBean 需要保存的日志信息
     */
    void insertLog(LogBean logBean);

    /**
     *
     * @return 查询出总条数
     */
    Integer selectLogCont();

    /**
     *
     * @param skip  起始条数
     * @param limit 每页条数
     * @return 日志
     */
    List<LogBean> selectLog(Integer skip, Integer limit);
}
