package com.product.controiler;

import com.product.model.Product;
import com.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String goIndex(@RequestParam(required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("productList", this.productService.findAll(name));
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
    public String updateProduct(Product product) {
        productService.update(product);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        productService.remove(id);
        return "redirect:/";
    }


}
