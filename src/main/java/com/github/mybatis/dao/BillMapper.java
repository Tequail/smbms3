package com.github.mybatis.dao;

import com.github.mybatis.pojo.Bill;
import com.github.mybatis.util.PageBean;

import java.util.List;

public interface BillMapper {
    /**
     * 查询账单的总记录数
     * @return
     */
    int findBillCount();

    /**
     * 分页查询
     * @param pageBean
     * @return
     */
    List<Bill> queryPageBean(PageBean<Bill> pageBean);
}
