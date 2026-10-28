package vn.ptit.edu.hospital_management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import vn.ptit.edu.hospital_management.Service.impl.ProductService;

@Controller 
public class HandleHome {
    
    @Autowired
    private ProductService productService;

    // @GetMapping("/products")
    // public ProductOutput showProduct(@RequestParam("page") int page,
    //                                 @RequestParam("limit") int limit) {
    //     ProductOutput result = new ProductOutput();
    //     result.setPage(page);
    //     // Pageable pageable = PageRequest.of(page - 1, limit);
    //     result.setProductsResult(productService.findAll());
    //     result.setTotalPage((int) Math.ceil((double) (productService.totalItem()) / limit));
    //     return result;
    // }
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        if(session.getAttribute("loggedIn") == null){
            return "redirect:/login";
        }
        // addAttribute (nhãn dán thay thế, dữ liệu muốn lấy)
        model.addAttribute("productList", productService.findAll());
        model.addAttribute("username", session.getAttribute("username"));
        return "Home/home";
    }
}
