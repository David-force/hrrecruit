package org.vbazurtob.HRRecruitApp.model.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.vbazurtob.HRRecruitApp.model.Applicant;
import org.vbazurtob.HRRecruitApp.model.ApplicantWorkExperience;

@Repository
@Transactional
public interface ApplicantWorkExpRepository extends CrudRepository<ApplicantWorkExperience, Long>{

	public Page<ApplicantWorkExperience> findAll(Pageable page);
	
	
	public Page<ApplicantWorkExperience> findByApplicant(Applicant applicant, Pageable page);
	
	public Page<ApplicantWorkExperience> findByApplicantUsername(String username, Pageable page);
	
	public long countByApplicantUsernameAndStartedAndFinishedAndPositionAndInstitution(
			String username, 
			Date started, 
			Date finished, 
			String position,
			String institution
	);
	
	
	
	
}