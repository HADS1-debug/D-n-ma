package vn.ptit.edu.hospital_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name = "order")
public class OrderEntity extends BaseEntity{

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "total_price")
    private double total_price;

    @Column(name = "status")
    private String status;

    @Column(name = "shipping_address")
    private String shipping_address;

    @Column(name = "created_at")
    protected String created_at;

    public long getUser_id() {
        return user_id;
    }

    public double getTotal_price() {
        return total_price;
    }

    public String getStatus() {
        return status;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCreated_at() {
        return created_at;
    }
}
