package vn.ptit.edu.hospital_management.repository;

// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.ptit.edu.hospital_management.Entity.CategoryEntity;

public interface  CategoryRepository extends  JpaRepository<CategoryEntity, Long>{
    // Optional<CategoryEntity>  findByid(Long id);
}
