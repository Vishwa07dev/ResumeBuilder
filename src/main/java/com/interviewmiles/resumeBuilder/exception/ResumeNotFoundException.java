package com.interviewmiles.resumeBuilder.exception;

public class ResumeNotFoundException extends RuntimeException {
   public ResumeNotFoundException(String id){
	   super(String.format("No resume found with id : ", id));
   }
    
}
