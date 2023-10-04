package com.aminenurgynk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aminenurgynk.constant.EndPoint.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTH)
public class AuthController {

    @GetMapping(HELLO)
    public String helloAuth(){
        return "Hello Auth Service";
    }
}
