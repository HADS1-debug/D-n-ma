package vn.ptit.edu.hospital_management.DTO;

public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Long quantity;
    private String image_url;
    private Long category_id;
    private String created_at;

    public Long getId() {
        return id;
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

    public String getCreated_at() {
        return created_at;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
