package vn.ptit.edu.hospital_management.Service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ptit.edu.hospital_management.Entity.UserEntity;
import vn.ptit.edu.hospital_management.repository.UserRepository;

@Service 
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public boolean checkLogin(String username, String password){
        Optional<UserEntity> user = userRepository.findByUsername(username);
        return user.isPresent() && user.get().getPassword().equals(password);
    }

    public String getFullName(String username){
        return userRepository.findByUsername(username).map(u -> u.getFull_name()).orElse("Khách");
    }
}
