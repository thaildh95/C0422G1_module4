package com.cart.controller;

import com.cart.model.Cart;
import com.cart.model.Product;
import com.cart.service.IProductService;
import com.cart.service.impl.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
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
        model.addAttribute("products", productService.findAll());
        return "/shop";
    }

    @GetMapping(value = {"/add"})
    public String addToCart(@RequestParam(defaultValue = "0") Integer id, String expression, Model model, @SessionAttribute Map<Product, Integer> cart) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        cartService.changeCart(cart, id, expression);
        model.addAttribute("total", cartService.countTotalPayment());
        model.addAttribute("cart", cart);
        return "cart";
    }
}
