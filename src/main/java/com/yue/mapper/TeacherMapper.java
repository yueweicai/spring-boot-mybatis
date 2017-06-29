package com.yue.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.yue.model.Teacher;

@Mapper
public interface TeacherMapper {
	@Select("select * from teacher")
	public List<Teacher> select();
}