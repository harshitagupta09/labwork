package com.example.LabTwo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Trainee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int tid;
	private String tname;
	private String tdomain;
	private String tlocation;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdomain() {
		return tdomain;
	}
	public void setTdomain(String tdomain) {
		this.tdomain = tdomain;
	}
	public String getTlocation() {
		return tlocation;
	}
	public void setTlocation(String tlocation) {
		this.tlocation = tlocation;
	}
	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", tname=" + tname + ", tdomain=" + tdomain + ", tlocation=" + tlocation + "]";
	}
	
	

}
