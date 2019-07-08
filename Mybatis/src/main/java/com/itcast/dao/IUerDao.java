package com.itcast.dao;

import com.itcast.domain.User;

import java.util.List;

/**
 * @Author: Zheng
 * @Date: 2019/5/15 17:38
 * @Description:
 */
public interface IUerDao {

    /**
     *
     * 功能描述: 
     *
     * @param: 
     * @return: 
     * @author: Zheng
     * @date: 2019/5/15 17:38
     */

    List<User> findAll();
}
