package org.jsp.OneToOne2uniDirection.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.OneToOne2uniDirection.dto.pancard;
import org.jsp.OneToOne2uniDirection.dto.person2;



public class SavepersonAndPancard {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		person2 p=new person2();
		p.setName("Dhruv");
		p.setDob(LocalDate.parse("2001-07-13"));
		
		pancard pc=new pancard();
		pc.setNumber("xxx123xxx");
		pc.setPin(648565);
		pc.setState("madhyapradesh");
		p.setCard(pc);
		manager.persist(p);
		transaction.begin();
		transaction.commit();
		
}
	

}
