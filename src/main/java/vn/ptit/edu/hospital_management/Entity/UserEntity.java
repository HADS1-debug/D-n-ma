package vn.ptit.edu.hospital_management.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name = "users")
public class UserEntity extends BaseEntity{
    
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private long id;
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;
    
    @Column(name = "created_at")
    protected String created_at;
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getRole() {
        return role;
    }

    public String getCreated_at() {
        return created_at;
    }
}
