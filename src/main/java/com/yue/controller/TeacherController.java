package com.yue.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yue.model.Teacher;
import com.yue.service.ITeacherService;

@RestController
public class TeacherController {
	@Resource
	private ITeacherService service;
	@RequestMapping("/teacher/query")
	public @ResponseBody List<Teacher> query(){
		return service.queryTeachers();
	}
}
