package com.mye.demo.controller;

import com.mye.demo.model.Application;
import com.mye.demo.service.impl.ApplicationServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {
    @Autowired
    ApplicationServiceImpl applicationServiceImpl;

    @RequestMapping(value = "/applications", method = RequestMethod.GET)
    public String getAllApplications(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","调用成功");
        jsonObject.put("code","0000");
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonData = new JSONObject();
        //将所有的
        List<Application> applicationList = applicationServiceImpl.getAllApplications();

        for(int i = 0; i < applicationList.size(); i++) {

        }
    }

}
