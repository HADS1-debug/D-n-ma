package vn.ptit.edu.hospital_management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.ptit.edu.hospital_management.Entity.UserEntity;

//Tên bảng và khoá chính của bảng dùng repository đó
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    Optional<UserEntity> findByUsername(String username);
    // Optional<UserEntity> findByFullName(String full_name);
}

