package com.mye.demo.dao;

import com.mye.demo.model.Application;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

@Mapper
public interface ApplicationDao {

    @Select("select * from officialcar_apply")
    public List<Application> getAllApplications();

    @Select("select * from officialcar_apply where id = #{id}")
    public Application selectById(int id);
    //这里可不可以返回一个int类型的值用来知道更新的是哪一个申请条目。
    //这里是要使用表名吧。
    @Update("update officialcar_apply set status = #{status} where id = #{id}")
    public void updateApplication(int id, int status);

    @Insert("insert into officialcar_apply (id,car_id) values (#{id},#{car_id})")
    public void addApplication(Application application);
}
