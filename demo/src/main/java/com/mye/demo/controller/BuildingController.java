package com.mye.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingController {
    @RequestMapping(value = "/buildings", method = RequestMethod.GET)
    public String getAllBuildings() {

        return "1";
    }
}
