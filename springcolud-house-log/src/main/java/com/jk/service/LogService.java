package com.jk.service;

import com.jk.model.LogBean;

import java.util.List;

public interface LogService {

    /**
     *
     * @param logBean 需要记录的日志信息
     */
    void insertLog(LogBean logBean);

    /**
     *
     * @param page 当前页
     * @param rows 每页条数
     * @return
     */
    Integer selectLogCont(Integer page, Integer rows);

    /**
     *
     * @param page 当前页
     * @param rows 每页条数
     * @return 日志记录
     */
    List<LogBean> selectLog(Integer page, Integer rows);
}
