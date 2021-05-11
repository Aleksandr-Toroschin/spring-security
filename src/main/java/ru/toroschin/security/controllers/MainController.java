package ru.toroschin.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String getHomePage() {
        return "you are at home page";
    }

    @GetMapping("/admin_panel")
    public String adminPage() {
        return "you are at admin panel";
    }

    @GetMapping("/add_user")
    public String addUserPage() {
        return "you are at addUserPage";
    }

    @GetMapping("/view_user")
    public String viewUserPage() {
        return "you are at viewUserPage";
    }

    @GetMapping("/products/add")
    public String addProductPage() {
        return "you are at addProductPage";
    }

    @GetMapping("/products/delete")
    public String deleteProductPage() {
        return "you are at deleteProductPage";
    }

    @GetMapping("/change_authorities")
    public String changeAuthoritiesPage() {
        return "you are at changeAuthoritiesPage";
    }

    @GetMapping("/manager_panel")
    public String managerPanelPage() {
        return "you are at managerPanelPage";
    }

    @GetMapping("/products")
    public String productsPage() {
        return "you are at productsPage";
    }

    @GetMapping("/products/edit_price")
    public String productsEditPage() {
        return "you are at productsEditPage";
    }

    @GetMapping("/profile")
    public String usersPanel() {
        return "you are at usersPanel";
    }

}
