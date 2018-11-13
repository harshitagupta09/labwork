package com.example.LabTwo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
@Transactional
public class ITraineeDao implements TraineeDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void save(Trainee trn) {
		// TODO Auto-generated method stub
		em.persist(trn);
		
	}

	@Override
	public Trainee tdelete(int id) {
		// TODO Auto-generated method stub
		Trainee trn = em.find(Trainee.class, id);
		em.remove(trn);
		return trn;
	}

	@Override
	public Trainee tread(int id) {
		// TODO Auto-generated method stub
		Trainee trn = em.find(Trainee.class, id);
		return trn;
	}

}
