package com.mye.demo.dao;

import com.mye.demo.model.Building;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BuildingDao {
    @Select("select * from building where id = #{id}")
    public Building selectById(int id);

    @Select("select * from building where buildingNum = #{buildingNum}")
    public Building selectByName(String buildingNum);

    @Select("select * from building")
    public List<Building> getAllBuilding();

    @Insert("insert into building (id,buildingNum) values (#{id},#{buildingNum})")
    public int addBuilding(Building building);

    @Update("update building set buildingNum=#{buildingNum} where id=#{id}")
    public int updateBuilding(Building building);

    @Delete("delete from building where id=#{id}")
    public int deleteBuilding(int id);
}
