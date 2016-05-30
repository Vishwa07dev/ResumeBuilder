package com.interviewmiles.resumeBuilder.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.interviewmiles.resumeBuilder.models.Resume;

public interface ResumeRepository extends Repository<Resume, String>{
  Resume save(Resume resume);
  List<Resume> findAll();
  Optional<Resume> findOne(String id);
  void delete(Resume resume);

}
