package vn.ptit.edu.hospital_management.Service.impl;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import vn.ptit.edu.hospital_management.DTO.ProductDTO;
import vn.ptit.edu.hospital_management.Entity.ProductEntity;
import vn.ptit.edu.hospital_management.Service.BaseService;
import vn.ptit.edu.hospital_management.repository.ProductRepository;

// import vn.ptit.edu.hospital_management.DTO.UserDTO;
@Service 
public class ProductService implements BaseService{

    @Autowired 
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> results = new ArrayList<ProductDTO>();
        List<ProductEntity> entities = productRepository.findAll();

        for (ProductEntity items : entities){
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(items.getId());
            productDTO.setName(items.getName());
            productDTO.setPrice(items.getPrice());
            productDTO.setQuantity(items.getQuantity());
            productDTO.setImage_url(items.getImage_url());
            productDTO.setCategory_id(items.getCategory_id());
            productDTO.setCreated_at(items.getCreated_at());
            results.add(productDTO);
        }
        return results;
    }

    @Override
    public int totalItem() {
        return (int) productRepository.count();
    }

    public void insert(ProductEntity product){
        productRepository.save(product);
    }

    public void update(ProductEntity product){
        productRepository.save(product);
    }

    public void delete(Long id){
        productRepository.deleteById(id);
    }
    
    public List<ProductEntity> searchName(String name){
        return productRepository.findByName(name);
    }

   public ProductEntity findById(Long id){
        return productRepository.findById(id).orElse(null);
   }
}

