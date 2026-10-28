package vn.ptit.edu.hospital_management.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.ptit.edu.hospital_management.Entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
// Có thể bổ  sung thêm các phương thức tự định nghĩa tại đây
    List<ProductEntity> findByName(String name);
    Optional<ProductEntity> findById(Long id);
}
