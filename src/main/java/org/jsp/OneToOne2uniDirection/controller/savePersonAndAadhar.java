package org.jsp.OneToOne2uniDirection.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.OneToOne2uniDirection.dto.aadhar;
import org.jsp.OneToOne2uniDirection.dto.person;

public class savePersonAndAadhar {

	public static void main(String[] args) {
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		person p=new person();
		p.setName("deva");
		p.setPhone(9685684);
		
		aadhar a=new aadhar();
		a.setNumber("dtp9685");
		a.setDob(LocalDate.parse("2002-03-15"));
		a.setPincode(554656);
		p.setCard(a);
		
		manager.persist(p);
		transaction.begin();
		transaction.commit();
		
		
	}
}
