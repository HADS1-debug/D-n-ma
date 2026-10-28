package vn.ptit.edu.hospital_management.Service;

import java.util.List;

import vn.ptit.edu.hospital_management.DTO.ProductDTO;

public interface BaseService {
    List<ProductDTO> findAll();
    int totalItem();
}
 