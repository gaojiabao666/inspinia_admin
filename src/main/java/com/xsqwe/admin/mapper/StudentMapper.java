package com.xsqwe.admin.mapper;

import com.xsqwe.admin.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper

public interface StudentMapper {
    @Select("select * from student where stuId = #{stuId}")
    Student selectStudentByStuId(String stuId);

    @Insert("insert into student(`stu_name`,`address`) value(#{stuName},#{address})")
    @Options(useGeneratedKeys = true,keyProperty = "stuId")
    int insertStu(Student student);
}
