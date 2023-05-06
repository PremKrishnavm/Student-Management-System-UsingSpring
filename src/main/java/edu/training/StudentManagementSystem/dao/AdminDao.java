package edu.training.StudentManagementSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.training.StudentManagementSystem.repository.AdminRepo;
import edu.training.StudentManagementSystem_entity.Admin;

@Repository
public class AdminDao {
	
	@Autowired
	private AdminRepo adminRepo;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
}
