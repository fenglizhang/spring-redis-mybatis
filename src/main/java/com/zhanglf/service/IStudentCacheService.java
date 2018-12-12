package com.zhanglf.service;

import java.util.List;

import com.zhanglf.bo.StudentBo;

public interface IStudentCacheService {
	final String SERVICEID="IStudentCacheService";
	public List<StudentBo> getAllStudent();
	public StudentBo getStudentById(int id);

}
