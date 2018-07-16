package ru.CreditClub.microservices.account.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @Autowired
    private InMemoryUserDetailsManager userManager;

    @RequestMapping("/auth")
    public String auth(Authentication authentication) {
        return "Hello, " + authentication.getName();
    }

    @RequestMapping("/")
    public String greeting() {
        return "Hello, mad world!";
    }


}
