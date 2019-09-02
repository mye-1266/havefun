package com.mye.demo.dao;

import com.mye.demo.model.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@MybatisTest
public class ApplicationDaoTest {
    @Autowired(required = false)
    ApplicationDao applicationDao;
    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void getAllApplications() {
        List<Application> applications = applicationDao.getAllApplications();
        System.out.println(applications);
    }

    @Test
    public void selectById() {
    }

    @Test
    public void updateApplication() {
    }
}
