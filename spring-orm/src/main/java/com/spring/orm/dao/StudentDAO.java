package com.spring.orm.dao;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.spring.orm.beans.Student;


public class StudentDAO {
	
	private HibernateTemplate hibernateTemplate; 
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
		this.hibernateTemplate =hibernateTemplate;
	}
	
	//For save,update and delete we have to use this.
	@Transactional
	public int insert(Student s) {
		int i =(Integer)hibernateTemplate.save(s);
		return i;
	}
	
	@Transactional
	public void update(int id) {
		Student s = hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(s);
	}
	
	@Transactional
	public void delete(int id) {
		Student s = hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(s);
	}
	
	@Transactional
	public Student fetch(int id) {
		Student s = hibernateTemplate.get(Student.class, id);
		return s;
	}
	
	@Transactional
	public List<Student> fetchAll() {
		 return hibernateTemplate.loadAll(Student.class);
	}

}
