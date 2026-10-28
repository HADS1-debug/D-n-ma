package vn.ptit.edu.hospital_management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import vn.ptit.edu.hospital_management.Service.impl.ProductService;
import vn.ptit.edu.hospital_management.Service.impl.UserService;


@Controller 
public class HandleLogin {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
    
    // private static final String USERNAME = "admin";
    // private static final String PASSWORD = "123456";

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "Home/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
        if(userService.checkLogin(username.trim(), password.trim())){
            session.setAttribute("loggedIn", true);
            session.setAttribute("username", userService.getFullName(username));
            return "redirect:/home";
        }
        
        model.addAttribute("error", "Sai ten dang nhap hoac mk");
        return "Home/login";
    }
}