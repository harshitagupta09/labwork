package com.example.LabTwo;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;


public interface TraineeService {
	
	public String newRecord(@Valid Trainee trn,BindingResult result);
	public Trainee tdelete(int id);
	public Trainee tread(int id);

}
