package com.mye.demo.service;

import com.mye.demo.model.Application;

import java.util.List;

public interface ApplicationService {
    /**
     * 获得所有申请条目。
     * @return
     */
    public List<Application> getAllApplications();

    /**
     * 根据申请单号查询申请条目。
     * @param id
     * @return
     */
    public Application selectApplicationById(int id);

    /**
     * 审核更新，将申请条目的状态置为通过或者未通过。
     * @param id
     * @param status
     * @return
     */
    public int updateApplication(int id, int status);
}
