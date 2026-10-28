package vn.ptit.edu.hospital_management.DTO;

public class UserDTO {
    
    private long id;
    private String username;
    // private String password;
    private String full_name;
    private String email;
    private String role;
    private String created_at;

    public Long getId(){
        return id;
    }
    public String getUserName() {
        return username;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getCreatedA() {
        return created_at;
    }
}
