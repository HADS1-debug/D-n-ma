package vn.ptit.edu.hospital_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity 
@Table(name = "products")
public class ProductEntity extends BaseEntity{
    
    @Column(name = "name", length=150)
    @NotBlank(message = "Không được để trống")
    private String name;

    @Column(name = "price")
    // @NotBlank(message = "Không được để trống")
    // @Min(value = 0, message  =  "Giá phải > 0")
    private Double price;

    @Column(name = "quantity")
    // @NotBlank(message = "Không được để trống")
    private Long quantity;

    @Column(name = "image_url", length=255)
    private String image_url;

    @Column(name = "category_id")
    private Long category_id;

    @Column(name = "created_at")
    protected String created_at;
    
    public ProductEntity() {
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public String getImage_url() {
        return image_url;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
