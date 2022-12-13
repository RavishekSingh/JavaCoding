package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.ReportingManager;

@Repository
public interface ReportingManagerDao extends JpaRepository<ReportingManager, Integer> {

}
