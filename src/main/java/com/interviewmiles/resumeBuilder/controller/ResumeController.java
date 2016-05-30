package com.interviewmiles.resumeBuilder.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.interviewmiles.resumeBuilder.exception.ResumeNotFoundException;
import com.interviewmiles.resumeBuilder.models.Resume;
import com.interviewmiles.resumeBuilder.services.ResumeService;

@RestController
@RequestMapping("v1/api/resume")
public class ResumeController {
	private final ResumeService service;
	
	@Autowired
	public ResumeController(ResumeService service) {
		this.service = service;
	}
	
	@RequestMapping(method=RequestMethod.POST ,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	Resume createResume(@RequestBody @Valid Resume resume){
		return service.create(resume);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	List<Resume> findAllResume(){
		return service.findAll();
	}
	
	@RequestMapping(value ="{id}" , method = RequestMethod.GET)
	Resume findById(@PathVariable("id") String id){
		return service.findById(id) ;
	}
	
	@RequestMapping(value ="{id}" , method = RequestMethod.DELETE)
	Resume delete(@PathVariable("id") String id){
		return service.delete(id) ;
	}
	
	@RequestMapping(value ="{id}" , method = RequestMethod.PUT)
	Resume update(@RequestBody @Valid Resume resume){
		return service.update(resume) ;
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleResumeNotFound(ResumeNotFoundException ex){
		
	}

}
