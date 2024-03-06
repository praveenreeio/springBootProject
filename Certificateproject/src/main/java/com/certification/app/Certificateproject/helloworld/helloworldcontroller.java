package com.certification.app.Certificateproject.helloworld;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloworldcontroller {
	
	public helloworldcontroller(certificateService certificate, CertificateRepository certificateRepository) {
		super();
		this.certificate = certificate;
		this.certificateRepository = certificateRepository;
	}
	
	 private certificateService certificate;	
     private CertificateRepository certificateRepository;
	
	
	@RequestMapping(value ="/login", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView loginPage() {
		return new ModelAndView("login");
		
	}
	
		@RequestMapping("/getcertificates")
	public ModelAndView getcerti(ModelMap Model) {
			List<certificate> certi = certificate.getall();						
		Model.addAttribute("certifi",certi);				
		return new ModelAndView ("listcerti") ;
		
	} 
		
		@RequestMapping(value = "/addCertificate", method=RequestMethod.GET)
		@ResponseBody
		public ModelAndView shownewCertificate(ModelMap model) {
			certificate certi=new certificate();
			model.put("certifcates", certi);			
			return new ModelAndView("addcertificate") ;
		}
		
		
		@RequestMapping(value= "/addCertificate", method=RequestMethod.POST)		
		public String shownewCertificates(certificate certifcates,ModelMap model) {
			
			certificateRepository.save(certifcates);			
			certificate.addcertificate(certifcates.getName(), certifcates.getPlatform());			
			return "redirect:/getcertificates";
		}
	
		
		@RequestMapping("/deletecertificate")
		public String deleteCertificate(@RequestParam int i) {
			
			certificateRepository.deleteById(i);			
			certificate.deleteCertificatebyID(i);
						
			return "redirect:getcertificates";
			
		}
	
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView welcomePage(ModelMap Model, @RequestParam String userID, @RequestParam String password) {
		if(userID.equals("praveen") && password.equals("Praveen")) {
			Model.put("userid",userID);			
			return new ModelAndView("welcome");			
		}
		
		else{
			Model.put("errormessage", "Please provide correct credential");
			return new ModelAndView("login");
		}		
	}
}
