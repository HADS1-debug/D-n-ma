package vn.ptit.edu.hospital_management.Entity;

// import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass 
public abstract class BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
    // @Column(name = "created_at")
    // protected String created_at;

    public  Long getId() {
        return id;
    }

    // public  String getCreated_at() {
    //     return created_at;
    // }

    public  void setId(Long id) {
        this.id = id;
    }

    // public void setCreated_at(String created_at) {
    //     this.created_at = created_at;
    // }
}
