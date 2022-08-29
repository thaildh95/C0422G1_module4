package com.cart.controller;

import com.cart.model.Product;
import com.cart.service.impl.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@Controller
@SessionAttributes(value = "cart")
public class ShopController {
    @Autowired
    private CartService cartService;

    @GetMapping("/shopping-cart")
    public String goCart(Model model, @SessionAttribute Map<Product, Integer> cart) {
        model.addAttribute("cart", cart);
        model.addAttribute("total", cartService.countTotalPayment());
        return "cart";
    }
}
