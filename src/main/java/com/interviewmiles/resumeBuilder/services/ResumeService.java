package com.interviewmiles.resumeBuilder.services;

import java.util.List;

import com.interviewmiles.resumeBuilder.models.Resume;

public interface ResumeService {
   Resume create(Resume resume);
   Resume delete(String id);
   List<Resume> findAll();
   Resume findById(String id);
   Resume update(Resume resume);
   
}
