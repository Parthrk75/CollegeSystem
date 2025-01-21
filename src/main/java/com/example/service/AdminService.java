package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Get all admins
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Get admin by ID
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    // Create a new admin
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Update an existing admin
    public Admin updateAdmin(Long id, Admin adminDetails) {
        return adminRepository.findById(id).map(admin -> {
            admin.setAdmin_Email(adminDetails.getAdmin_Email());
            admin.setAdmin_Email(adminDetails.getAdmin_Email());
            return adminRepository.save(admin);
        }).orElse(null);
    }

    // Delete an admin
    public boolean deleteAdmin(Long id) {
        return adminRepository.findById(id).map(admin -> {
            adminRepository.delete(admin);
            return true;
        }).orElse(false);
    }

	

   
	
}
