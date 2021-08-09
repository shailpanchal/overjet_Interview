package com.shail.overjet.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shail.overjet.test.entity.PatientIssues;

@Repository
public interface PatientIssueRepository extends JpaRepository<PatientIssues, Integer>{

}
