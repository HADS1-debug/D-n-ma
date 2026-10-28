package vn.ptit.edu.hospital_management.api.output;

import java.util.ArrayList;
import vn.ptit.edu.hospital_management.DTO.ProductDTO;
import java.util.List;

public class ProductOutput {
    private int page;
    private int totalPage;
    private List<ProductDTO> productsResult = new ArrayList<>();
    
    public int getPage() {
        return page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public List<ProductDTO> getProductsResult() {
        return productsResult;
    }

    public void setProductsResult(List<ProductDTO> productsResult) {
        this.productsResult = productsResult;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
