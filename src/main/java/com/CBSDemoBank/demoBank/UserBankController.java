package com.CBSDemoBank.demoBank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank")
public class UserBankController {
    @GetMapping("/users")
    public String hi(){
        return "Hi";
    }
}
