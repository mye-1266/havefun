package com.mye.demo.service.impl;

import com.mye.demo.dao.ApplicationDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@MybatisTest
public class ApplicationServiceImplTest {
    @Autowired(required = false)
    ApplicationServiceImpl applicationServiceImpl;

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

        System.out.println(applicationServiceImpl.getAllApplications().get(1).getId());
    }
}
