package com.example.feign.dto;

import java.util.List;

/**
 * 分页数据封装类
 * Created by chenza on 2019/4/19.
 */
public class PerfectPageResultImpl<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Long total;
    private List<T> list;

    private List<String> orderBy;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(List<String> orderBy) {
        this.orderBy = orderBy;
    }
}
