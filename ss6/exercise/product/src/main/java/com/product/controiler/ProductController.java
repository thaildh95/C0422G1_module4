package com.product.controiler;

import com.product.model.Product;
import com.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String goIndex(Model model,
                          @PageableDefault(value = 4) Pageable pageable,
                          @RequestParam Optional<String> name
                          ) {
        String nameValue = name.orElse("");
        model.addAttribute("productList", productService.findAllProduct(nameValue,pageable));
        model.addAttribute("nameValue",nameValue);
        return "list";
    }

    @GetMapping("/create")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String createProduct(Product product, Model model) {
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateProduct(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product,Model model){
        model.addAttribute("product",productService.save(product));
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        productService.delete(id);
        return "redirect:/";
    }


}
