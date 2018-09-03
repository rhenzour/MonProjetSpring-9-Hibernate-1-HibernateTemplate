package be.bt.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import be.bt.domain.Compte;

public class CompteRepositoryImpl implements ICompteRepository {
	
	private SessionFactory factory;
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void create(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Compte finById(String id) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
			return	session.get(Compte.class,id);}

}
