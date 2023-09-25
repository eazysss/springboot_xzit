package com.xzit.mapper;

import com.xzit.entity.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmpMapper {
    @Insert("insert into emp values (null, #{name}, #{addr}, #{dept}, #{age})")
    int save(Emp emp);
    @Delete("delete from emp where id = #{id}")
    int deleteId(Integer id);
    @Update("update emp set name = #{name}, addr = #{addr}, dept = #{dept}, age = #{age} where id = #{id}")
    int update(Emp emp);
    @Select("select * from emp")
    List<Emp> selectList();
    @Select("select * from emp where id = #{id}")
    Emp selectById(Integer id);
}
