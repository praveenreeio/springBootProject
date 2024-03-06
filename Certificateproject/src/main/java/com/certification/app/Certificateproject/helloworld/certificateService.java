package com.certification.app.Certificateproject.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;


@Service
public class certificateService {
	
	public static int count=0;
	
	private static List<certificate> getcertificate = new ArrayList<>();
	
	static 	{ 
		getcertificate.add(new certificate (++count,"aws","udemy"));
		getcertificate.add(new certificate (++count,"Springboot","udemy"));
		getcertificate.add(new certificate (++count,"java","udemy"));
	};

			
	public List<certificate> getall(){
		return getcertificate;		
	}

	public void addcertificate(String name, String platform) {
		certificate certi=new certificate(++count,name,platform);
		getcertificate.add(certi);	
//		System.out.println(getcertificate);
	}
	
	public void deleteCertificatebyID(int i) {
		
		Predicate<? super certificate> predicate = certificate -> certificate.getI()==i;
		getcertificate.removeIf(predicate);
		
	
	}

			
			
	
	
	
}
