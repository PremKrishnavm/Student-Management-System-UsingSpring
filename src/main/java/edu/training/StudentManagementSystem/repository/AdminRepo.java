package edu.training.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.training.StudentManagementSystem_entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{
	
}
