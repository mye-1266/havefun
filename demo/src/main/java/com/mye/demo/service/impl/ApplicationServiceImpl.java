package com.mye.demo.service.impl;

import com.mye.demo.dao.ApplicationDao;
import com.mye.demo.model.Application;
import com.mye.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired(required = false)
    ApplicationDao applicationDao;

    @Override
    public List<Application> getAllApplications() {
        return applicationDao.getAllApplications();
    }

    @Override
    public Application selectApplicationById(int id) {
        return null;
    }

    @Override
    public int updateApplication(int id, int status) {
        return 0;
    }
}
