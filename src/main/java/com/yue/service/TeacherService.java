package com.yue.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yue.mapper.TeacherMapper;
import com.yue.model.Teacher;

@Service
public class TeacherService implements ITeacherService{
	@Resource
	private TeacherMapper mapper;

	@Override
	public List<Teacher> queryTeachers() {
		return mapper.select();
	}
	
}
