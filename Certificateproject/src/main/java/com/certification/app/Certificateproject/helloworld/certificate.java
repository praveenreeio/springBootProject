package com.certification.app.Certificateproject.helloworld;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="CertifcateDB")
public class certificate {
	
	@Id
	@GeneratedValue
	int i;
	String name,platform;
	public certificate(int i, String name, String platform) {
		super();
		this.i = i;
		this.name = name;
		this.platform = platform;
	}
	
	
	
	public certificate() {
		// TODO Auto-generated constructor stub
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPlatform() {
		return platform;
	}



	public void setPlatform(String platform) {
		this.platform = platform;
	}



	@Override
	public String toString() {
		return "certificate [i=" + i + ", name=" + name + ", platform=" + platform + "]";
	}
	
	
	
	
}
