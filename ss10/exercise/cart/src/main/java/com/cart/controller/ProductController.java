package com.cart.controller;

import com.cart.model.Cart;
import com.cart.model.Product;
import com.cart.service.IProductService;
import com.cart.service.impl.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private CartService cartService;
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/")
    public String showShop(Model model) {
        model.addAttribute("products",productService.findAll());
        return "/shop";
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Integer id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cartService.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cartService.addProduct(productOptional.get());
        return "redirect:/shop";
    }
}
