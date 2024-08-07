package com.hello.Controller;

import com.hello.Service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth/User")
@CrossOrigin(origins = "http://localhost:4200/")
public class DashbordController {

    @Autowired
    private AuthenticationService authenticationService;
    @GetMapping("/count")
    public Long countUsers(){
        return authenticationService.count();
    }
}
