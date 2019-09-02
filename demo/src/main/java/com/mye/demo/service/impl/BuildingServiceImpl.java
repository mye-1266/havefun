package com.mye.demo.service.impl;

import com.mye.demo.dao.BuildingDao;
import com.mye.demo.model.Building;
import com.mye.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    BuildingDao buildingDao;

    @Override
    public Building selectByName() {
        return null;
    }

    @Override
    public Building selectById() {
        return null;
    }

    @Override
    public List<Building> getAllBuildings() {
        return null;
    }

    @Override
    public int addBuilding() {
        return 0;
    }

    @Override
    public int deleteBuilding() {
        return 0;
    }

    @Override
    public int updateBuilding() {
        return 0;
    }
}
