package edu.training.StudentManagementSystem_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.training.StudentManagementSystem.dao.AdminDao;
import edu.training.StudentManagementSystem_entity.Admin;

@RestController
public class AdminController {
	
	@Autowired
	private AdminDao adminDao;
	
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminDao.saveAdmin(admin);
	}

}
