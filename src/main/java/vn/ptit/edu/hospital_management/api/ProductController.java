package vn.ptit.edu.hospital_management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import vn.ptit.edu.hospital_management.DTO.ProductDTO;
import vn.ptit.edu.hospital_management.Entity.ProductEntity;
import vn.ptit.edu.hospital_management.Service.impl.ProductService;
import vn.ptit.edu.hospital_management.repository.CategoryRepository;




@Controller 
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @Autowired 
    private CategoryRepository categoryRepository;

    //Form thêm sản phẩm
    @GetMapping("/new")
    public String addFrom(HttpSession session, Model model) {
        if(session.getAttribute("loggedIn") == null) return "redirect:/login";
        model.addAttribute("product", new ProductDTO());
        model.addAttribute("title", "Thêm sản phẩm");
        return "Home/addProduct";
    }
    
    @PostMapping("/save")
    public String save(@ModelAttribute("product") ProductEntity product ,HttpSession session, RedirectAttributes ra,
                        Model model) {
        if(session.getAttribute("loggedIn") == null) return "redirect:/login";

        if(product.getCategory_id() == null || !categoryRepository.existsById(product.getCategory_id())){
            model.addAttribute("categories", categoryRepository.findAll());
            model.addAttribute("title", "Thêm sản phẩm");
            model.addAttribute("popupError", "Sản phẩm hiện chưa có trong danh mục (category)!");
            return "Home/addProduct";
        }
        boolean isNew = (product.getId() == null);
        productService.update(product);
        ra.addFlashAttribute("message", isNew ? "Đã thêm sản phẩm mới" : "Đã cập nhật sản phẩm");
        return "redirect:/home";
    }  

    @GetMapping("/edit/{id}")
    public String addForm2(@PathVariable Long id ,HttpSession session, Model model){
        if(session.getAttribute("loggedIn") == null) return "redirect:/login";
        // model.addAttribute("product", new ProductDTO());
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("title", "Thêm sản phẩm");
        return "Home/addProduct";
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @PostMapping("/edit/{id}")
    public String edit(@ModelAttribute("product") ProductEntity product, @PathVariable Long id,
                        HttpSession session, RedirectAttributes ra, Model model){
        if(session.getAttribute("loggeIn") == null) return "redirect:/login";
        
        model.addAttribute("title", "Sửa sản phầm");
        if(product.getCategory_id() == null  || !categoryRepository.existsById(product.getCategory_id())){
            model.addAttribute("categories", categoryRepository.findAll());
            model.addAttribute("popupError", "catagoryId không tồn tại!");
            return "Home/addProduct";
        }
        ProductEntity productEntity = productService.findById(id);
        if(productEntity == null){
            ra.addFlashAttribute("message", "Không tìm thấy sản phẩm");
            return "redirect:/home";
        }
        model.addAttribute("product", productEntity);

        ra.addFlashAttribute("message", "Đã chỉnh sửa sản phẩm!");
        return "redirect:/home";
    }

    @PostMapping("/delete/{id}") 
    public String delete(@PathVariable Long id, HttpSession session, RedirectAttributes  ra){
        if(session.getAttribute("loggedIn") == null) return "redirect:/login";
        productService.delete(id);
        ra.addFlashAttribute("message", "Đã xoá sản phẩm");
        return "redirect:/home";
    }
}
