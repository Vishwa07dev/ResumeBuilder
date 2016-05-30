package com.interviewmiles.resumeBuilder.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmiles.resumeBuilder.models.Resume;
import com.interviewmiles.resumeBuilder.repository.ResumeRepository;

@Service
public class ResumeServiceImpl implements ResumeService {
	
	private final ResumeRepository repository ;
	
	@Autowired
	public ResumeServiceImpl(ResumeRepository repository) {
		this.repository =repository;
	}

	@Override
	public Resume create(Resume resume) {
		Resume createdResume = repository.save(resume);
		return createdResume;
	}

	@Override
	public Resume delete(String id) {
		Resume resume = findById(id);
		repository.delete(resume);
		return resume;
	}

	@Override
	public List<Resume> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Resume findById(String id) {
		Optional<Resume> resume = repository.findOne(id);
		return resume.orElse(null);
	}

	@Override
	public Resume update(Resume resume) {
		Resume updated = findById(resume.getId());
		updated.setBasicInformation(resume.getBasicInformation());
		updated.setCompanyDetails(resume.getCompanyDetails());
		updated.setEducationalDetails(resume.getEducationalDetails());
		updated.setHobbiesAndInterests(resume.getHobbiesAndInterests());
		updated.setLanguages(resume.getLanguages());
		updated.setObjective(resume.getObjective());
		updated.setProfessionalSkills(resume.getProfessionalSkills());
		updated.setReferences(resume.getReferences());
		updated = repository.save(updated);
		return updated;
	}

}
