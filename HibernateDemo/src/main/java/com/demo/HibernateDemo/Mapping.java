package com.demo.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Mapping {
	
	public static void main(String[] args) {
		Department d =new Department();
		d.setDeptId(1);
		d.setDeptName("d1");
		Laptop laptop = new Laptop();
		laptop.setLid(102);
		laptop.setLname("mac");
		
		Laptop laptop2 = new Laptop();
		laptop2.setLid(103);
		laptop2.setLname("dell");
	List<Laptop>	laptops =new ArrayList<>();
	laptops.add(laptop2);
	laptops.add(laptop);
	laptops.add(laptop2);
		Student student = new Student();
		student.setMarks(55);
		student.setName("jammy");
		student.setRollno(2);
		student.getL().add(laptop);
		student.getDept().add(d);
		d.getStudent().add(student);
		laptop.setStudent(student);
		Student student2 = new Student();
		student2.setMarks(55);
		student2.setName("mudra");
		student2.setRollno(1);
		student2.setL(laptops);
	   laptop2.setStudent(student2);                                     
		 Configuration conf = new Configuration().configure();
	        
	     ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
	        
	     SessionFactory sf= conf.buildSessionFactory(reg);
	    Session session=    sf.openSession();
	    Transaction tx= session.beginTransaction();

	    session.saveOrUpdate(d);
	    session.saveOrUpdate(laptop);
	    session.saveOrUpdate(laptop2);
	    session.saveOrUpdate(student);
	    session.saveOrUpdate(student2);
	    tx.commit();
		
	}

}
