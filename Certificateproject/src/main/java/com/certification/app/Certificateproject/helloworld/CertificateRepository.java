package com.certification.app.Certificateproject.helloworld;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface CertificateRepository extends JpaRepository<certificate,Integer>{
	
//	public List<certificate> getAll(String name);

}
