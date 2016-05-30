package com.interviewmiles.resumeBuilder.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Resume {
	
	@Id
	private String id ;
	
	private BasicInformation basicInformation ;
	private Objective objective ;
	private List<EducationalDegree> educationalDetails ;
	private List<Company> companyDetails ;
	private HobbiesAndInterests hobbiesAndInterests ;
	private List<Skill> professionalSkills ;
	private List<Language> languages ;
	private List<Reference> references ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BasicInformation getBasicInformation() {
		return basicInformation;
	}
	public void setBasicInformation(BasicInformation basicInformation) {
		this.basicInformation = basicInformation;
	}
	public Objective getObjective() {
		return objective;
	}
	public void setObjective(Objective objective) {
		this.objective = objective;
	}
	
	public HobbiesAndInterests getHobbiesAndInterests() {
		return hobbiesAndInterests;
	}
	public void setHobbiesAndInterests(HobbiesAndInterests hobbiesAndInterests) {
		this.hobbiesAndInterests = hobbiesAndInterests;
	}
	public List<EducationalDegree> getEducationalDetails() {
		return educationalDetails;
	}
	public void setEducationalDetails(List<EducationalDegree> educationalDetails) {
		this.educationalDetails = educationalDetails;
	}
	public List<Company> getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(List<Company> companyDetails) {
		this.companyDetails = companyDetails;
	}
	public List<Skill> getProfessionalSkills() {
		return professionalSkills;
	}
	public void setProfessionalSkills(List<Skill> professionalSkills) {
		this.professionalSkills = professionalSkills;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	public List<Reference> getReferences() {
		return references;
	}
	public void setReferences(List<Reference> references) {
		this.references = references;
	}
	
	
	

}
