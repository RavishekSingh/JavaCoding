package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Mails;

@Repository
public interface EmailRepo extends JpaRepository<Mails, String>{

	
}
