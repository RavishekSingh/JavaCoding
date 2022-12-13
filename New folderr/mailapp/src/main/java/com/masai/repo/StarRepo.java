package com.masai.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.model.Starred;
@Repository
public interface StarRepo extends JpaRepository<Starred, String>{

	
}
