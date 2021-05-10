package ru.toroschin.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String getHomePage() {
        return "you are at home page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "you are at admin panel";
    }

    @GetMapping("/manager")
    public String controlPanelPage() {
        return "you are at control panel";
    }

    @GetMapping("/user")
    public String userPage() {
        return "you are at user page";
    }

    @GetMapping("/userspanel/edit")
    public String usersPanelEditPage() {
        return "you are at usersPanelEditPage";
    }

    @GetMapping("/userspanel/add")
    public String usersPanelAddPage() {
        return "you are at usersPanelAddPage";
    }

}
