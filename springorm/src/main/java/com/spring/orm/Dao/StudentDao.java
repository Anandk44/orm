package com.spring.orm.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entity.Student;

public class StudentDao {
	private HibernateTemplate hTemp;  
	
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer)hTemp.save(student) ;
		return i ;
	}
	

	public HibernateTemplate gethTemp() {
		return hTemp;
	}
	public Student getStudent(int studentId) {
		Student st = this.hTemp.get(Student.class, studentId);
		return st ;
	}
	public List<Student> getAllStudents(){
		List<Student> students = this.hTemp.loadAll(Student.class);
		return students;
	}
	@Transactional
	public void delete(int studentId) {
		Student student = this.hTemp.get(Student.class, studentId);
		 this.hTemp.delete(student);
	}
	@Transactional
	public void update(Student student) {
		this.hTemp.update(student);
	}
	

	public void sethTemp(HibernateTemplate hTemp) {
		this.hTemp = hTemp;
	}


	

}
