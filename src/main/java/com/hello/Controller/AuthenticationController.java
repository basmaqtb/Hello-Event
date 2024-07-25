package com.hello.Controller;


import com.hello.DTO.AuthenticationRequest;
import com.hello.DTO.AuthenticationResponse;
import com.hello.DTO.RegisterRequest;
import com.hello.Model.Utilisateur;
import com.hello.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(authService.register(request));
    }
    @PostMapping("/registerAdmin")
    public ResponseEntity<AuthenticationResponse> registerAdmin(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(authService.registerAdmin(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(authService.authenticate(request));

    }

    @GetMapping("/affiche")
    public List<Utilisateur> getAllUser() {
        return authService.getAllUser();
    }

    @DeleteMapping("/{id_user}")
    public void deleteCompte(@PathVariable int id_user) {
        authService.deleteCompte(id_user);
    }
}