package com.example.LabTwo;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;

public class ITraineeService implements TraineeService {
	
	TraineeDao trDao;

	public ITraineeService(TraineeDao trDao) {
		super();
		// TODO Auto-generated constructor stub
		this.trDao=trDao;
	}

	@Override
	public String newRecord(@Valid Trainee trn, BindingResult result) {
		// TODO Auto-generated method stub
		if(result.hasErrors())
		{
			return "Error";
		}
		trDao.save(trn);
		return "Success";
	}

	@Override
	public Trainee tdelete(int id) {
		// TODO Auto-generated method stub
		Trainee trn =trDao.tdelete(id);
		return trn;
	}

	@Override
	public Trainee tread(int id) {
		// TODO Auto-generated method stub
		Trainee trn =trDao.tread(id);
		return trn;
	}
		
}
