package com.mye.demo.service;

import com.mye.demo.model.Building;

import java.util.List;

public interface BuildingService {

    public Building selectByName();

    public Building selectById();

    public List<Building> getAllBuildings();

    public int addBuilding();

    public int deleteBuilding();

    public int updateBuilding();
}
